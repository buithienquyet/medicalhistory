/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.models;

/**
 *
 * @author Admin
 */
public class Registration {

    private int registationId;
    private String registationFaculty;
    private String registatioCreatedDate;
    private String registationUpdatedDate;
    private String registationReason;
    private String registationDate;
    private String registationPathologicalprocess;
    private String registationDiseaseprofile;

    public int getRegistationId() {
        return registationId;
    }

    public void setRegistationId(int registation_id) {
        this.registationId = registation_id;
    }

    public String getRegistationFaculty() {
        return registationFaculty;
    }

    public void setRegistationFaculty(String registationFaculty) {
        this.registationFaculty = registationFaculty;
    }

    public String getRegistatioCreatedDate() {
        return registatioCreatedDate;
    }

    public void setRegistatioCreatedDate(String registatioCreatedDate) {
        this.registatioCreatedDate = registatioCreatedDate;
    }

    public String getRegistationUpdatedDate() {
        return registationUpdatedDate;
    }

    public void setRegistationUpdatedDate(String registationUpdatedDate) {
        this.registationUpdatedDate = registationUpdatedDate;
    }

    public String getRegistationReason() {
        return registationReason;
    }

    public void setRegistationReason(String registationWhy) {
        this.registationReason = registationWhy;
    }

    public String getRegistationDate() {
        return registationDate;
    }

    public void setRegistationDate(String registationDate) {
        this.registationDate = registationDate;
    }

    public String getRegistationPathologicalprocess() {
        return registationPathologicalprocess;
    }

    public void setRegistationPathologicalprocess(String registationPathologicalprocess) {
        this.registationPathologicalprocess = registationPathologicalprocess;
    }

    public String getRegistationDiseaseprofile() {
        return registationDiseaseprofile;
    }

    public void setRegistationDiseaseprofile(String registationDiseaseprofile) {
        this.registationDiseaseprofile = registationDiseaseprofile;
    }

    
}
