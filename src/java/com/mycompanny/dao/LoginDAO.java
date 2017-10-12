/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompanny.dao;

import com.mycompanny.entity.User;

/**
 *
 * @author Ashwin
 */
public interface LoginDAO {
    public boolean isAuthenticated(User user);
}
