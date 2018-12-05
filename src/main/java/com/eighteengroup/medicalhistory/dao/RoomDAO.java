/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.Faculty;
import com.eighteengroup.medicalhistory.models.Room;
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
public class RoomDAO  implements RoomDAOInterface{
     public ArrayList<Room> getRooms(long facultyId, String type) {
         try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            ArrayList<Room> list = new ArrayList<>();
            
            String sql = "select * from tbl_room where room_faculty_id =? and room_type =?";
            
            preparedStatement = con.prepareStatement(sql);
            // Result set get the result of the SQL query
            preparedStatement.setLong(1, facultyId);
            preparedStatement.setString(2, type);
            resultSet = preparedStatement.executeQuery();            
            
            while (resultSet.next()) { 
                Room room = new Room();
                String name=resultSet.getString("room_name");
                String address = resultSet.getString("room_address");
                String roomType = resultSet.getString("room_type");
                long id = resultSet.getLong("room_id");
                long roomFacultyId = resultSet.getLong("room_faculty_id");
                
                room.setAddres(address);
                room.setFacultyId(facultyId);
                room.setName(name);
                room.setRoomId(id);
                room.setType(roomType);
                                          
                list.add(room);
            }
            return list;
        } catch (Exception ex) {
            Logger.getLogger(ProvinceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
