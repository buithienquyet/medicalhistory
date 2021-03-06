package com.eighteengroup.medicalhistory.config;

import java.util.*;

/**
 *
 * @author quyet
 */
public class SecurityConfig {
    
    public static final String ROLE_PATIENT = "PATIENT";
    public static final String ROLE_DOCTOR = "DOCTOR";
    public static final String ROLE_ADMIN = "ADMIN";
    public static final String myPrivateKey = "btqabc!@#";
 
    private static final HashMap<String, List<String>> mapConfig = new HashMap<String, List<String>>();
 
    static {
        init();
    }
 
    private static void init() {

        List<String> urlPatterns1 = new ArrayList<String>();
        
        urlPatterns1.add("^/patient$");
        urlPatterns1.add("^/doctor\\.jsp$");
  //      urlPatterns1.add("^/registrations$");  
//        urlPatterns1.add("/learning-data");
//        urlPatterns1.add("/medical-histories");
 
        mapConfig.put(ROLE_DOCTOR, urlPatterns1);
        
        List<String> urlPatterns2 = new ArrayList<String>();
                
//        urlPatterns2.add("/profile");
//        urlPatterns2.add("/my-medical-histories");        
        urlPatterns2.add("^/patient\\.jsp$");          
 
        mapConfig.put(ROLE_PATIENT, urlPatterns2);
        
        
        List<String> urlPatterns3 = new ArrayList<String>();
                
//        urlPatterns2.add("/profile");
//        urlPatterns2.add("/my-medical-histories");        
        urlPatterns3.add("^/admin-user-list\\.jsp$");          
 
        mapConfig.put(ROLE_ADMIN, urlPatterns3);
        
        
    }
 
    public static Set<String> getAllAppRoles() {
        return mapConfig.keySet();
    }
 
    public static List<String> getUrlPatternsForRole(String role) {
        return mapConfig.get(role);
    }
    
}
