package com.eighteengroup.medicalhistory.servlet;

import com.eighteengroup.medicalhistory.dao.*;
import com.eighteengroup.medicalhistory.models.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eighteengroup.medicalhistory.utils.*;
import com.google.gson.Gson;
import java.util.ArrayList;

@WebServlet("/registrations")

public class Registrations extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            RegistrationDAOInterface registrationDAO = new RegistrationDAO();
            ArrayList<Registration> list = registrationDAO.getRegistrationsByDate();
            Gson gson = new Gson();                                    
            
            out.println(gson.toJson(list));          
            out.close();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
         String message ="";
        try {
           String currentDate = AppUtils.getCurrentDate();
        String faculty = request.getParameter("faculty");
        System.out.println(faculty);
        String reason = request.getParameter("reason");
        System.out.println(reason);
        String date = request.getParameter("date");
        System.out.println(date);
        String pathologicalProcess = request.getParameter("pathologicalProcess");
        System.out.println(pathologicalProcess);
        String story = request.getParameter("story");
        System.out.println(story);

        //tao doi tuong
        RegistrationDAO registrationDAO = new RegistrationDAO();
        Registration registration=new Registration();
        registration.setRegistationFaculty(faculty);
        registration.setRegistationReason(reason);
        registration.setRegistationDate(date);
        registration.setRegistationPathologicalprocess(pathologicalProcess);
        registration.setRegistationDiseaseprofile(story);
        registration.setRegistatioCreatedDate(currentDate);
        registration.setRegistationUpdatedDate(currentDate);
        registrationDAO.insert(registration);
        message ="ok";
        System.out.println("Đăng ký thành công");
        } catch (Exception e) {
            message ="error";
        }
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.print(message);           
            out.close();
        }
        
        
        // tao RegDAO

    }
}
