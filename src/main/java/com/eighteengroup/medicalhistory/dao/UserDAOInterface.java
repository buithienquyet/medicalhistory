/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eighteengroup.medicalhistory.dao;

import com.eighteengroup.medicalhistory.models.*;
import java.util.ArrayList;

/**
 *
 * @author quyet
 */
public interface UserDAOInterface {
    User getUser(String username, String password);
    ArrayList<User> getUser();
    void insert(User user);
    public User getUserById(long id);
}
