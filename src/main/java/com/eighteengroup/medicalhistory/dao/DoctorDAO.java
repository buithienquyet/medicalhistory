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
public class DoctorDAO implements DoctorDAOInterface {

    public Doctor getDoctorByUserId(long id) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "SELECT * FROM tbl_user JOIN tbl_doctor ON tbl_user.user_id = tbl_doctor.user_id where tbl_user.user_id=?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            resultSet = preparedStatement.executeQuery();
            Doctor doc = new Doctor();
            while (resultSet.next()) {
                String username = resultSet.getString("user_userName");
                String birthday = resultSet.getString("user_birthday");
                String address = resultSet.getString("user_address");
                String phoneNumber = resultSet.getString("user_phoneNumber");
                String createdDate = resultSet.getString("user_createdDate");
                String updatedDate = resultSet.getString("user_updatedDate");
                String lastLogin = resultSet.getString("user_lastLogin");
                String password = resultSet.getString("user_password");
                String firstName = resultSet.getString("user_firstname");
                String lastName = resultSet.getString("user_lastname");

                String jobTitle = resultSet.getString("doctor_jobTitle");
                String faculty = resultSet.getString("doctor_faculty");
                long roomId = resultSet.getLong("room_id");
                //String role = resultSet.getString("role");

                ArrayList<String> roles = new ArrayList<String>();
                roles.add(resultSet.getString("user_role"));
                doc.setRoles(roles);

                doc.setUserName(username);
                doc.setAddress(address);
                doc.setBirthday(birthday);
                doc.setPhoneNumber(phoneNumber);
                doc.setCreatedDate(createdDate);
                doc.setUpdatedDate(updatedDate);
                doc.setJobTitle(jobTitle);
                doc.setFaculty(faculty);
                doc.setLastLogin(lastLogin);
                doc.setPassword(password);
                doc.setRoomId(roomId);
                doc.setFirstName(firstName);
                doc.setLastName(lastName);

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
