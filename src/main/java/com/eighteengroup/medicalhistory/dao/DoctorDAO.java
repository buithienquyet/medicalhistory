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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DoctorDAO {
    public Doctor getDoctorById(int id){
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "select * from tbl_doctor where doctor_id=?";
            preparedStatement = con.prepareStatement(sql);
            Doctor doc = new Doctor();
            while (resultSet.next()) { 
                String name = resultSet.getString("doctor_name");
                String address = resultSet.getString("doctor_address");
                String birthday = resultSet.getString("doctor_birthday");
                String phoneNumber = resultSet.getString("doctor_phoneNumber");
                String createdDate=resultSet.getString("doctor_createddate");
                String updateDate = resultSet.getString("doctor_updateddate");
                String jobTitle = resultSet.getString("doctor_jobTitle");
                String faculty = resultSet.getString("doctor_faculty");
                long loginCount=resultSet.getLong("doctor_loginCount");
                String lastLogin=resultSet.getString("doctor_lastLogin");
                preparedStatement.setInt(1, id);
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
                return doc;
            }
        } catch (Exception ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void insert(Doctor doc){
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "insert into tbl_doctor values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(DoctorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void delete(int id){
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
    public void update(Doctor doc){
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "update tbl_doctor set doctor_name=?, doctor_birthday=?, doctor_department=?, doctor_position=?, doctor_createddate=?, doctor_updateddate=? where doctor_id=?";
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
