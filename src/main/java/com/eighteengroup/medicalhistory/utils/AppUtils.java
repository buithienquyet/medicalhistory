package com.eighteengroup.medicalhistory.utils;

import com.eighteengroup.medicalhistory.models.User;
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
 
    // Lấy thông tin người dùng lưu trữ trong Session.
    public static User getLoginedUser(HttpSession session) {
        User loginedUser = (User) session.getAttribute("loginedUser");
        return loginedUser;
    }
  
}
