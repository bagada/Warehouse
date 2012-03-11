package com.poliformas.warehouse.integration.dao;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

public class WarehouseDaoAuthenticationProvider extends DaoAuthenticationProvider{
	
	@Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        Object salt = null;
        System.out.println("asdasdasdasdasdasdasdsadsafdsfsdfsdfsd");
        if (getSaltSource() != null) {
            salt = getSaltSource().getSalt(userDetails);
        }
  
        if (authentication.getCredentials() == null) {
            throw new BadCredentialsException(messages.getMessage(
            		"AbstractUserDetailsAuthenticationProvider.badCredentials", "Bad credentials"),
            		isIncludeDetailsObject() ? userDetails : null);
        }
  
        String presentedPassword = authentication.getCredentials().toString();
  
        if (!getPasswordEncoder().isPasswordValid(userDetails.getPassword(), presentedPassword, salt)) {
            
            throw new BadCredentialsException(messages.getMessage(
                    "AbstractUserDetailsAuthenticationProvider.badCredentials", "Bad credentials - Wrong password"),
                    isIncludeDetailsObject() ? userDetails : null);
        }
        
    }
}
