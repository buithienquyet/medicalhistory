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
@WebServlet("/districts")
public class Districts extends HttpServlet{
    @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("application/json; charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            String provinceId = request.getParameter("provinceId");
            try (PrintWriter out = response.getWriter()) {

                DistrictDAOInterface districtDAO=new DistrictDAO();
                ArrayList<District> list=districtDAO.getDistrictByProvinceId(provinceId);
                Gson gson = new Gson();

                out.println(gson.toJson(list));
                out.close();
            }
        }
}
