package com.mycompanny.daoImpl;

import com.mycompanny.dao.LoginDAO;
import com.mycompanny.dbUtils.DbConfig;
import com.mycompanny.entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Ashwin
 */
public class LoginDAOImpl implements LoginDAO {

    @Override
    public boolean isAuthenticated(User user) {
        boolean exists = false;

        Connection connection = DbConfig.getConnection();
        String sql = "SELECT * FROM users WHERE username=? AND password = ?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                exists = true;
            }
        }catch (SQLException ex) {
            System.out.println("Exception=====>"+ex);
        }

        return exists;
    }

}
