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
/*Bang thuoc*/
public class Medicament {
    private int medicamentId;
    private String medicamentName;
    private String medicamentCreateddate;
    private String medicamentQuantity;
    private String medicamentTypeofmedicine;

    public int getMedicamentId() {
        return medicamentId;
    }

    public void setMedicamentId(int medicamentId) {
        this.medicamentId = medicamentId;
    }

    public String getMedicamentName() {
        return medicamentName;
    }

    public void setMedicamentName(String medicamentName) {
        this.medicamentName = medicamentName;
    }

    public String getMedicamentCreateddate() {
        return medicamentCreateddate;
    }

    public void setMedicamentCreateddate(String medicamentCreateddate) {
        this.medicamentCreateddate = medicamentCreateddate;
    }

    public String getMedicamentQuantity() {
        return medicamentQuantity;
    }

    public void setMedicamentQuantity(String medicamentQuantity) {
        this.medicamentQuantity = medicamentQuantity;
    }

    public String getMedicamentTypeofmedicine() {
        return medicamentTypeofmedicine;
    }

    public void setMedicamentTypeofmedicine(String medicamentTypeofmedicine) {
        this.medicamentTypeofmedicine = medicamentTypeofmedicine;
    }
    
}
