package com.eighteengroup.medicalhistory.servlet;

import com.eighteengroup.medicalhistory.dao.UserDAO;
import com.eighteengroup.medicalhistory.dao.UserDAOInterface;
import com.eighteengroup.medicalhistory.models.User;
import com.eighteengroup.medicalhistory.utils.AppUtils;
import com.eighteengroup.medicalhistory.utils.MD5;
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
@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user;
        String username, password;
        try {
            username = request.getParameter("username");
            password = request.getParameter("password");
            UserDAOInterface userDAO = new UserDAO();

            String md5Pass = MD5.getMD5Hex(password);
            user = userDAO.getUser(username, md5Pass);

        } catch (Exception e) {
            user = null;
        }

        if (user == null) {
            response.sendRedirect("/login.html");
        } else {
            AppUtils.storeLoginedUser(request.getSession(), user);
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
                    case "ADMIN": {
                        response.sendRedirect("/admin.jsp");
                        break;
                    }
                    default: {
                        response.sendRedirect("/error.html");
                    }
                }
            }

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("/login.html");
    }
}
