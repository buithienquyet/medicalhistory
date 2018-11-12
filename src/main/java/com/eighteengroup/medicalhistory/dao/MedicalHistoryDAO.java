/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;
import com.eighteengroup.medicalhistory.models.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class MedicalHistoryDAO {
    public MedicalHistory getMedicalhistory(int id) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "select * from tbl_medicalhistory where medicalhistory_id=?";
            preparedStatement = con.prepareStatement(sql);
            // Result set get the result of the SQL query
            resultSet = preparedStatement.executeQuery();
            MedicalHistory med = new MedicalHistory();
            while (resultSet.next()) {                
                String createddate=resultSet.getString("medicalhistory_createddate");
                String updateddate=resultSet.getString("medicalhistory_updateddate");
                String reason=resultSet.getString("medicalhistory_why");
                String date=resultSet.getString("medicalhistory_date");
                String pathlogicalprocess=resultSet.getString("medicalhistory_pathlogicalprocess");
                String diseaseprofile=resultSet.getString("medicalhistory_diseaseprofile");
                String bodySpiritofthesick=resultSet.getString("medicalhistory_body_spiritofthesick");
                String bodyMillionhemorrhage=resultSet.getString("medicalhistory_body_millionhemorrhage");
                String bodyStyle=resultSet.getString("medicalhistory_body_style");
                String bodySystemhair=resultSet.getString("medicalhistory_body_systemhair");
                String bodySkin=resultSet.getString("medicalhistory_body_skin");
                String bodyThyroid=resultSet.getString("medicalhistory_body_Thyroid");
                String organizationLiverLocation=resultSet.getString("medicalhistory_organization_liver_location");
                String organizationLiverSize=resultSet.getString("medicalhistory_organization_liver_size");
                String organizationLiverDensity=resultSet.getString("medicalhistory_organization_liver_density");
                String organizationLiverBo=resultSet.getString("medicalhistory_organization_liver_bo");
                String organizationLiverMatgan=resultSet.getString("medicalhistory_organization_liver_matgan");
                String organizationLiverPain=resultSet.getString("medicalhistory_organization_liver_pain");
                String organizationSpleenLocation=resultSet.getString("medicalhistory_organization_spleen_location");
                String organizationSpleenSize =resultSet.getString("medicalhistory_organization_spleen_size");
                String organizationSpleenDensity=resultSet.getString("medicalhistory_organization_spleen_density");
                String organizationSpleenEdge=resultSet.getString("medicalhistory_organization_spleen_edge");
                String organizationSpleenSpleen=resultSet.getString("medicalhistory_organization_spleen_spleen");
                String organizationSpleenPain=resultSet.getString("medicalhistory_organization_spleen_pain");
                String organizationGanglionLocation=resultSet.getString("medicalhistory_organization_ganglion_location");
                String organizationGanglionSize=resultSet.getString("medicalhistory_organization_ganglion_size");
                String organizationGanglionDensity=resultSet.getString("medicalhistory_organization_ganglion_density");
                String organizationGanglionEdge=resultSet.getString("medicalhistory_organization_ganglion_edge");
                String organizationGanglionLymphnodes=resultSet.getString("medicalhistory_organization_ganglion_lymphnodes");
                String organizationGanglionPain =resultSet.getString("medicalhistory_organization_ganglion_pain");
                String medicalsummary=resultSet.getString("medicalhistory_medicalsummary");
                String maindisease=resultSet.getString("medicalhistory_maindisease");
                String includingdiseases=resultSet.getString("medicalhistory_includingdiseases");
                String discernt=resultSet.getString("medicalhistory_discernt");
                String detail=resultSet.getString("medicalhistory_detail");
                String treat =resultSet.getString("medicalhistory_treat");
                int bloodtransfusionRedbloodcells=resultSet.getInt("medicalhistory_bloodtransfusion_redbloodcells");
                int bloodtransfusionSphericalwash=resultSet.getInt("medicalhistory_bloodtransfusion_sphericalwash");
                int bloodtransfusionPlatelets=resultSet.getInt("medicalhistory_bloodtransfusion_platelets");
                int bloodtransfusionGrainclusters=resultSet.getInt("medicalhistory_bloodtransfusion_Grainclusters");
                int bloodtransfusionPlasma=resultSet.getInt("medicalhistory_bloodtransfusion_plasma");
                int bloodtransfusionFreshfrozenplasma=resultSet.getInt("medicalhistory_bloodtransfusion_freshfrozenplasma");
                int bloodtransfusionPrecipitateVIII=resultSet.getInt("medicalhistory_bloodtransfusion_precipitateVIII");
                int bloodtransfusionFullbloodtransfusion=resultSet.getInt("medicalhistory_bloodtransfusion_fullbloodtransfusion");
                String treatmentprocess=resultSet.getString("medicalhistory_treatmentprocess");
                String ummarizestheresults=resultSet.getString("medicalhistory_ummarizestheresults");
                String treatments=resultSet.getString("medicalhistory_treatments");
                String dischargestatus=resultSet.getString("medicalhistory_dischargestatus");
                String treatmentdirectionandregimen=resultSet.getString("medicalhistory_treatmentdirectionandregimen");
                
                preparedStatement.setInt(1, id);
                med.setMedicalhistoryCreatedDate(createddate);
                med.setMedicalhistoryUpdatedDate(updateddate);
                med.setMedicalhistoryReason(reason);
                med.setMedicalhistoryDate(date);
                med.setMedicalhistoryPathlogicalprocess(pathlogicalprocess);
                med.setMedicalhistoryDiseaseprofile(diseaseprofile);
                med.setMedicalhistoryBodySpiritofthesick(bodySpiritofthesick);
                med.setMedicalhistoryBodyMillionhemorrhage(bodyMillionhemorrhage);
                med.setMedicalhistoryBodyStyle(bodyStyle);
                med.setMedicalhistoryBodySystemhair(bodySystemhair);
                med.setMedicalhistoryBodySkin(bodySkin);
                med.setMedicalhistoryBodyThyroid(bodyThyroid);
                med.setMedicalhistoryOrganizationLiverLocation(organizationLiverLocation);
                med.setMedicalhistoryOrganizationLiverSize(organizationLiverSize);
                med.setMedicalhistoryOrganizationLiverDensity(organizationLiverDensity);
                med.setMedicalhistoryOrganizationLiverBo(organizationLiverBo);
                med.setMedicalhistoryOrganizationLiverMatgan(organizationLiverMatgan);
                med.setMedicalhistoryOrganizationLiverPain(organizationLiverPain);
                med.setMedicalhistoryOrganizationSpleenLocation(organizationSpleenLocation);
                med.setMedicalhistoryOrganizationSpleenSize(organizationSpleenSize);
                med.setMedicalhistoryOrganizationSpleenDensity(organizationSpleenDensity);
                med.setMedicalhistoryOrganizationSpleenEdge(organizationSpleenEdge);
                med.setMedicalhistoryOrganizationSpleenSpleen(organizationSpleenSpleen);
                med.setMedicalhistoryOrganizationSpleenPain(organizationSpleenPain);
                med.setMedicalhistoryOrganizationGanglionLocation(organizationGanglionLocation);
                med.setMedicalhistoryOrganizationGanglionSize(organizationGanglionSize);
                med.setMedicalhistoryOrganizationGanglionDensity(organizationGanglionDensity);
                med.setMedicalhistoryOrganizationGanglionEdge(organizationGanglionEdge);
                med.setMedicalhistoryOrganizationGanglionLymphnodes(organizationGanglionLymphnodes);
                med.setMedicalhistoryOrganizationGanglionPain(organizationGanglionPain);
                med.setMedicalhistoryMedicalsummary(medicalsummary);
                med.setMedicalhistoryMaindisease(maindisease);
                med.setMedicalhistoryIncludingdiseases(includingdiseases);
                med.setMedicalhistoryDiscern(discernt);
                med.setMedicalhistoryDetail(detail);
                med.setMedicalhistoryTreat(treat);
                med.setMedicalhistoryBloodtransfusionRedbloodcells(bloodtransfusionRedbloodcells);
                med.setMedicalhistoryBloodtransfusionSphericalwash(bloodtransfusionSphericalwash);
                med.setMedicalhistoryBloodtransfusionPlatelets(bloodtransfusionPlatelets);
                med.setMedicalhistoryBloodtransfusionGrainclusters(bloodtransfusionGrainclusters);
                med.setMedicalhistoryBloodtransfusionPlasma(bloodtransfusionPlasma);
                med.setMedicalhistoryBloodtransfusionFreshfrozenplasma(bloodtransfusionFreshfrozenplasma);
                med.setMedicalhistoryBloodtransfusionPrecipitateVIII(bloodtransfusionPrecipitateVIII);
                med.setMedicalhistoryBloodtransfusionFullbloodtransfusion(bloodtransfusionFullbloodtransfusion);
                med.setMedicalhistoryTreatmentprocess(treatmentprocess);
                med.setMedicalhistoryUmmarizestheresults(ummarizestheresults);
                med.setMedicalhistoryTreatments(treatments);
                med.setMedicalhistoryDischargestatus(dischargestatus);
                med.setMedicalhistoryTreatmentdirectionandregimen(treatmentdirectionandregimen);
                System.out.println(med);
                return med;
            }
        } catch (Exception ex) {
            Logger.getLogger(MedicalHistoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void insert(MedicalHistory med){
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "insert into tbl_registation values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, med.getMedicalhistoryId());
            preparedStatement.setString(2, med.getMedicalhistoryCreatedDate());
            preparedStatement.setString(3, med.getMedicalhistoryUpdatedDate());
            preparedStatement.setString(4, med.getMedicalhistoryReason());
            preparedStatement.setString(5, med.getMedicalhistoryDate());
            preparedStatement.setString(6, med.getMedicalhistoryPathlogicalprocess());
            preparedStatement.setString(7, med.getMedicalhistoryDiseaseprofile());
            preparedStatement.setString(8, med.getMedicalhistoryBodySpiritofthesick());
            preparedStatement.setString(9, med.getMedicalhistoryBodyMillionhemorrhage());
            preparedStatement.setString(10, med.getMedicalhistoryBodyStyle());
            preparedStatement.setString(11, med.getMedicalhistoryBodySystemhair());
            preparedStatement.setString(12, med.getMedicalhistoryBodySkin());
            preparedStatement.setString(13, med.getMedicalhistoryBodyThyroid());
            preparedStatement.setString(14, med.getMedicalhistoryOrganizationLiverLocation());
            preparedStatement.setString(15, med.getMedicalhistoryOrganizationLiverSize());
            preparedStatement.setString(16, med.getMedicalhistoryOrganizationLiverDensity());
            preparedStatement.setString(17, med.getMedicalhistoryOrganizationLiverBo());
            preparedStatement.setString(18, med.getMedicalhistoryOrganizationLiverMatgan());
            preparedStatement.setString(19, med.getMedicalhistoryOrganizationLiverPain());
            preparedStatement.setString(20, med.getMedicalhistoryOrganizationSpleenLocation());
            preparedStatement.setString(21, med.getMedicalhistoryOrganizationSpleenSize());
            preparedStatement.setString(22, med.getMedicalhistoryOrganizationSpleenDensity());
            preparedStatement.setString(23, med.getMedicalhistoryOrganizationSpleenEdge());
            preparedStatement.setString(24, med.getMedicalhistoryOrganizationSpleenSpleen());
            preparedStatement.setString(25, med.getMedicalhistoryOrganizationSpleenPain());
            preparedStatement.setString(26, med.getMedicalhistoryOrganizationGanglionLocation());
            preparedStatement.setString(27, med.getMedicalhistoryOrganizationGanglionSize());
            preparedStatement.setString(28, med.getMedicalhistoryOrganizationGanglionDensity());
            preparedStatement.setString(29, med.getMedicalhistoryOrganizationGanglionEdge());
            preparedStatement.setString(30, med.getMedicalhistoryOrganizationGanglionLymphnodes());
            preparedStatement.setString(31, med.getMedicalhistoryOrganizationGanglionPain());
            preparedStatement.setString(32, med.getMedicalhistoryMedicalsummary());
            preparedStatement.setString(33, med.getMedicalhistoryMaindisease());
            preparedStatement.setString(34, med.getMedicalhistoryIncludingdiseases());
            preparedStatement.setString(35, med.getMedicalhistoryDiscern());
            preparedStatement.setString(36, med.getMedicalhistoryDetail());
            preparedStatement.setString(37, med.getMedicalhistoryTreat());
            preparedStatement.setInt(38, med.getMedicalhistoryBloodtransfusionRedbloodcells());
            preparedStatement.setInt(39, med.getMedicalhistoryBloodtransfusionSphericalwash());
            preparedStatement.setInt(40, med.getMedicalhistoryBloodtransfusionPlatelets());
            preparedStatement.setInt(41, med.getMedicalhistoryBloodtransfusionGrainclusters());
            preparedStatement.setInt(42, med.getMedicalhistoryBloodtransfusionPlasma ());
            preparedStatement.setInt(43, med.getMedicalhistoryBloodtransfusionFreshfrozenplasma());
            preparedStatement.setInt(44, med.getMedicalhistoryBloodtransfusionPrecipitateVIII());
            preparedStatement.setInt(45, med.getMedicalhistoryBloodtransfusionFullbloodtransfusion());
            preparedStatement.setString(46, med.getMedicalhistoryTreatmentprocess());
            preparedStatement.setString(47, med.getMedicalhistoryUmmarizestheresults());
            preparedStatement.setString(48, med.getMedicalhistoryTreatments());
            preparedStatement.setString(49, med.getMedicalhistoryDischargestatus());
            preparedStatement.setString(50, med.getMedicalhistoryTreatmentdirectionandregimen());
            preparedStatement.executeUpdate();
     
        } catch (Exception ex) {
            Logger.getLogger(MedicalHistoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        };
    }
    public void delete(int id){
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "delete from tbl_medicalhistory where medicalhistory_id=?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(MedicalHistoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void  update(MedicalHistory med){
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "update tbl_registation set medicalhistory_createddate=?,medicalhistory_updateddate=?,medicalhistory_why=?,medicalhistory_date=?,medicalhistory_pathlogicalprocess=?,medicalhistory_diseaseprofile=?,"
                    + "medicalhistory_body_spiritofthesick=?,medicalhistory_body_millionhemorrhage=?,medicalhistory_body_style=?,medicalhistory_body_systemhair=?,medicalhistory_body_skin=?,medicalhistory_body_Thyroid=?,"
                    + "medicalhistory_organization_liver_location=?,medicalhistory_organization_liver_size=?, medicalhistory_organization_liver_density=?, medicalhistory_organization_liver_bo=?, medicalhistory_organization_liver_matgan=?, "
                    + "medicalhistory_organization_liver_pain=?, medicalhistory_organization_spleen_location=?, medicalhistory_organization_spleen_size=?, medicalhistory_organization_spleen_density=?, medicalhistory_organization_spleen_edge=?, "
                    + "medicalhistory_organization_spleen_spleen=?, medicalhistory_organization_spleen_pain=?, medicalhistory_organization_ganglion_location=?, medicalhistory_organization_ganglion_size=?, medicalhistory_organization_ganglion_density=?, "
                    + "medicalhistory_organization_ganglion_edge=?, medicalhistory_organization_ganglion_lymphnodes=?, medicalhistory_organization_ganglion_pain=?, medicalhistory_medicalsummary=?, medicalhistory_maindisease=?, medicalhistory_includingdiseases=?,"
                    + "medicalhistory_discern=?, medicalhistory_detail=?, medicalhistory_treat=?, medicalhistory_bloodtransfusion_redbloodcells=?, medicalhistory_bloodtransfusion_sphericalwash=?, medicalhistory_bloodtransfusion_platelets=?,"
                    + "medicalhistory_bloodtransfusion_Grainclusters=?, medicalhistory_bloodtransfusion_plasma=?, medicalhistory_bloodtransfusion_freshfrozenplasma=?, medicalhistory_bloodtransfusion_precipitateVIII=?, medicalhistory_bloodtransfusion_fullbloodtransfusion=?,"
                    + "medicalhistory_treatmentprocess=?, medicalhistory_ummarizestheresults=?, medicalhistory_treatments=?,  medicalhistory_dischargestatus=?, medicalhistory_treatmentdirectionandregimen=? where registation_id=?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, med.getMedicalhistoryCreatedDate());
            preparedStatement.setString(2, med.getMedicalhistoryUpdatedDate());
            preparedStatement.setString(3, med.getMedicalhistoryReason());
            preparedStatement.setString(4, med.getMedicalhistoryDate());
            preparedStatement.setString(5, med.getMedicalhistoryPathlogicalprocess());
            preparedStatement.setString(6, med.getMedicalhistoryDiseaseprofile());
            preparedStatement.setString(7, med.getMedicalhistoryBodySpiritofthesick());
            preparedStatement.setString(8, med.getMedicalhistoryBodyMillionhemorrhage());
            preparedStatement.setString(9, med.getMedicalhistoryBodyStyle());
            preparedStatement.setString(10, med.getMedicalhistoryBodySystemhair());
            preparedStatement.setString(11, med.getMedicalhistoryBodySkin());
            preparedStatement.setString(12, med.getMedicalhistoryBodyThyroid());
            preparedStatement.setString(13, med.getMedicalhistoryOrganizationLiverLocation());
            preparedStatement.setString(14, med.getMedicalhistoryOrganizationLiverSize());
            preparedStatement.setString(15, med.getMedicalhistoryOrganizationLiverDensity());
            preparedStatement.setString(16, med.getMedicalhistoryOrganizationLiverBo());
            preparedStatement.setString(17, med.getMedicalhistoryOrganizationLiverMatgan());
            preparedStatement.setString(18, med.getMedicalhistoryOrganizationLiverPain());
            preparedStatement.setString(19, med.getMedicalhistoryOrganizationSpleenLocation());
            preparedStatement.setString(20, med.getMedicalhistoryOrganizationSpleenSize());
            preparedStatement.setString(21, med.getMedicalhistoryOrganizationSpleenDensity());
            preparedStatement.setString(22, med.getMedicalhistoryOrganizationSpleenEdge());
            preparedStatement.setString(23, med.getMedicalhistoryOrganizationSpleenSpleen());
            preparedStatement.setString(24, med.getMedicalhistoryOrganizationSpleenPain());
            preparedStatement.setString(25, med.getMedicalhistoryOrganizationGanglionLocation());
            preparedStatement.setString(26, med.getMedicalhistoryOrganizationGanglionSize());
            preparedStatement.setString(27, med.getMedicalhistoryOrganizationGanglionDensity());
            preparedStatement.setString(28, med.getMedicalhistoryOrganizationGanglionEdge());
            preparedStatement.setString(29, med.getMedicalhistoryOrganizationGanglionLymphnodes());
            preparedStatement.setString(30, med.getMedicalhistoryOrganizationGanglionPain());
            preparedStatement.setString(31, med.getMedicalhistoryMedicalsummary());
            preparedStatement.setString(32, med.getMedicalhistoryMaindisease());
            preparedStatement.setString(33, med.getMedicalhistoryIncludingdiseases());
            preparedStatement.setString(34, med.getMedicalhistoryDiscern());
            preparedStatement.setString(35, med.getMedicalhistoryDetail());
            preparedStatement.setString(36, med.getMedicalhistoryTreat());
            preparedStatement.setInt(37, med.getMedicalhistoryBloodtransfusionRedbloodcells());
            preparedStatement.setInt(38, med.getMedicalhistoryBloodtransfusionSphericalwash());
            preparedStatement.setInt(39, med.getMedicalhistoryBloodtransfusionPlatelets());
            preparedStatement.setInt(40, med.getMedicalhistoryBloodtransfusionGrainclusters());
            preparedStatement.setInt(41, med.getMedicalhistoryBloodtransfusionPlasma ());
            preparedStatement.setInt(42, med.getMedicalhistoryBloodtransfusionFreshfrozenplasma());
            preparedStatement.setInt(43, med.getMedicalhistoryBloodtransfusionPrecipitateVIII());
            preparedStatement.setInt(44, med.getMedicalhistoryBloodtransfusionFullbloodtransfusion());
            preparedStatement.setString(45, med.getMedicalhistoryTreatmentprocess());
            preparedStatement.setString(46, med.getMedicalhistoryUmmarizestheresults());
            preparedStatement.setString(47, med.getMedicalhistoryTreatments());
            preparedStatement.setString(48, med.getMedicalhistoryDischargestatus());
            preparedStatement.setString(49, med.getMedicalhistoryTreatmentdirectionandregimen());
            preparedStatement.setInt(50, med.getMedicalhistoryId());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(MedicalHistoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
