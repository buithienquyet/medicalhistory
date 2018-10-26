/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.Patient;

/**
 *
 * @author Admin
 */
public interface PatientDAOInterface {

    Patient getPatientById(int id);

    void insert(Patient pat);

    void delete(int id);

    void update(Patient pat);
}
