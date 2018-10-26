/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.models;

/**
 *
 * @author Hoa
 */
/* yeu cau xet nghiem*/
public class AnalysisRequest {

    private int analysisrequestId;
    private String analysisrequestName;
    private String analysisrequestDepartment;
    private String analysisrequestNamepatient;
    private String analysisrequestSex;
    private String analysisrequestAddress;
    private String analysisrequestCreatedDate;
    private String analysisrequestUpdatedDate;

    public int getAnalysisrequestId() {
        return analysisrequestId;
    }

    public void setAnalysisrequestId(int analysisrequestId) {
        this.analysisrequestId = analysisrequestId;
    }

    public String getAnalysisrequestName() {
        return analysisrequestName;
    }

    public void setAnalysisrequestName(String analysisrequestName) {
        this.analysisrequestName = analysisrequestName;
    }

    public String getAnalysisrequestDepartment() {
        return analysisrequestDepartment;
    }

    public void setAnalysisrequestDepartment(String analysisrequestDepartment) {
        this.analysisrequestDepartment = analysisrequestDepartment;
    }

    public String getAnalysisrequestNamepatient() {
        return analysisrequestNamepatient;
    }

    public void setAnalysisrequestNamepatient(String analysisrequestNamepatient) {
        this.analysisrequestNamepatient = analysisrequestNamepatient;
    }

    public String getAnalysisrequestSex() {
        return analysisrequestSex;
    }

    public void setAnalysisrequestSex(String analysisrequestSex) {
        this.analysisrequestSex = analysisrequestSex;
    }

    public String getAnalysisrequestAddress() {
        return analysisrequestAddress;
    }

    public void setAnalysisrequestAddress(String analysisrequestAddress) {
        this.analysisrequestAddress = analysisrequestAddress;
    }

    public String getAnalysisrequestCreatedDate() {
        return analysisrequestCreatedDate;
    }

    public void setAnalysisrequestCreatedDate(String analysisrequestCreatedDate) {
        this.analysisrequestCreatedDate = analysisrequestCreatedDate;
    }

    public String getAnalysisrequestUpdatedDate() {
        return analysisrequestUpdatedDate;
    }

    public void setAnalysisrequestUpdatedDate(String analysisrequestUpdatedDate) {
        this.analysisrequestUpdatedDate = analysisrequestUpdatedDate;
    }
    
}
