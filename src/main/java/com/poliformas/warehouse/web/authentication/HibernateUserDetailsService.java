package com.poliformas.warehouse.web.authentication;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.poliformas.warehouse.integration.dao.AuthorityDAO;
import com.poliformas.warehouse.integration.dao.UserDAO;
import com.poliformas.warehouse.integration.dao.UserPasswordDAO;
import com.poliformas.warehouse.integration.entity.Authority;
import com.poliformas.warehouse.integration.entity.User;
import com.poliformas.warehouse.integration.entity.UserPassword;
import com.poliformas.warehouse.security.util.GrantedAuthorityUtils;
import com.poliformas.warehouse.service.impl.MyUserDetails;

public class HibernateUserDetailsService extends HibernateDaoSupport implements UserDetailsService, Serializable{

    private final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(getClass());

    @Autowired
    private AuthorityDAO _authorityDAO;
    @Autowired
    private UserDAO _userDao;
    @Autowired
    private UserPasswordDAO _userPasswordDAO;
    
    public UserDetails loadUserByUsername(final String userName) throws UsernameNotFoundException, DataAccessException {
        System.out.println("////////////////////////////////" + userName );
    	MyUserDetails ud =
        (MyUserDetails) getHibernateTemplate().execute(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
            	System.out.println("--------- entra");
            	User us= null;
            	try{
            	 us =_userDao.findByUsername(userName);
            	}catch(Exception e){
            		e.printStackTrace();
            	}
            	// Null if the user does not exists or there is more then one user with the same username
            	System.out.println("--------- entra");
                if(us==null)return null;
            	System.out.println("--------- entra");
                //Now we must search for user's password
            	UserPassword password = null;
            	try{
                 password = (UserPassword) session.createCriteria(UserPassword.class)
                        .add(Restrictions.eq("idUser", String.valueOf(us.getIdUser()))).uniqueResult();
            	}catch(Exception e){
            		e.printStackTrace();
            		
            	}
                        //.add(Restrictions.eq("passwordEnabled", UtilConstants.YES))
                System.out.println("aqui ya"+ password.getPassword());
               // Null if the user password does not exists or there is more then one user with the same username
              if(password==null)return null;//@@Review: disabled password or sosmething will be done in XXX
              UserDetails userDetails = null;
              try{
               userDetails  = createUserDetails(us,password);
              }catch(Exception ex){
            	  ex.printStackTrace();
              }
              System.out.println(userDetails.getAuthorities().size());
              System.out.println(userDetails.getPassword());
               return userDetails;
            }
        });
        if(ud==null)
            throw new UsernameNotFoundException(userName + "not found");
        return ud;
    }

    private MyUserDetails createUserDetails(User user, UserPassword password){
        MyUserDetails userDetails = new MyUserDetails();
        userDetails.setUser(user);
        userDetails.setAccountNonExpired(true);//@@TODO: check
        userDetails.setAccountNonLocked(true);//@@TODO: check
        userDetails.setCredentialsNonExpired(true);//@@TODO: check
        userDetails.setEnabled(true);//@@TODO: check
        userDetails.setUsername(user.getUsername());
        userDetails.setPassword(password.getPassword());
        //serDetails.setUsername(user.getUserEmail());
        List<GrantedAuthority> authorities = getAuthorities(user);
        System.out.println("Size of autorities" + authorities.size());
        if(authorities==null || authorities.size()==0){
            System.out.println("No authorities (roles) for this user: " + user.getUsername());
            return null;}
        for(GrantedAuthority ga:authorities)userDetails.addAuthority(ga);
        return userDetails;
    }

    private List<GrantedAuthority> getAuthorities(User user){
        List<Authority> roles = _authorityDAO.getAuthoritiesByUsername(user.getIdUser());
        if(roles!=null){
        	System.out.println("esto debe de pasar" + roles.size() );
        }
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority> (roles.size());
        for(Authority uru: roles){
        	System.out.println(uru.getAuthority());
            authorities.add(
                GrantedAuthorityUtils.toGrantedAuthority(uru.getAuthority())
                            );
        }
        return authorities;
    }
}
