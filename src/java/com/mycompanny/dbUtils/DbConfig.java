/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompanny.dbUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ashwin
 */
public class DbConfig {
    public static void main(String[] args) {
        getConnection();
    }
    
    public static Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            System.out.println("Database Connected Successfully");
        
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Exception=====>"+ex);
        }
        return connection;
    }
}
