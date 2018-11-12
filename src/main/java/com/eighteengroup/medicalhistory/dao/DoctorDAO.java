/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.Doctor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DoctorDAO {

    public Doctor getDoctorById(int id) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "select * from tbl_doctor where doctor_id=?";
            preparedStatement = con.prepareStatement(sql);
            Doctor doc = new Doctor();
            while (resultSet.next()) {
                String name = resultSet.getString("userName");
                String address = resultSet.getString("address");
                String birthday = resultSet.getString("birthday");
                String phoneNumber = resultSet.getString("phoneNumber");
                String createdDate = resultSet.getString("createdDate");
                String updateDate = resultSet.getString("updatedDate");
                String jobTitle = resultSet.getString("doctor_jobTitle");
                String faculty = resultSet.getString("doctor_faculty");
                long loginCount = resultSet.getLong("loginCount");
                String lastLogin = resultSet.getString("lastLogin");
                String password = resultSet.getString("password");
                //String role = resultSet.getString("role");

                ArrayList<String> roles = new ArrayList<String>();
                roles.add(resultSet.getString("role"));
                doc.setRoles(roles);

                preparedStatement.setLong(1, id);
                doc.setUserName(name);
                doc.setAddress(address);
                doc.setBirthday(birthday);
                doc.setPhoneNumber(phoneNumber);
                doc.setCreatedDate(createdDate);
                doc.setUpdatedDate(updateDate);
                doc.setJobTitle(jobTitle);
                doc.setFaculty(faculty);
                doc.setLoginCount(loginCount);
                doc.setLastLogin(lastLogin);
                doc.setPassword(password);
                return doc;
            }
        } catch (Exception ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insert(Doctor doc) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "insert into tbl_doctor values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setLong(1, doc.getId());
            preparedStatement.setString(2, doc.getUserName());
            preparedStatement.setString(3, doc.getAddress());
            preparedStatement.setString(4, doc.getBirthday());
            preparedStatement.setString(5, doc.getPhoneNumber());
            preparedStatement.setString(6, doc.getCreatedDate());
            preparedStatement.setString(7, doc.getUpdatedDate());
            preparedStatement.setString(8, doc.getJobTitle());
            preparedStatement.setString(9, doc.getFaculty());
            preparedStatement.setLong(10, doc.getLoginCount());
            preparedStatement.setString(11, doc.getLastLogin());
            preparedStatement.setString(12, doc.getPassword());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(DoctorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int id) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "delete from tbl_doctor where doctor_id=?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(DoctorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Doctor doc) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "update tbl_doctor set doctor_name=?, doctor_birthday=?, doctor_address=?, doctor_phoneNumber=?, doctor_createdDate=?, doctor_updatedDate=?,"
                    + "doctor_jobTitle=?, doctor_faculty=?, doctor_loginCount=?, doctor_lastLogin=? where doctor_id=?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, doc.getUserName());
            preparedStatement.setString(2, doc.getAddress());
            preparedStatement.setString(3, doc.getBirthday());
            preparedStatement.setString(4, doc.getPhoneNumber());
            preparedStatement.setString(5, doc.getCreatedDate());
            preparedStatement.setString(6, doc.getUpdatedDate());
            preparedStatement.setString(7, doc.getJobTitle());
            preparedStatement.setString(8, doc.getFaculty());
            preparedStatement.setLong(9, doc.getLoginCount());
            preparedStatement.setString(10, doc.getLastLogin());
            preparedStatement.setLong(11, doc.getId());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(DoctorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
