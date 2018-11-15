/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.servlet;

import com.eighteengroup.medicalhistory.models.User;
import com.eighteengroup.medicalhistory.utils.AppUtils;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author quyet
 */
@WebServlet(name = "Home", urlPatterns = {""})
public class Home extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = AppUtils.getLoginedUser(request.getSession());

        if (user != null) {
            for (int i = 0; i < user.getRoles().size(); i++) {
                switch (user.getRoles().get(i)) {
                    case "DOCTOR": {
                        response.sendRedirect("/doctor.jsp");
                        break;
                    }
                    case "PATIENT": {
                        response.sendRedirect("/patient.jsp");
                        break;
                    }
                    default: {
                        response.sendRedirect("/error.html");
                    }
                }
            }
        } else {
            response.sendRedirect("/login.html");    
        }
    }
}
