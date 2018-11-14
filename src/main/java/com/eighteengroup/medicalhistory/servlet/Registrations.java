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

@RolesAllowed("ROLE_DOCTOR")
@WebServlet("/registrations")

public class Registrations extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Home</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>registrations</h1>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
        
        
        // tao RegDAO

    }
}
