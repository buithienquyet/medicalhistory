package com.eighteengroup.medicalhistory.utils;

/**
 *
 * @author quyet
 */
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import com.eighteengroup.medicalhistory.config.SecurityConfig;
import java.util.regex.Pattern;
 
public class SecurityUtils {
 
    // Kiểm tra 'request' này có bắt buộc phải đăng nhập hay không.
    public static boolean isSecurityPage(HttpServletRequest request) {
        String url = request.getServletPath();
 
        Set<String> roles = SecurityConfig.getAllAppRoles();
        boolean isSecurity = false;
 
        for (String role : roles) {            
            List<String> urlPatterns = SecurityConfig.getUrlPatternsForRole(role);
           
            
            for (String urlPattern : urlPatterns)
            {
                if (url.matches(urlPattern))
                {
                    isSecurity = true;
                    break;
                }
            } 
            
            if (isSecurity)
                break;            
        }
        
        return isSecurity;
    }
 
    // Kiểm tra 'request' này có vai trò phù hợp hay không?
    public static boolean hasPermission(HttpServletRequest request) {
        String url = request.getServletPath();
 
        Set<String> allRoles = SecurityConfig.getAllAppRoles();
        boolean res = false;
 
        for (String role : allRoles) {
            if (!request.isUserInRole(role)) {
                continue;
            }
            List<String> urlPatterns = SecurityConfig.getUrlPatternsForRole(role);
            
            for (String urlPattern : urlPatterns)
            {
                if (url.matches(urlPattern))
                {
                    res = true;
                    break;
                }
            }
        }
        
        return res;
    }
}