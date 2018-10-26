package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.Medicament;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.media.Media;

/**
 *
 * @author Hoa
 */
/*bang thuoc*/
public class MedicamentDAO {

    public Medicament getMedicamentById(int id) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "select *from tbl_medicament where medicament_id=" + id;
            preparedStatement = con.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            Medicament met = new Medicament();
            while (resultSet.next()) {
                int metId = resultSet.getInt("medicament_id");
                String name = resultSet.getString("medicament_name");
                String createdDate = resultSet.getString("medicament_createddate");
                String quanlity = resultSet.getString("medicament_quantity");
                String typeofMedicine = resultSet.getString("medicament_typeofmedicine");
                met.setMedicamentId(metId);
                met.setMedicamentName(name);
                met.setMedicamentCreateddate(createdDate);
                met.setMedicamentQuantity(quanlity);
                met.setMedicamentTypeofmedicine(typeofMedicine);
                return met;
            }

        } catch (Exception ex) {
            Logger.getLogger(MedicamentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insert(Medicament met) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "insert into tbl_medicament values(?, ?, ?, ?, ?)";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, met.getMedicamentId());
            preparedStatement.setString(2, met.getMedicamentName());
            preparedStatement.setString(3, met.getMedicamentCreateddate());
            preparedStatement.setString(4, met.getMedicamentQuantity());
            preparedStatement.setString(5, met.getMedicamentTypeofmedicine());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(MedicamentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int id) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "delete from tbl_medicament where medicament_id=?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(MedicamentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Medicament met) {
        try {
            Connection con;
            con = new DatabaseConnection().getConnection();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            String sql = "update tbl_medicament set medicament_name=?, medicament_createddate=?, medicament_quantity=?, medicament_typeofmedicine=? where medicament_id=?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, met.getMedicamentName());
            preparedStatement.setString(2, met.getMedicamentCreateddate());
            preparedStatement.setString(3, met.getMedicamentQuantity());
            preparedStatement.setString(4, met.getMedicamentTypeofmedicine());
            preparedStatement.setInt(5, met.getMedicamentId());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(MedicamentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
