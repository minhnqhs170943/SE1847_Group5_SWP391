/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Customer;

/**
 *
 * @author dohoa
 */
public class CustomerDAO extends DBContext{
    public boolean updateCustomer(Customer customer) {
        String sql = "UPDATE dbo.customer SET firstName = ?, lastName = ?, DOB = ?, gmail = ? WHERE accountID = ?";
        try (
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
             
            pstmt.setString(1, customer.getFirstName());
            pstmt.setString(2, customer.getLastName());
            pstmt.setDate(3, java.sql.Date.valueOf(customer.getDOB()));
            pstmt.setInt(4, customer.getAddressID());
            pstmt.setString(5, customer.getGmail());
            pstmt.setInt(6, customer.getAccountID());

            int rowsUpdated = pstmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
