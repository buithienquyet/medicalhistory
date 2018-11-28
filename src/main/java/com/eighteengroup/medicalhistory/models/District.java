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
public class District extends Province{
    private String DistrictId;
    private String DistrictName;
    private String DistrictType;

    public String getDistrictId() {
        return DistrictId;
    }

    public void setDistrictId(String DistrictId) {
        this.DistrictId = DistrictId;
    }

    public String getDistrictName() {
        return DistrictName;
    }

    public void setDistrictName(String DistrictName) {
        this.DistrictName = DistrictName;
    }

    public String getDistrictType() {
        return DistrictType;
    }

    public void setDistrictType(String DistrictType) {
        this.DistrictType = DistrictType;
    }
    
    
    
}
