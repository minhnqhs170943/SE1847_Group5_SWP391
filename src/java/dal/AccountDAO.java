/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import model.Account;
import java.sql.*;
/**
 *
 * @author ADMIN
 */
public class AccountDAO extends DBContext {

    public boolean insertUser(Account user) {
        String sql = "INSERT INTO [account]\n"
                + "           ([username]\n"
                + "           ,[password]\n"
                + "           ,[roleID])\n"
                + "     VALUES\n"
                + "           (? , ? , ?)";
        connection = new DBContext().connection;
        try {
            statement = connection.prepareStatement(sql);
            statement.setObject(1, user.getUsername());
            statement.setObject(2, user.getPassword());
            statement.setObject(3, user.getRoleID());
            return statement.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return false;
    }

    public Account findByEmail(String email) {
        String sql = "SELECT * \n"
                + "FROM account\n"
                + "WHERE email = ?";
        connection = new DBContext().connection;
        try {
            statement = connection.prepareStatement(sql);
            statement.setObject(1, email);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Account account = mapResultSetToAccount(resultSet);
                return account;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return null;
    }
    
    private Account mapResultSetToAccount(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String username = resultSet.getString("username");
        String password = resultSet.getString("password");
        int roleID = resultSet.getInt("roleID");
        Account account = new Account(id, username, password, roleID);
        return account;
    }

}
