/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.servlet;

import com.eighteengroup.medicalhistory.dao.*;
import com.eighteengroup.medicalhistory.models.*;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Provider;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet("/faculties")

public class Faculties extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {

            FacultyDAOInterface facultyDAO = new FacultyDAO();
            ArrayList<Faculty> list = facultyDAO.getFaculties();
            Gson gson = new Gson();

            out.println(gson.toJson(list));
            out.close();
        }
    }
}
