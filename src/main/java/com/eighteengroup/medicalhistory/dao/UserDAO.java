/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.District;
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
            String sql = "select * from tbl_User where user_userName=? and user_password =?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user = new User();
                long id = resultSet.getLong("user_id");
                String name = resultSet.getString("user_userName");
                String dbRoles = resultSet.getString("user_role");
                ArrayList<String> roles = new ArrayList<String>();
                for (String item : dbRoles.split(",")) {
                    roles.add(item);
                }
                user.setRoles(roles);
                String address = resultSet.getString("user_address");
                String birthday = resultSet.getString("user_birthday");
                String phoneNumber = resultSet.getString("user_phoneNumber");
                String createdDate = resultSet.getString("user_createddate");
                String updateDate = resultSet.getString("user_updateddate");
                String firstName = resultSet.getString("user_firstname");
                String lastName = resultSet.getString("user_lastname");
                user.setUserName(name);
                user.setPassword(password);
                user.setAddress(address);
                user.setBirthday(birthday);
                user.setPhoneNumber(phoneNumber);
                user.setCreatedDate(createdDate);
                user.setUpdatedDate(updateDate);
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setId(id);

                return user;
            }
            return null;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }

    public ArrayList<User> getUser() {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            ArrayList<User> list = new ArrayList<>();

            String sql = "select * from tbl_user";

            preparedStatement = con.prepareStatement(sql);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                User user = new User();
                long id = resultSet.getLong("user_id");
                String username = resultSet.getString("user_userName");
                String birthday = resultSet.getString("user_birthday");
                String address = resultSet.getString("user_address");
                String phoneNumber = resultSet.getString("user_phoneNumber");
                String createdDate = resultSet.getString("user_createdDate");
                String updatedDate = resultSet.getString("user_updatedDate");
                String lastLogin = resultSet.getString("user_lastLogin");
                String password = resultSet.getString("user_password");
                String loginCount = resultSet.getString("user_loginCount");
                String dbRoles = resultSet.getString("user_role");
                ArrayList<String> roles = new ArrayList<String>();
                for (String item : dbRoles.split(",")) {
                    roles.add(item);
                }
                String firstname = resultSet.getString("user_firstname");
                String lastname = resultSet.getString("user_lastname");
                int isUserDeleted = resultSet.getInt("user_isUserDeleted");
                String proviceId = resultSet.getString("user_address_provinceId");
                String districtId = resultSet.getString("user_address_districtId");
                String villageId = resultSet.getString("user_address_village");
                String homeNumber = resultSet.getString("user_address_homenumber");
                
                user.setId(id);
                user.setUserName(username);
                user.setBirthday(birthday);
                user.setAddress(address);
                user.setPhoneNumber(phoneNumber);
                user.setCreatedDate(createdDate);
                user.setUpdatedDate(updatedDate);
                user.setLastLogin(lastLogin);
                user.setPassword(password);
                user.setLastLogin(lastLogin);
                user.setRoles(roles);
                user.setFirstName(firstname);
                user.setLastName(lastname);
                user.setIsUserDeleted(isUserDeleted);
                user.setProvinceId(proviceId);
                user.setDistrictId(districtId);
                user.setVillageId(villageId);
                user.setHomeNumber(homeNumber);

                //dis.setProvinceName(provinceName);
                list.add(user);
            }
            return list;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public User getUserById(long id) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            User user = null;

            String sql = "select * from tbl_user where user_id=?";

            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                user = new User();
                long userId = resultSet.getLong("user_id");
                String username = resultSet.getString("user_userName");
                String birthday = resultSet.getString("user_birthday");
                String address = resultSet.getString("user_address");
                String phoneNumber = resultSet.getString("user_phoneNumber");
                String createdDate = resultSet.getString("user_createdDate");
                String updatedDate = resultSet.getString("user_updatedDate");
                String lastLogin = resultSet.getString("user_lastLogin");
                String password = resultSet.getString("user_password");
                String loginCount = resultSet.getString("user_loginCount");
                String dbRoles = resultSet.getString("user_role");
                ArrayList<String> roles = new ArrayList<String>();
                for (String item : dbRoles.split(",")) {
                    roles.add(item);
                }
                String firstname = resultSet.getString("user_firstname");
                String lastname = resultSet.getString("user_lastname");
                int isUserDeleted = resultSet.getInt("user_isUserDeleted");
                String proviceId = resultSet.getString("user_address_provinceId");
                String districtId = resultSet.getString("user_address_districtId");
                String villageId = resultSet.getString("user_address_village");
                String homeNumber = resultSet.getString("user_address_homenumber");
                
                user.setId(userId);
                user.setUserName(username);
                user.setBirthday(birthday);
                user.setAddress(address);
                user.setPhoneNumber(phoneNumber);
                user.setCreatedDate(createdDate);
                user.setUpdatedDate(updatedDate);
                user.setLastLogin(lastLogin);
                user.setPassword(password);
                user.setLastLogin(lastLogin);
                user.setRoles(roles);
                user.setFirstName(firstname);
                user.setLastName(lastname);
                user.setIsUserDeleted(isUserDeleted);
                
              user.setProvinceId(proviceId);
                user.setDistrictId(districtId);
                user.setVillageId(villageId);
                user.setHomeNumber(homeNumber);

                //dis.setProvinceName(provinceName);
                return user;
            }
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void delete(int id) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            ArrayList<User> list = new ArrayList<>();

            String sql = "update tbl_user set user_isUserDeleted=? where user_id=?";

            preparedStatement = con.prepareStatement(sql);
            User user = new User();
            preparedStatement.setInt(1, user.getIsUserDeleted());
            preparedStatement.setLong(2, user.getId());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(User user) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            ArrayList<User> list = new ArrayList<>();

            String sql = "update tbl_user set user_userName=?,user_birthday=?,user_address=?,user_phoneNumber=?,"
                    + "user_createdDate=?,user_updatedDate=?,user_lastLogin=?,user_password=?,user_loginCount=?,"
                    + "user_role=?,user_firstname=?,user_lastname=?,user_isUserDeleted=? where user_id=?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getBirthday());
            preparedStatement.setString(3, user.getAddress());
            preparedStatement.setString(4, user.getPhoneNumber());
            preparedStatement.setString(5, user.getCreatedDate());
            preparedStatement.setString(6, user.getUpdatedDate());
            preparedStatement.setString(7, user.getLastLogin());
            preparedStatement.setString(8, user.getPassword());

            preparedStatement.setString(1, user.getRoles().get(0));
            preparedStatement.setLong(9, user.getLoginCount());
            preparedStatement.setString(10, user.getFirstName());
            preparedStatement.setString(11, user.getLastName());
            preparedStatement.setInt(12, user.getIsUserDeleted());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insert(User user) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;

            String sql = "insert into tbl_user set user_userName=?,user_birthday=?,user_address=?,user_phoneNumber=?,"
                    + "user_createdDate=?,user_updatedDate=?,user_lastLogin=?,user_password=?,user_loginCount=?,"
                    + "user_role=?,user_firstname=?,user_lastname=?,user_isUserDeleted=?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getBirthday());
            preparedStatement.setString(3, user.getAddress());
            preparedStatement.setString(4, user.getPhoneNumber());
            preparedStatement.setString(5, user.getCreatedDate());
            preparedStatement.setString(6, user.getUpdatedDate());
            preparedStatement.setString(7, user.getLastLogin());
            preparedStatement.setString(8, user.getPassword());

            //preparedStatement.setString(1, user.getRoles());
            preparedStatement.setLong(9, user.getLoginCount());
            preparedStatement.setString(10, user.getFirstName());
            preparedStatement.setString(11, user.getLastName());
            preparedStatement.setInt(12, user.getIsUserDeleted());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
