package com.eighteengroup.medicalhistory.utils;

import com.eighteengroup.medicalhistory.models.User;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.http.HttpSession;

/**
 *
 * @author quyet
 */
public class AppUtils {  
    // Lưu trữ thông tin người dùng vào Session.
    public static void storeLoginedUser(HttpSession session, User loginedUser) {       
        session.setAttribute("loginedUser", loginedUser);
    }

    public static void removeLoginedUser(HttpSession session) {     
        session.removeAttribute("loginedUser");       
    }
    // Lấy thông tin người dùng lưu trữ trong Session.
    public static User getLoginedUser(HttpSession session) {
        User loginedUser = (User) session.getAttribute("loginedUser");
        return loginedUser;
    }
    
    public static String getCurrentDate()
    {
       DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	return dateFormat.format(date);
    }        
  
}
