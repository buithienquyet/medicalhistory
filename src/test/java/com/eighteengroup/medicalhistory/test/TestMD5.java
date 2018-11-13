/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.test;
import com.eighteengroup.medicalhistory.models.User;
import java.security.NoSuchAlgorithmException;

import com.eighteengroup.medicalhistory.dao.*;
import com.eighteengroup.medicalhistory.models.Registration;
/**
 *
 * @author Admin
 */
public class TestMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        User usr = new User();
        usr.setPassword("12345");
        System.out.println(usr.getPassword());
    }
    
}
