/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.filter;

import com.eighteengroup.medicalhistory.utils.AppUtils;
import com.eighteengroup.medicalhistory.utils.SecurityUtils;
import com.eighteengroup.medicalhistory.request.UserRoleRequestWrapper;
import com.eighteengroup.medicalhistory.models.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class SecurityFilter implements Filter {

    public SecurityFilter() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        String servletPath = request.getServletPath();
        System.out.println(request.getPathInfo());

        // Thông tin người dùng đã được lưu trong Session
        // (Sau khi đăng nhập thành công).
        User loginedUser = AppUtils.getLoginedUser(request.getSession());

        if (loginedUser != null && servletPath.equals("/login.html")) {
            response.sendRedirect("/");
        }
                
        HttpServletRequest wrapRequest = request;

        if (loginedUser != null) {
            // User Name
            String userName = loginedUser.getUserName();

            // Các vai trò (Role).
            List<String> roles = loginedUser.getRoles();

            // Gói request cũ bởi một Request mới với các thông tin userName và Roles.
            wrapRequest = new UserRoleRequestWrapper(userName, roles, request);
        }

        // Các trang bắt buộc phải đăng nhập.
        if (SecurityUtils.isSecurityPage(request)) {

            // Nếu người dùng chưa đăng nhập,
            // Redirect (chuyển hướng) tới trang đăng nhập.
            if (loginedUser == null) {
                response.sendRedirect("/login.html");
                return;
            }

            // Kiểm tra người dùng có vai trò hợp lệ hay không?
            boolean hasPermission = SecurityUtils.hasPermission(wrapRequest);
            if (!hasPermission) {

                response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) {
                    out.println("Permissions denied");
                    out.close();
                }
                return;
            }
        }

        chain.doFilter(wrapRequest, response);
    }

    @Override
    public void init(FilterConfig fConfig) throws ServletException {

    }
}
