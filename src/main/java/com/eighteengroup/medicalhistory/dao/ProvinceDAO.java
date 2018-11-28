/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.*;
import java.security.Provider;
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
public class ProvinceDAO implements ProvinceDAOInterface{
    public ArrayList<Province> getProvinces() {
         try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            ArrayList<Province> list = new ArrayList<>();
            
            String sql = "select * from tbl_province";
            
            preparedStatement = con.prepareStatement(sql);
            // Result set get the result of the SQL query
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) { 
                Province pro = new Province();
                String name=resultSet.getString("province_name");
                String type = resultSet.getString("province_type");
                String provinceId = resultSet.getString("province_id");               
                pro.setProvinceName(name);
                pro.setProvinceType(type);
                pro.setProvinceId(provinceId);
                list.add(pro);
            }
            return list;
        } catch (Exception ex) {
            Logger.getLogger(ProvinceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
