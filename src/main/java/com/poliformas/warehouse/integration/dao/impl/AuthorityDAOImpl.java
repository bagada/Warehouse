package com.poliformas.warehouse.integration.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.poliformas.warehouse.integration.dao.AuthorityDAO;
import com.poliformas.warehouse.integration.entity.Authority;

public class AuthorityDAOImpl extends HibernateDaoSupport implements AuthorityDAO{
	
	public void saveAuthority(Authority authority){
		getHibernateTemplate().save(authority);
	}
	
	public List<Authority> getAuthoritiesByUsername(final int idUser){
		List<Authority> authorities = (List<Authority>)getHibernateTemplate().execute(new HibernateCallback<List<Authority>>(){
			public List<Authority> doInHibernate(Session session) throws HibernateException, SQLException{
				Criteria criteria = session.createCriteria(Authority.class);
				criteria.add(Restrictions.eq("idUser", idUser));
				List results = criteria.list();
				
				int array[] = {1,2,3,4};
				int tam = array.length;
				
				if(results!=null)
					System.out.println("No llega nulo auto");
				return (List<Authority>)results;
			}
		}
		);
		return authorities;
	}
	
	
	
}
