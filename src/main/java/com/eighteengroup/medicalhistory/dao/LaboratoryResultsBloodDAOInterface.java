
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.LaboratoryResultsBlood;

/**
 *
 * @author Admin
 */
public interface LaboratoryResultsBloodDAOInterface {
    LaboratoryResultsBlood getLaboratoryResultsBloodById(int id);
    void insert(LaboratoryResultsBlood lab);
    public void delete(int id);
    void update(LaboratoryResultsBlood lab);
}
