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
            String sql = "select * from tbl_registation where registation_id=" + id;
            preparedStatement = con.prepareStatement(sql);
            // Result set get the result of the SQL query
            resultSet = preparedStatement.executeQuery();
            Registration res = new Registration();  

            while (resultSet.next()) {
                int regId = resultSet.getInt("registation_id");
                String createdDate=resultSet.getString("registation_createddate");
                String updatedDate=resultSet.getString("registation_updateddate");
                String faculty = resultSet.getString("registation_faculty");
                String reason = resultSet.getString("registation_why");
                String date = resultSet.getString("registation_date");
                String pathologicalprocess = resultSet.getString("registation_diseaseprofile");
                res.setRegistationId(regId);
                res.setRegistatioCreatedDate(createdDate);
                res.setRegistationUpdatedDate(updatedDate);
                res.setRegistationFaculty(faculty);
                res.setRegistationReason(reason);
                res.setRegistationPathologicalprocess(pathologicalprocess);
                res.setRegistationDiseaseprofile(pathologicalprocess);
                return res;
            }
            
        } catch (Exception e) {

        }
        return null;
    }

    public void insert(Registration reg) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "insert into tbl_registation values(?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, reg.getRegistationId());
            preparedStatement.setString(2, reg.getRegistatioCreatedDate());
            preparedStatement.setString(3, reg.getRegistationUpdatedDate());
            preparedStatement.setString(4, reg.getRegistationFaculty());
            preparedStatement.setString(5, reg.getRegistationReason());
            preparedStatement.setString(6, reg.getRegistationDate());
            preparedStatement.setString(7, reg.getRegistationPathologicalprocess());
            preparedStatement.setString(8, reg.getRegistationDiseaseprofile());
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
            String sql = "update tbl_registation set registation_createddate=?,registation_updateddate=?,registation_faculty=?,registation_why=?,registation_date=?,registation_pathologicalprocess=?,registation_diseaseprofile=? where registation_id=?";
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
    public void exist(MedicalHistory med){
        
    }
}
