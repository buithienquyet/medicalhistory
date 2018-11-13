
package com.eighteengroup.medicalhistory.dao;
import com.eighteengroup.medicalhistory.models.LaboratoryResultsBlood;
import com.eighteengroup.medicalhistory.models.Registration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hoa
 */
/*Kết quả xét nghiệm hoá sinh máu*/
public class LaboratoryResultsBloodDAO {
    public LaboratoryResultsBlood getLaboratoryResultsBloodById(int id){
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "select * from tbl_laboratoryresultsblood where laboratoryresultsblood_id=?";
            preparedStatement = con.prepareStatement(sql);
            // Result set get the result of the SQL query
            resultSet = preparedStatement.executeQuery();
            LaboratoryResultsBlood lab = new LaboratoryResultsBlood();
            while (resultSet.next()) {                
                
                String namepatient = resultSet.getString("laboratoryresultsblood_namepatient");
                String address = resultSet.getString("laboratoryresultsblood_address");
                String sex = resultSet.getString("laboratoryresultsblood_sex");
                String faculty = resultSet.getString("laboratoryresultsblood_faculty");
                String diagnose = resultSet.getString("laboratoryresultsblood_diagnose");
                String ure = resultSet.getString("laboratoryresultsblood_Ure");
                String glucose = resultSet.getString("laboratoryresultsblood_Glucose");
                String creatinin = resultSet.getString("laboratoryresultsblood_Creatinin");
                String acidUric = resultSet.getString("laboratoryresultsblood_AcidUric");
                String bilirubinTP = resultSet.getString("laboratoryresultsblood_BilirubinTP");
                String bilirubinTT = resultSet.getString("laboratoryresultsblood_BilirubinTT");
                String bilirubinGT = resultSet.getString("laboratoryresultsblood_BilirubinGT");
                String proteinTP = resultSet.getString("laboratoryresultsblood_ProteinTP");
                String albumin = resultSet.getString("laboratoryresultsblood_Albumin");
                String globulin = resultSet.getString("laboratoryresultsblood_Globulin");
                String ratioAG = resultSet.getString("laboratoryresultsblood_ratioAG");
                String fibrinogen = resultSet.getString("laboratoryresultsblood_Fibrinogen");
                String cholesterol = resultSet.getString("laboratoryresultsblood_Cholesterol");
                String triglycerid = resultSet.getString("laboratoryresultsblood_Triglycerid");
                String HDLcho = resultSet.getString("laboratoryresultsblood_HDLcho");
                String LDLcho = resultSet.getString("laboratoryresultsblood_LDLcho");
                String Na = resultSet.getString("laboratoryresultsblood_Na");
                String K = resultSet.getString("laboratoryresultsblood_K");
                String Cl = resultSet.getString("laboratoryresultsblood_Cl");
                String Calci = resultSet.getString("laboratoryresultsblood_Calci");
                String CalciIonHoa = resultSet.getString("laboratoryresultsblood_CalciIonHoa");
                String Fe = resultSet.getString("laboratoryresultsblood_Fe");
                String Magie = resultSet.getString("laboratoryresultsblood_Magie");
                String AST = resultSet.getString("laboratoryresultsblood_AST");
                String Amylase = resultSet.getString("laboratoryresultsblood_Amylase");
                String CK = resultSet.getString("laboratoryresultsblood_CK");
                String CKMB = resultSet.getString("laboratoryresultsblood_CKMB");
                String LDH = resultSet.getString("laboratoryresultsblood_LDH");
                String GGT = resultSet.getString("laboratoryresultsblood_GGT");
                String Cholinesterase = resultSet.getString("laboratoryresultsblood_Cholinesterase");
                String Phosphatasekiem = resultSet.getString("laboratoryresultsblood_Phosphatasekiem");
                String pHartery = resultSet.getString("laboratoryresultsblood_pHartery");
                String pCO2 = resultSet.getString("laboratoryresultsblood_pCO2");
                String pO2artery = resultSet.getString("laboratoryresultsblood_pO2artery");
                String HCO3standard = resultSet.getString("laboratoryresultsblood_HCO3standard");
                String Kiemdu = resultSet.getString("laboratoryresultsblood_Kiemdu");
                String createdDate = resultSet.getString("laboratoryresultsblood_createddate");
                String attendingdoctor = resultSet.getString("laboratoryresultsblood_attendingdoctor");
                String analysisdepartmenthead = resultSet.getString("laboratoryresultsblood_analysisdepartmenthead");
                preparedStatement.setInt(1, id);
                lab.setLaboratoryresultsbloodNamepatient(namepatient);
                lab.setLaboratoryresultsbloodAddress(address);
                lab.setLaboratoryresultsbloodFaculty(faculty);
                lab.setLaboratoryresultsbloodDiagnose(diagnose);
                lab.setLaboratoryresultsbloodUre(ure);
                lab.setLaboratoryresultsbloodGlucose(glucose);
                lab.setLaboratoryresultsbloodCreatinin(creatinin);
                lab.setLaboratoryresultsbloodAcidUric(acidUric);
                lab.setLaboratoryresultsbloodBilirubinTP(bilirubinTP);
                lab.setLaboratoryresultsbloodBilirubinTT(bilirubinTT);
                lab.setLaboratoryresultsbloodBilirubinGT(bilirubinGT);
                lab.setLaboratoryresultsbloodProteinTP(proteinTP);
                lab.setLaboratoryresultsbloodAlbumin(albumin);
                lab.setLaboratoryresultsbloodGlobulin(globulin);
                lab.setLaboratoryresultsbloodRatioAG(ratioAG);
                lab.setLaboratoryresultsbloodFibrinogen(fibrinogen);
                lab.setLaboratoryresultsbloodCholesterol(cholesterol);
                lab.setLaboratoryresultsbloodTriglycerid(triglycerid);
                lab.setLaboratoryresultsbloodHDLcho(HDLcho);
                lab.setLaboratoryresultsbloodLDLcho(LDLcho);
                lab.setLaboratoryresultsbloodNa(Na);
                lab.setLaboratoryresultsbloodK(K);
                lab.setLaboratoryresultsbloodCl(Cl);
                lab.setLaboratoryresultsbloodCalci(Calci);
                lab.setLaboratoryresultsbloodCalciIonHoa(CalciIonHoa);
                lab.setLaboratoryresultsbloodFe(Fe);
                lab.setLaboratoryresultsbloodMagie(Magie);
                lab.setLaboratoryresultsbloodAST(AST);
                lab.setLaboratoryresultsbloodAmylase(Amylase);
                lab.setLaboratoryresultsbloodCK(CK);
                lab.setLaboratoryresultsbloodCKMB(CKMB);
                lab.setLaboratoryresultsbloodLDH(LDH);
                lab.setLaboratoryresultsbloodGGT(bilirubinGT);
                lab.setLaboratoryresultsbloodCholinesterase(Cholinesterase);
                lab.setLaboratoryresultsbloodPhosphatasekiem(Phosphatasekiem);
                lab.setLaboratoryresultsbloodPHartery(pHartery);
                lab.setLaboratoryresultsbloodPCO2(pCO2);
                lab.setLaboratoryresultsbloodPO2artery(pO2artery);
                lab.setLaboratoryresultsbloodHCO3standard(HCO3standard);
                lab.setLaboratoryresultsbloodKiemdu(Kiemdu);
                lab.setLaboratoryresultsbloodCreatedDate(createdDate);
                lab.setLaboratoryresultsbloodAttendingDoctor(attendingdoctor);
                lab.setLaboratoryresultsbloodAnalysisDepartmentHead(analysisdepartmenthead);
                return lab;
            }
            
        } catch (Exception ex) {
            Logger.getLogger(LaboratoryResultsBloodDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void insert(LaboratoryResultsBlood lab){
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "insert into tbl_laboratoryresultsblood values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, lab.getLaboratoryresultsbloodId());
            preparedStatement.setString(2, lab.getLaboratoryresultsbloodNamepatient());
            preparedStatement.setString(3, lab.getLaboratoryresultsbloodAddress());
            preparedStatement.setString(4, lab.getLaboratoryresultsbloodSex());
            preparedStatement.setString(5, lab.getLaboratoryresultsbloodFaculty());
            preparedStatement.setString(6, lab.getLaboratoryresultsbloodDiagnose());
            preparedStatement.setString(7, lab.getLaboratoryresultsbloodUre());
            preparedStatement.setString(8, lab.getLaboratoryresultsbloodGlucose());
            preparedStatement.setString(9, lab.getLaboratoryresultsbloodCreatinin());
            preparedStatement.setString(10, lab.getLaboratoryresultsbloodAcidUric());
            preparedStatement.setString(11, lab.getLaboratoryresultsbloodBilirubinTP());
            preparedStatement.setString(12, lab.getLaboratoryresultsbloodBilirubinTT());
            preparedStatement.setString(13, lab.getLaboratoryresultsbloodBilirubinGT());
            preparedStatement.setString(14, lab.getLaboratoryresultsbloodProteinTP());
            preparedStatement.setString(15, lab.getLaboratoryresultsbloodAlbumin());
            preparedStatement.setString(16, lab.getLaboratoryresultsbloodGlobulin());
            preparedStatement.setString(17, lab.getLaboratoryresultsbloodRatioAG());
            preparedStatement.setString(18, lab.getLaboratoryresultsbloodFibrinogen());
            preparedStatement.setString(19, lab.getLaboratoryresultsbloodCholesterol());
            preparedStatement.setString(20, lab.getLaboratoryresultsbloodTriglycerid());
            preparedStatement.setString(21, lab.getLaboratoryresultsbloodHDLcho());
            preparedStatement.setString(22, lab.getLaboratoryresultsbloodLDLcho());
            preparedStatement.setString(23, lab.getLaboratoryresultsbloodNa());
            preparedStatement.setString(24, lab.getLaboratoryresultsbloodK());
            preparedStatement.setString(25, lab.getLaboratoryresultsbloodCl());
            preparedStatement.setString(26, lab.getLaboratoryresultsbloodCalci());
            preparedStatement.setString(27, lab.getLaboratoryresultsbloodCalciIonHoa());
            preparedStatement.setString(28, lab.getLaboratoryresultsbloodFe());
            preparedStatement.setString(29, lab.getLaboratoryresultsbloodMagie());
            preparedStatement.setString(30, lab.getLaboratoryresultsbloodAST());
            preparedStatement.setString(31, lab.getLaboratoryresultsbloodAmylase());
            preparedStatement.setString(32, lab.getLaboratoryresultsbloodCK());
            preparedStatement.setString(33, lab.getLaboratoryresultsbloodCKMB());
            preparedStatement.setString(34, lab.getLaboratoryresultsbloodLDH());
            preparedStatement.setString(35, lab.getLaboratoryresultsbloodGGT());
            preparedStatement.setString(36, lab.getLaboratoryresultsbloodCholinesterase());
            preparedStatement.setString(37, lab.getLaboratoryresultsbloodPhosphatasekiem());
            preparedStatement.setString(38, lab.getLaboratoryresultsbloodPHartery());
            preparedStatement.setString(39, lab.getLaboratoryresultsbloodPCO2());
            preparedStatement.setString(40, lab.getLaboratoryresultsbloodPO2artery());
            preparedStatement.setString(41, lab.getLaboratoryresultsbloodHCO3standard());
            preparedStatement.setString(42, lab.getLaboratoryresultsbloodKiemdu());
            preparedStatement.setString(43, lab.getLaboratoryresultsbloodCreatedDate());
            preparedStatement.setString(44, lab.getLaboratoryresultsbloodAttendingDoctor());
            preparedStatement.setString(45, lab.getLaboratoryresultsbloodAnalysisDepartmentHead());
            preparedStatement.executeUpdate();
            
        } catch (Exception ex) {
            Logger.getLogger(LaboratoryResultsBloodDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void delete(int id){
         try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "delete from tbl_laboratoryresultsblood where laboratoryresultsblood_id=?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(LaboratoryResultsBloodDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void update(LaboratoryResultsBlood lab){
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "update tbl_laboratoryresultsblood set laboratoryresultsblood_namepatient=?,laboratoryresultsblood_address=?,laboratoryresultsblood_sex=?,laboratoryresultsblood_faculty=?,laboratoryresultsblood_diagnose=?,laboratoryresultsblood_Ure=?,"
                    + "laboratoryresultsblood_Glucose=?,laboratoryresultsblood_Creatinin=?,laboratoryresultsblood_AcidUric=?,laboratoryresultsblood_BilirubinTP=?,laboratoryresultsblood_BilirubinTT=?,laboratoryresultsblood_BilirubinGT=?,laboratoryresultsblood_ProteinTP=?,"
                    + "laboratoryresultsblood_Albumin=?,laboratoryresultsblood_Globulin=?,laboratoryresultsblood_ratioAG=?,laboratoryresultsblood_Fibrinogen=?,laboratoryresultsblood_Cholesterol=?,laboratoryresultsblood_Triglycerid=?,laboratoryresultsblood_HDLcho=?,"
                    + "laboratoryresultsblood_LDLcho=?,laboratoryresultsblood_Na=?,laboratoryresultsblood_K=?,laboratoryresultsblood_Cl=?,laboratoryresultsblood_Calci=?,laboratoryresultsblood_CalciIonHoa=?,laboratoryresultsblood_Fe=?,laboratoryresultsblood_Magie=?"
                    + "laboratoryresultsblood_AST=?,laboratoryresultsblood_Amylase=?,laboratoryresultsblood_CK=?,laboratoryresultsblood_CKMB=?,laboratoryresultsblood_LDH=?,laboratoryresultsblood_GGT=?,laboratoryresultsblood_Cholinesterase=?,laboratoryresultsblood_Phosphatasekiem=?,"
                    + "laboratoryresultsblood_pHartery=?,laboratoryresultsblood_pCO2=?,laboratoryresultsblood_pO2artery=?,laboratoryresultsblood_HCO3standard=?,laboratoryresultsblood_Kiemdu=?,laboratoryresultsblood_createddate=?,laboratoryresultsblood_attendingdoctor=?,laboratoryresultsblood_analysisdepartmenthead=? where laboratoryresultsblood_id=?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, lab.getLaboratoryresultsbloodNamepatient());
            preparedStatement.setString(2, lab.getLaboratoryresultsbloodAddress());
            preparedStatement.setString(3, lab.getLaboratoryresultsbloodSex());
            preparedStatement.setString(4, lab.getLaboratoryresultsbloodFaculty());
            preparedStatement.setString(5, lab.getLaboratoryresultsbloodDiagnose());
            preparedStatement.setString(6, lab.getLaboratoryresultsbloodUre());
            preparedStatement.setString(7, lab.getLaboratoryresultsbloodGlucose());
            preparedStatement.setString(8, lab.getLaboratoryresultsbloodCreatinin());
            preparedStatement.setString(9, lab.getLaboratoryresultsbloodAcidUric());
            preparedStatement.setString(10, lab.getLaboratoryresultsbloodBilirubinTP());
            preparedStatement.setString(11, lab.getLaboratoryresultsbloodBilirubinTT());
            preparedStatement.setString(12, lab.getLaboratoryresultsbloodBilirubinGT());
            preparedStatement.setString(13, lab.getLaboratoryresultsbloodProteinTP());
            preparedStatement.setString(14, lab.getLaboratoryresultsbloodAlbumin());
            preparedStatement.setString(15, lab.getLaboratoryresultsbloodGlobulin());
            preparedStatement.setString(16, lab.getLaboratoryresultsbloodRatioAG());
            preparedStatement.setString(17, lab.getLaboratoryresultsbloodFibrinogen());
            preparedStatement.setString(18, lab.getLaboratoryresultsbloodCholesterol());
            preparedStatement.setString(19, lab.getLaboratoryresultsbloodTriglycerid());
            preparedStatement.setString(20, lab.getLaboratoryresultsbloodHDLcho());
            preparedStatement.setString(21, lab.getLaboratoryresultsbloodLDLcho());
            preparedStatement.setString(22, lab.getLaboratoryresultsbloodNa());
            preparedStatement.setString(23, lab.getLaboratoryresultsbloodK());
            preparedStatement.setString(24, lab.getLaboratoryresultsbloodCl());
            preparedStatement.setString(25, lab.getLaboratoryresultsbloodCalci());
            preparedStatement.setString(26, lab.getLaboratoryresultsbloodCalciIonHoa());
            preparedStatement.setString(27, lab.getLaboratoryresultsbloodFe());
            preparedStatement.setString(28, lab.getLaboratoryresultsbloodMagie());
            preparedStatement.setString(29, lab.getLaboratoryresultsbloodAST());
            preparedStatement.setString(30, lab.getLaboratoryresultsbloodAmylase());
            preparedStatement.setString(31, lab.getLaboratoryresultsbloodCK());
            preparedStatement.setString(32, lab.getLaboratoryresultsbloodCKMB());
            preparedStatement.setString(33, lab.getLaboratoryresultsbloodLDH());
            preparedStatement.setString(34, lab.getLaboratoryresultsbloodGGT());
            preparedStatement.setString(35, lab.getLaboratoryresultsbloodCholinesterase());
            preparedStatement.setString(36, lab.getLaboratoryresultsbloodPhosphatasekiem());
            preparedStatement.setString(37, lab.getLaboratoryresultsbloodPHartery());
            preparedStatement.setString(38, lab.getLaboratoryresultsbloodPCO2());
            preparedStatement.setString(39, lab.getLaboratoryresultsbloodPO2artery());
            preparedStatement.setString(40, lab.getLaboratoryresultsbloodHCO3standard());
            preparedStatement.setString(41, lab.getLaboratoryresultsbloodKiemdu());
            preparedStatement.setString(42, lab.getLaboratoryresultsbloodCreatedDate());
            preparedStatement.setString(43, lab.getLaboratoryresultsbloodAttendingDoctor());
            preparedStatement.setString(44, lab.getLaboratoryresultsbloodAnalysisDepartmentHead());
            preparedStatement.setInt(45, lab.getLaboratoryresultsbloodId());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(LaboratoryResultsBloodDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
