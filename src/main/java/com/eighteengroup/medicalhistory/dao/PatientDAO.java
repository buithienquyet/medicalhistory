/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.Patient;
import com.eighteengroup.medicalhistory.models.Registration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class PatientDAO {
    public Patient getPatientById(int id){
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "select * from tbl_registation where registation_id=?";
            preparedStatement = con.prepareStatement(sql);
            // Result set get the result of the SQL query
            resultSet = preparedStatement.executeQuery();
            Patient pat= new Patient();
            while (resultSet.next()) {                
                String name=resultSet.getString("patient_name");
                String birthday=resultSet.getString("patient_birthday");
                String phonenumber=resultSet.getString("patient_phonenumber");
                String nation=resultSet.getString("patient_nation");
                String job=resultSet.getString("patient_job");
                String foreigners=resultSet.getString("patient_foreigners");
                String workPlace=resultSet.getString("patient_workplace");
                String numberofhealthinsurance=resultSet.getString("patient_numberofhealthinsurance");
                String addressCity=resultSet.getString("patient_address_city");
                String addressDistrict=resultSet.getString("patient_address_district");
                String addressWards=resultSet.getString("patient_address_wards");
                String addressApartmentnumber=resultSet.getString("patient_address_apartmentnumber");
                String relativePhonenumber=resultSet.getString("patient_relative_phonenumber");
                String relativeAddress=resultSet.getString("patient_relative_address");
                preparedStatement.setInt(1, id);
                pat.setPatientName(name);
                pat.setPatientBirthday(birthday);
                pat.setPatientPhonenumber(phonenumber);
                pat.setPatientNation(nation);
                pat.setPatientJob(job);
                pat.setPatientForeigners(foreigners);
                pat.setPatientWorkplace(workPlace);
                pat.setPatientNumberofhealthinsurance(numberofhealthinsurance);
                pat.setPatientAddressCity(addressCity);
                pat.setPatientAddressDistrict(addressDistrict);
                pat.setPatientAddressWards(addressWards);
                pat.setPatientAddressApartmentnumber(addressApartmentnumber);
                pat.setPatientRelativePhonenumber(relativePhonenumber);
                pat.setPatientRelativeAddress(relativeAddress);
                return pat;
            }
        } catch (Exception ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void insert(Patient pat){
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql =  "insert into tbl_patient values(?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ? )";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, pat.getPatientId());
            preparedStatement.setString(2, pat.getPatientName());
            preparedStatement.setString(3, pat.getPatientBirthday());
            preparedStatement.setString(4, pat.getPatientPhonenumber());
            preparedStatement.setString(5, pat.getPatientNation());
            preparedStatement.setString(6, pat.getPatientJob());
            preparedStatement.setString(7, pat.getPatientForeigners());
            preparedStatement.setString(8, pat.getPatientWorkplace());
            preparedStatement.setString(9, pat.getPatientNumberofhealthinsurance());
            preparedStatement.setString(10, pat.getPatientAddressCity());
            preparedStatement.setString(11, pat.getPatientAddressDistrict());
            preparedStatement.setString(12, pat.getPatientAddressWards());
            preparedStatement.setString(13, pat.getPatientAddressApartmentnumber());
            preparedStatement.setString(14, pat.getPatientRelativePhonenumber());
            preparedStatement.setString(15, pat.getPatientRelativeAddress());
            preparedStatement.executeUpdate();
            
        } catch (Exception ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void delete(int id) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "delete from tbl_patient where patient_id=?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void update(Patient pat){
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "update tbl_patient set patient_name=?, patient_birthday=?, patient_phonenumber=?, patient_nation=?, patient_job=?,"
                    + "patient_foreigners=?, patient_workplace=?, patient_numberofhealthinsurance=?, patient_address_city=?, patient_address_district=?"
                    + "patient_address_wards=?, patient_address_apartmentnumber=?, patient_relative_phonenumber=?, patient_relative_address=? where patient_id=? ";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, pat.getPatientName());
            preparedStatement.setString(2, pat.getPatientBirthday());
            preparedStatement.setString(3, pat.getPatientPhonenumber());
            preparedStatement.setString(4, pat.getPatientNation());
            preparedStatement.setString(5, pat.getPatientJob());
            preparedStatement.setString(6, pat.getPatientForeigners());
            preparedStatement.setString(7, pat.getPatientWorkplace());
            preparedStatement.setString(8, pat.getPatientNumberofhealthinsurance());
            preparedStatement.setString(9, pat.getPatientAddressCity());
            preparedStatement.setString(10, pat.getPatientAddressDistrict());
            preparedStatement.setString(11, pat.getPatientAddressWards());
            preparedStatement.setString(12, pat.getPatientAddressApartmentnumber());
            preparedStatement.setString(13, pat.getPatientRelativePhonenumber());
            preparedStatement.setString(14, pat.getPatientRelativeAddress());
            preparedStatement.setInt(15, pat.getPatientId());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
