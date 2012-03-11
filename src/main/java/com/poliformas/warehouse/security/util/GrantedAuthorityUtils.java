package com.poliformas.warehouse.security.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;

public class GrantedAuthorityUtils {
    public static List<GrantedAuthority> toGrantedAuthority(String... roles){
    	 System.out.println("qqqqqqqqqqqqqqqqq");
        if(roles==null || roles.length==0)return null;
        System.out.println("ppppppppppppp");
        List<GrantedAuthority> authotities = new ArrayList<GrantedAuthority>(roles.length);
        GrantedAuthority ga = null;
        for(String role:roles){
            ga = new IofGrantedAuthority(role);
            authotities.add(ga);
        }
        return authotities;
    }
        public static GrantedAuthority toGrantedAuthority(String role){
        if(role==null){
        System.out.println("rol nulo");
        	return null;
        }
        GrantedAuthority au =new IofGrantedAuthority(role);
        System.out.println("555550"  + au.getAuthority());
        return au;
    }
}
class IofGrantedAuthority implements  GrantedAuthority{

    private String _role;
    public IofGrantedAuthority(String role){
        _role = role;
    }
    public String getAuthority() {
        return _role;
    }

}