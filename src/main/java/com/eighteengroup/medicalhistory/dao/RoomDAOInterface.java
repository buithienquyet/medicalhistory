/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.Room;
import java.util.ArrayList;

/**
 *
 * @author quyet
 */
public interface RoomDAOInterface {
     ArrayList<Room> getRooms(long facultyId, String type);
    
}
