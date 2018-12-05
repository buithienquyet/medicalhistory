/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.servlet;

import com.eighteengroup.medicalhistory.dao.*;
import com.eighteengroup.medicalhistory.models.*;
import com.eighteengroup.medicalhistory.utils.MD5;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet("/users")
public class Users extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {

            UserDAOInterface userDAO = new UserDAO();
            ArrayList<User> list = userDAO.getUser();
            Gson gson = new Gson();

            out.println(gson.toJson(list));
            out.close();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {

            response.setContentType("application/json; charset=UTF-8");
            response.setCharacterEncoding("UTF-8");

            User user = new User();
            user.setUserName(request.getParameter("userName"));
            user.setFirstName(request.getParameter("firstName"));
            user.setLastName(request.getParameter("lastName"));
            user.setAddress(request.getParameter("address"));
            user.setPhoneNumber(request.getParameter("phoneNumber"));
            ArrayList<String> roles = new ArrayList<String>();
            roles.add(request.getParameter("role"));
            user.setRoles(roles);
            user.setPassword(MD5.getMD5Hex(request.getParameter("password")));
            UserDAOInterface userDAO = new UserDAO();

            userDAO.insert(user);

            out.println("ok");
            out.close();

        } catch (Exception ex) {
             out.println("error");
             out.close();
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
