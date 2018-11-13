/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author quyet
 */
public class UserDAO implements UserDAOInterface {

    @Override
    public User getUser(String username, String password) {
        try {
            Connection con;
            User user;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "select * from tbl_Doctor where username=? and password =?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();            
            while (resultSet.next()) {
                user = new User();
                long id = resultSet.getLong("id");
                String name = resultSet.getString("username");
                String dbRoles = resultSet.getString("roles");
                ArrayList<String> roles = new ArrayList<String>();
                for(String item : dbRoles.split(","))
                {
                    roles.add(item);
                }
                user.setRoles(roles);
//                String password = resultSet.getString("password");
//                String address = resultSet.getString("doctor_address");
//                String birthday = resultSet.getString("doctor_birthday");
//                String phoneNumber = resultSet.getString("doctor_phoneNumber");
//                String createdDate=resultSet.getString("doctor_createddate");
//                String updateDate = resultSet.getString("doctor_updateddate");
//                String jobTitle = resultSet.getString("doctor_jobTitle");
//                String faculty = resultSet.getString("doctor_faculty");
//                long loginCount = resultSet.getLong("doctor_loginCount");
//                String lastLogin=resultSet.getString("doctor_lastLogin");
                user.setUserName(name);               
//                user.setPassword();
//                user.setAddress(address);
//                user.setBirthday(birthday);
//                user.setPhoneNumber(phoneNumber);
//                user.setCreatedDate(createdDate);
//                user.setUpdatedDate(updateDate);
//                user.setLoginCount(loginCount);
//                user.setLastLogin(lastLogin);
                return user;
            }
            return null;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
}
