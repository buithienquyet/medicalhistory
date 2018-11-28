/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author Admin
 */
public class DistrictDAO implements DistrictDAOInterface{
    
    public ArrayList<District> getDistrictByProvinceId(String id) {
         try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            ArrayList<District> list = new ArrayList<>();
            
            String sql = "select * from tbl_district where province_id = ?";
            
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) { 
                District dis = new District();
                String name=resultSet.getString("district_name");
                String type = resultSet.getString("district_type");
                String districtId=resultSet.getString("district_id");
                //preparedStatement.setInt(1, id);
                dis.setDistrictName(name);
                dis.setDistrictType(type);
                dis.setDistrictId(districtId);
                //dis.setProvinceName(provinceName);
                
                list.add(dis);
            }
            return list;
        } catch (Exception ex) {
            Logger.getLogger(DistrictDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
