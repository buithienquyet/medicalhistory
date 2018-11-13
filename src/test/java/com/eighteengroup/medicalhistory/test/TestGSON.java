/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.test;

import com.google.gson.Gson;
import com.eighteengroup.medicalhistory.models.User;

/**
 *
 * @author quyet
 */
public class TestGSON {

    public static void main(String[] args) {
        Gson gson = new Gson();
        User user = new User();
        user.setUserName("BTQ");
        
        System.out.println(gson.toJson(user));        
    }
}
