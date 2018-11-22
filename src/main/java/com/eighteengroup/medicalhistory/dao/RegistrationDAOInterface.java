/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.Registration;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface RegistrationDAOInterface {

    Registration getRegistrationById(int id);
    
    ArrayList<Registration> getRegistrationsByDate();

    void insert(Registration reg);

    void delete(int id);

    void update(Registration reg);
}
