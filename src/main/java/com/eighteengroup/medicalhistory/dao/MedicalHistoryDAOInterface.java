/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.MedicalHistory;

/**
 *
 * @author Admin
 */
public interface MedicalHistoryDAOInterface {

    MedicalHistory getMedicalhistory(int id);

    void insert(MedicalHistory med);

    void delete(int id);

    void update(MedicalHistory med);
}
