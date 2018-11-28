/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.Village;
import com.sun.media.jfxmedia.control.VideoDataBuffer;
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
public class VillageDAO implements VillageDAOInterface{
    public ArrayList<Village> getVillageByDistrictId(String id) {
         try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            ArrayList<Village> list=new ArrayList<>();
            
            String sql = "select * from tbl_village where district_id=?";
            
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) { 
                Village vil = new Village();
                String name=resultSet.getString("village_name");
                String type = resultSet.getString("village_type");
                String villageId = resultSet.getString("village_id");
                vil.setVillageName(name);
                vil.setVillageType(type);
                vil.setVillageId(villageId);
                list.add(vil);
            }
            return list;
        } catch (Exception ex) {
            Logger.getLogger(VillageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
