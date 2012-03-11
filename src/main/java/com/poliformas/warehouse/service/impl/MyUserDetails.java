package com.poliformas.warehouse.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;

import com.poliformas.warehouse.integration.entity.User;


//@Service("userDetailsService")
public class MyUserDetails implements org.springframework.security.core.userdetails.UserDetails {
	 private User _user;
	    private String _password;
	    private String _username;
	    private boolean _accountNonExpired;
	    private boolean _accountNonLocked;
	    private boolean _credentialsNonExpired;
	    private boolean _enabled;
	    private List<GrantedAuthority> _authotities;



	    public void addAuthority(GrantedAuthority authority){
	        if(_authotities==null)_authotities=new ArrayList<GrantedAuthority>();
	        _authotities.add(authority);
	    }
	    public Collection<GrantedAuthority> getAuthorities() {
	        return _authotities;
	    }

	    /**
	     * @return the _user
	     */
	    public User getUser() {
	        return _user;
	    }

	    /**
	     * @param user the _user to set
	     */
	    public void setUser(User user) {
	        this._user = user;
	    }

	    /**
	     * @return the _password
	     */
	    public String getPassword() {
	        return _password;
	    }

	    /**
	     * @param password the _password to set
	     */
	    public void setPassword(String password) {
	        this._password = password;
	    }

	    /**
	     * @return the _username
	     */
	    public String getUsername() {
	        return _username;
	    }

	    /**
	     * @param username the _username to set
	     */
	    public void setUsername(String username) {
	        this._username = username;
	    }

	    /**
	     * @return the _accountNonExpired
	     */
	    public boolean isAccountNonExpired() {
	        return _accountNonExpired;
	    }

	    /**
	     * @param accountNonExpired the _accountNonExpired to set
	     */
	    public void setAccountNonExpired(boolean accountNonExpired) {
	        this._accountNonExpired = accountNonExpired;
	    }

	    /**
	     * @return the _accountNonLocked
	     */
	    public boolean isAccountNonLocked() {
	        return _accountNonLocked;
	    }

	    /**
	     * @param accountNonLocked the _accountNonLocked to set
	     */
	    public void setAccountNonLocked(boolean accountNonLocked) {
	        this._accountNonLocked = accountNonLocked;
	    }

	    /**
	     * @return the _credentialsNonExpired
	     */
	    public boolean isCredentialsNonExpired() {
	        return _credentialsNonExpired;
	    }

	    /**
	     * @param credentialsNonExpired the _credentialsNonExpired to set
	     */
	    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
	        this._credentialsNonExpired = credentialsNonExpired;
	    }

	    /**
	     * @return the _enabled
	     */
	    public boolean isEnabled() {
	        return _enabled;
	    }

	    /**
	     * @param enabled the _enabled to set
	     */
	    public void setEnabled(boolean enabled) {
	        this._enabled = enabled;
	    }

	
	
	
	
}
