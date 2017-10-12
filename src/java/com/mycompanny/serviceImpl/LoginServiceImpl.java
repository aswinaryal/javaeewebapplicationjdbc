/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompanny.serviceImpl;

import com.mycompanny.dao.LoginDAO;
import com.mycompanny.daoImpl.LoginDAOImpl;
import com.mycompanny.entity.User;
import com.mycompanny.service.LoginService;

/**
 *
 * @author Ashwin
 */
public class LoginServiceImpl implements LoginService{

    @Override
    public boolean isAuthenticated(User user) {
        LoginDAO loginDAO = new LoginDAOImpl();
        return loginDAO.isAuthenticated(user);
    }
    
}
