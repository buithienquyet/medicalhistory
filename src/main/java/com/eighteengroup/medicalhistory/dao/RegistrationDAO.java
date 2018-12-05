package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoa
 */
public class RegistrationDAO implements RegistrationDAOInterface {

    public Registration getRegistrationById(int id) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;

            String sql = "select * from tbl_registration where registration_id= ?";

            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            resultSet = preparedStatement.executeQuery();

            Registration res = new Registration();

            while (resultSet.next()) {
                String faculty = resultSet.getString("registration_faculty");
                String date = resultSet.getString("registration_date");
                String reason = resultSet.getString("registration_reason");
                String pathologicalprocess = resultSet.getString("registration_pathologicalprocess");
                String diseaseprofile = resultSet.getString("registration_diseaseprofile");
                String createdDate = resultSet.getString("registration_createddate");
                String updatedDate = resultSet.getString("registration_updateddate");
                long userId = resultSet.getLong("registration_userId");

                UserDAOInterface userDAO = new UserDAO();
                User user = userDAO.getUserById(userId);

                res.setUser(user);
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

    public ArrayList<Registration> getRegistrationsByDate(String date, long roomId) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;

            ArrayList<Registration> list = new ArrayList<>();

            String sql = "SELECT * FROM tbl_registration JOIN tbl_user ON tbl_registration.registration_userId = tbl_user.user_id WHERE registration_date = ? AND registration_roomId = ?";

            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, date);
            preparedStatement.setLong(2, roomId);
            // Result set get the result of the SQL query
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Registration res = new Registration();
                String faculty = resultSet.getString("registration_faculty");                
                String reason = resultSet.getString("registration_reason");
                String pathologicalprocess = resultSet.getString("registration_pathologicalprocess");
                String diseaseprofile = resultSet.getString("registration_diseaseprofile");
                String createdDate = resultSet.getString("registration_createddate");
                String updatedDate = resultSet.getString("registration_updateddate");

//                String user_birthday = resultSet.getString("user_birthday");
//                String user_firstname = resultSet.getString("user_firstname");
//                String user_lastname = resultSet.getString("user_lastname");
//                String user_proviceId = resultSet.getString("user_address_provinceId");
//                String user_districtId = resultSet.getString("user_address_districtId");
//                String user_villageId = resultSet.getString("user_address_village");
//                String user_homeNumber = resultSet.getString("user_address_homenumber");
//                String user_phoneNumber = resultSet.getString("user_phoneNumber");

                User user = new UserDAO().getUserById(Long.parseLong(resultSet.getString("registration_userId")));
//                user.setBirthday(user_birthday);
//                user.setFirstName(user_firstname);
//                user.setLastName(user_lastname);
//                user.setProvinceId(user_proviceId);
//                user.setDistrictId(user_districtId);
//                user.setVillageId(user_villageId);
//                user.setHomeNumber(user_homeNumber);
//                user.setPhoneNumber(user_phoneNumber);
                //preparedStatement.setInt(1, id);
                res.setUser(user);
                res.setRegistationFaculty(faculty);
                res.setRegistationDate(date);
                res.setRegistationReason(reason);
                res.setRegistationPathologicalprocess(diseaseprofile);
                res.setRegistationDiseaseprofile(pathologicalprocess);
                res.setRegistatioCreatedDate(createdDate);
                res.setRegistationUpdatedDate(updatedDate);
                list.add(res);
            }

            return list;

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
            String sql = "insert into tbl_registration(registration_faculty,registration_userId,registration_date,registration_reason,registration_pathologicalprocess,"
                    + "registration_diseaseprofile,registration_createddate,registration_updateddate, registration_roomId) values( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = con.prepareStatement(sql);
            // preparedStatement.setInt(1, reg.getRegistationId());
            preparedStatement.setString(1, reg.getRegistationFaculty());
            preparedStatement.setLong(2, reg.getUser().getId());
            preparedStatement.setString(3, reg.getRegistationDate());
            preparedStatement.setString(4, reg.getRegistationReason());
            preparedStatement.setString(5, reg.getRegistationPathologicalprocess());
            preparedStatement.setString(6, reg.getRegistationDiseaseprofile());
            preparedStatement.setString(7, reg.getRegistatioCreatedDate());
            preparedStatement.setString(8, reg.getRegistationUpdatedDate());
            preparedStatement.setLong(9, reg.getRegistationRoomId());

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
            String sql = "delete from tbl_registration where registration_id=?";
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
            String sql = "update tbl_registration set registration_createddate=?,registration_updateddate=?,registration_faculty=?,registration_reason=?,registration_date=?,registration_pathologicalprocess=?,registration_diseaseprofile=? where registration_id=?";
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
