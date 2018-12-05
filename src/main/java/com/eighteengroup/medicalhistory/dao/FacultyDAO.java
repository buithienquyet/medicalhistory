/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.Faculty;
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
public class FacultyDAO implements FacultyDAOInterface{
      public ArrayList<Faculty> getFaculties() {
         try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            ArrayList<Faculty> list = new ArrayList<>();
            
            String sql = "select * from tbl_faculty";
            
            preparedStatement = con.prepareStatement(sql);
            // Result set get the result of the SQL query
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) { 
                Faculty fac = new Faculty();
                String name=resultSet.getString("faculty_name");
                long id = resultSet.getLong("faculty_id");
                          
                fac.setId(id);
                fac.setName(name);
                list.add(fac);
            }
            return list;
        } catch (Exception ex) {
            Logger.getLogger(ProvinceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
