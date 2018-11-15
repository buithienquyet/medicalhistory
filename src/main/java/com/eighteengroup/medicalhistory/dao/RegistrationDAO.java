package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoa
 */
public class RegistrationDAO {

    public Registration getRegistrationById(int id) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;

            String sql = "select * from tbl_registation where registation_id= ?";

            preparedStatement = con.prepareStatement(sql);
            // Result set get the result of the SQL query
            resultSet = preparedStatement.executeQuery();
            Registration res = new Registration();

            while (resultSet.next()) {
                String faculty = resultSet.getString("registation_faculty");
                String date = resultSet.getString("registation_date");
                String reason = resultSet.getString("registation_reason");
                String pathologicalprocess = resultSet.getString("registation_pathologicalprocess");
                String diseaseprofile = resultSet.getString("registation_diseaseprofile");
                String createdDate = resultSet.getString("registation_createddate");
                String updatedDate = resultSet.getString("registation_updateddate");
                preparedStatement.setInt(1, id);
                res.setRegistationFaculty(faculty);
                res.setRegistationDate(date);
                res.setRegistationReason(reason);
                res.setRegistationPathologicalprocess(diseaseprofile);
                res.setRegistationDiseaseprofile(pathologicalprocess);
                res.setRegistatioCreatedDate(createdDate);
                res.setRegistationUpdatedDate(updatedDate);
                return res;
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public void insert(Registration reg) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "insert into tbl_registation(registation_faculty,registation_date,registation_reason,registation_pathologicalprocess,"
                    + "registation_diseaseprofile,registation_createddate,registation_updateddate) values( ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = con.prepareStatement(sql);
            // preparedStatement.setInt(1, reg.getRegistationId());
            preparedStatement.setString(1, reg.getRegistationFaculty());
            preparedStatement.setString(2, reg.getRegistationDate());
            preparedStatement.setString(3, reg.getRegistationReason());
            preparedStatement.setString(4, reg.getRegistationPathologicalprocess());
            preparedStatement.setString(5, reg.getRegistationDiseaseprofile());
            preparedStatement.setString(6, reg.getRegistatioCreatedDate());
            preparedStatement.setString(7, reg.getRegistationUpdatedDate());

            // Result set get the result of the SQL query
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(RegistrationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int id) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "delete from tbl_registation where registation_id=?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(RegistrationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Registration reg) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "update tbl_registation set registation_createddate=?,registation_updateddate=?,registation_faculty=?,registation_reason=?,registation_date=?,registation_pathologicalprocess=?,registation_diseaseprofile=? where registation_id=?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, reg.getRegistatioCreatedDate());
            preparedStatement.setString(2, reg.getRegistationUpdatedDate());
            preparedStatement.setString(3, reg.getRegistationFaculty());
            preparedStatement.setString(4, reg.getRegistationReason());
            preparedStatement.setString(5, reg.getRegistationDate());
            preparedStatement.setString(6, reg.getRegistationPathologicalprocess());
            preparedStatement.setString(7, reg.getRegistationDiseaseprofile());
            preparedStatement.setInt(8, reg.getRegistationId());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(RegistrationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void exist(MedicalHistory med) {

    }
}
