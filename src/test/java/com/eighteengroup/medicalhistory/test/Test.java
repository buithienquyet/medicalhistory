/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.test;
import com.eighteengroup.medicalhistory.dao.*;
import com.eighteengroup.medicalhistory.models.*;
/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        MedicalHistoryDAO medicalHistoryDAO=new MedicalHistoryDAO();
        MedicalHistory medicalHistory=new MedicalHistory();
        medicalHistory.setMedicalhistoryCreatedDate("18/01/2018");
        medicalHistory.setMedicalhistoryUpdatedDate("20/08/2018");
        medicalHistory.setMedicalhistoryReason("dau dau");
        medicalHistory.setMedicalhistoryDate("12/05/2018");
        medicalHistory.setMedicalhistoryPathlogicalprocess("5 nam");
        medicalHistory.setMedicalhistoryDiseaseprofile("");
        medicalHistory.setMedicalhistoryBodySpiritofthesick("");
        medicalHistory.setMedicalhistoryBodyMillionhemorrhage("");
        medicalHistory.setMedicalhistoryBodyStyle("");
        medicalHistory.setMedicalhistoryBodySystemhair("");
        medicalHistory.setMedicalhistoryBodySkin("");
        medicalHistory.setMedicalhistoryBodyThyroid("");
        medicalHistory.setMedicalhistoryOrganizationLiverLocation("");
        medicalHistory.setMedicalhistoryOrganizationLiverSize("");
        medicalHistory.setMedicalhistoryOrganizationLiverDensity("");
        medicalHistory.setMedicalhistoryOrganizationLiverBo("");
        medicalHistory.setMedicalhistoryOrganizationLiverMatgan("");
        medicalHistory.setMedicalhistoryOrganizationLiverPain("");
        medicalHistory.setMedicalhistoryOrganizationSpleenLocation("");
        medicalHistory.setMedicalhistoryOrganizationSpleenSize("");
        medicalHistory.setMedicalhistoryOrganizationSpleenDensity("");
        medicalHistory.setMedicalhistoryOrganizationSpleenEdge("");
        medicalHistory.setMedicalhistoryOrganizationSpleenSpleen("");
        medicalHistory.setMedicalhistoryOrganizationSpleenPain(""); 
        medicalHistory.setMedicalhistoryOrganizationGanglionLocation("");
        medicalHistory.setMedicalhistoryOrganizationGanglionSize("");
        medicalHistory.setMedicalhistoryOrganizationGanglionDensity("");
        medicalHistory.setMedicalhistoryOrganizationGanglionEdge("");
        medicalHistory.setMedicalhistoryOrganizationGanglionLymphnodes("");
        medicalHistory.setMedicalhistoryOrganizationGanglionPain("");
        medicalHistory.setMedicalhistoryMedicalsummary("");
        medicalHistory.setMedicalhistoryMaindisease("");
        medicalHistory.setMedicalhistoryIncludingdiseases("");
        medicalHistory.setMedicalhistoryDiscern("");
        medicalHistory.setMedicalhistoryDetail("");
        medicalHistory.setMedicalhistoryTreat("");
        medicalHistory.setMedicalhistoryBloodtransfusionRedbloodcells(1);
        medicalHistory.setMedicalhistoryBloodtransfusionSphericalwash(3);
        medicalHistory.setMedicalhistoryBloodtransfusionPlatelets(2);
        medicalHistory.setMedicalhistoryBloodtransfusionGrainclusters(2);
        medicalHistory.setMedicalhistoryBloodtransfusionPlasma(5);
        medicalHistory.setMedicalhistoryBloodtransfusionFreshfrozenplasma(6);
        medicalHistory.setMedicalhistoryBloodtransfusionPrecipitateVIII(2);
        medicalHistory.setMedicalhistoryBloodtransfusionFullbloodtransfusion(3);
        medicalHistory.setMedicalhistoryTreatmentprocess("");
        medicalHistory.setMedicalhistoryUmmarizestheresults("");
        medicalHistory.setMedicalhistoryTreatments("");
        medicalHistory.setMedicalhistoryDischargestatus("");
        medicalHistory.setMedicalhistoryTreatmentdirectionandregimen("");
        medicalHistoryDAO.insert(medicalHistory);
        
        //medicalHistory.setMedicalhistoryId(2);
        //medicalHistoryDAO.delete(2);

        
        
    }
}
