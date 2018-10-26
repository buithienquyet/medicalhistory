/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.AnalysisRequest;

/**
 *
 * @author quyet
 */
public interface AnalysisRequestDAOInterface {
    AnalysisRequest getAnalysisRequestByID(int id);     
    void insert(AnalysisRequest ana);
    void delete(int id);
    void update(AnalysisRequest ana);
}
