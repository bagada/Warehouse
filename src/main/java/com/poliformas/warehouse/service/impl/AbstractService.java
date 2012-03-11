package com.poliformas.warehouse.service.impl;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.poliformas.warehouse.integration.entity.User;

public class AbstractService {

	//private final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(getClass());

    //protected org.apache.commons.logging.Log getLog() {
      //  return _log;
    //}

    public User getCurrentUser() {
        UserDetails userDetails = null;
        try {
            userDetails = (UserDetails) SecurityContextHolder.getContext().
                    getAuthentication().getPrincipal();
        } catch (Exception ex) {
            // exception occurs is we are invoking this method from an unauthenticated resource
            return null;
        }
        if (userDetails instanceof MyUserDetails) {
            return ((MyUserDetails) userDetails).getUser();
        }
        return null;
    }
}