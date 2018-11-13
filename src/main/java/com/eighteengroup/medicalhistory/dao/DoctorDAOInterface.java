/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.Doctor;

/**
 *
 * @author Admin
 */
public interface DoctorDAOInterface {
    Doctor getDoctorById(int id);
    void insert(Doctor doc);
    void delete(int id);
    void update(Doctor doc);
}
