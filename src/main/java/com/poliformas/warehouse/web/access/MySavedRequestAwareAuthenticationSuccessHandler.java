package com.poliformas.warehouse.web.access;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;

import com.poliformas.warehouse.security.model.RolePriorityUrl;

public class MySavedRequestAwareAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    private Map<String, RolePriorityUrl> _rolePriority = new HashMap<String, RolePriorityUrl>();
    private RequestCache requestCache = new HttpSessionRequestCache();

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) throws ServletException, IOException {
        /*
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().
        getAuthentication().getPrincipal();
        logger.info(_rolePriorities);
        //UsernamePasswordAuthenticationFilter
        //FORM_LOGIN_FILTER
        System.out.print(_rolePriorities);
        Collection<GrantedAuthority> userAuthorities = userDetails.getAuthorities();
         */
        //super.onAuthenticationSuccess(request, response, authentication);
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().
                getAuthentication().getPrincipal();


        // Use the DefaultSavedRequest URL
        String targetUrl = getTargetUrl(userDetails.getAuthorities()); //"/start";//savedRequest.getRedirectUrl();
        logger.info("Redirecting to DefaultSavedRequest Url: " + targetUrl);
        getRedirectStrategy().sendRedirect(request, response, targetUrl);
    }

    protected String getTargetUrl(Collection<GrantedAuthority> authorities) {
        if (authorities.size() == 1) {
        	System.out.println("---------------------getTarget"+authorities.iterator().next().getAuthority());
        	try{
        	_rolePriority.get(authorities.iterator().next().getAuthority()).getUrlLoginSuccess();
        	}catch (Exception e) {
				e.printStackTrace();
			}
        	
        	return _rolePriority.get(authorities.iterator().next().getAuthority()).getUrlLoginSuccess();
        } else {
            //@@TODO: implement me!!!
            throw new UnsupportedOperationException("Not yet implemented");
        }        
    }

    /**
     * @return the _rolePriority
     */
    public Map<String, RolePriorityUrl> getRolePriority() {
        return _rolePriority;
    }

    /**
     * @param rolePriority the _rolePriority to set
     */
    public void setRolePriority(Map<String, RolePriorityUrl> rolePriority) {
        this._rolePriority = rolePriority;
    }
}

