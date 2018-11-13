package com.eighteengroup.medicalhistory.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hoa
 */
public class DatabaseConnection {
    String conStr = "jdbc:mysql://localhost/medicalhistory?useSSL=false&characterEncoding=utf-8";
    String username = "medicalhistory";
    String password = "abc123!@#";

    public Connection getConnection() throws Exception {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(conStr, username, password);
        } catch (Exception e) {
            throw e;
        }
        return con;
    }
}
