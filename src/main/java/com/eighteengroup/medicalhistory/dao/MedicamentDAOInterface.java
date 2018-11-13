/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.Medicament;

/**
 *
 * @author Admin
 */
public interface MedicamentDAOInterface {

    Medicament getMedicamentById(int id);

    void insert(Medicament met);

    void delete(int id);

    void update(Medicament met);
}
