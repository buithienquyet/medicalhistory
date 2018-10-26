package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hoa
 */
public class AnalysisRequestDAO implements AnalysisRequestDAOInterface{

    public AnalysisRequest getAnalysisRequestByID(int id) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "Select * from tbl_analysisrequest where analysisrequest_id=" + id;
            preparedStatement = con.prepareStatement(sql);
            AnalysisRequest ana = new AnalysisRequest();
            while (resultSet.next()) {
                int anaID = resultSet.getInt("analysisrequest_id");
                String name = resultSet.getString("analysisrequest_name");
                String department = resultSet.getString("analysisrequest_department");
                String namePatient = resultSet.getString("analysisrequest_namepatient");
                String sex = resultSet.getString("analysisrequest_sex");
                String address = resultSet.getString("analysisrequest_address");
                String createdDate = resultSet.getString("analysisrequest_createddate");
                String updatedDate = resultSet.getString("analysisrequest_updateddate");
                ana.setAnalysisrequestId(anaID);
                ana.setAnalysisrequestName(name);
                ana.setAnalysisrequestDepartment(department);
                ana.setAnalysisrequestNamepatient(namePatient);
                ana.setAnalysisrequestAddress(address);
                ana.setAnalysisrequestSex(sex);
                ana.setAnalysisrequestAddress(address);
                ana.setAnalysisrequestCreatedDate(createdDate);
                ana.setAnalysisrequestUpdatedDate(updatedDate);
                return ana;
            }

        } catch (Exception ex) {
            Logger.getLogger(AnalysisRequestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void insert(AnalysisRequest ana){
        try {
            Connection con;
            con= new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "insert into tbl_analysisrequest values(?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, ana.getAnalysisrequestId());
            preparedStatement.setString(2, ana.getAnalysisrequestName());
            preparedStatement.setString(3, ana.getAnalysisrequestDepartment());
            preparedStatement.setString(4, ana.getAnalysisrequestNamepatient());
            preparedStatement.setString(5, ana.getAnalysisrequestSex());
            preparedStatement.setString(6, ana.getAnalysisrequestAddress());
            preparedStatement.setString(7, ana.getAnalysisrequestCreatedDate());
            preparedStatement.setString(8, ana.getAnalysisrequestUpdatedDate());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(AnalysisRequestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    public  void delete(int id){
        try {
            Connection con;
            con= new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "delete from tbl_analysisrequest whhere analysisrequest_id=?  ";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(AnalysisRequestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    public void update(AnalysisRequest ana){
        try {
            Connection con;
            con= new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "update tbl_analysisrequest set analysisrequest_name=?, analysisrequest_department=?, analysisrequest_namepatient=?, "
                    + "analysisrequest_sex=?, analysisrequest_address=?, analysisrequest_createddate=?, analysisrequest_updateddate=? where analysisrequest_id=?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, ana.getAnalysisrequestName());
            preparedStatement.setString(2, ana.getAnalysisrequestDepartment());
            preparedStatement.setString(3, ana.getAnalysisrequestNamepatient());
            preparedStatement.setString(4, ana.getAnalysisrequestSex());
            preparedStatement.setString(5, ana.getAnalysisrequestAddress());
            preparedStatement.setString(6, ana.getAnalysisrequestCreatedDate());
            preparedStatement.setString(7, ana.getAnalysisrequestUpdatedDate());
            preparedStatement.setInt(8, ana.getAnalysisrequestId());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(AnalysisRequestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}
