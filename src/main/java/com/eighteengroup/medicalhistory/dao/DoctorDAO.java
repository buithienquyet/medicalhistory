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
            String sql = "select * from tbl_doctor where doctor_id=" + id;
            preparedStatement = con.prepareStatement(sql);
            Doctor doc = new Doctor();
            while (resultSet.next()) {                
                int dotId = resultSet.getInt("doctor_id");
                String name = resultSet.getString("doctor_name");
                String birthday = resultSet.getString("doctor_birthday");
                String department = resultSet.getString("doctor_department");
                String position = resultSet.getString("doctor_position");
                String createdDate=resultSet.getString("doctor_createddate");
                String updateDate = resultSet.getString("doctor_updateddate");
                doc.setDoctorId(dotId);
                doc.setDoctorName(name);
                doc.setDoctorBirthday(birthday);
                doc.setDoctorDepartment(department);
                doc.setDoctorPosition(position);
                doc.setDoctorCrestedDate(createdDate);
                doc.setDoctorUpdatedDate(updateDate);
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
            String sql = "insert into tbl_doctor values(?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, doc.getDoctorId());
            preparedStatement.setString(2, doc.getDoctorName());
            preparedStatement.setString(3, doc.getDoctorBirthday());
            preparedStatement.setString(4, doc.getDoctorDepartment());
            preparedStatement.setString(5, doc.getDoctorPosition());
            preparedStatement.setString(6, doc.getDoctorCrestedDate());
            preparedStatement.setString(7, doc.getDoctorUpdatedDate());
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
            preparedStatement.setInt(1, id);
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
            preparedStatement.setString(1, doc.getDoctorName());
            preparedStatement.setString(2, doc.getDoctorBirthday());
            preparedStatement.setString(3, doc.getDoctorDepartment());
            preparedStatement.setString(4, doc.getDoctorPosition());
            preparedStatement.setString(5, doc.getDoctorCrestedDate());
            preparedStatement.setString(6, doc.getDoctorUpdatedDate());
            preparedStatement.setInt(7, doc.getDoctorId());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(DoctorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
