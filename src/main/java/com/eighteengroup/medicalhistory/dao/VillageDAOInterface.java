/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.Village;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface VillageDAOInterface {
    ArrayList<Village> getVillageByDistrictId(String id);
}
