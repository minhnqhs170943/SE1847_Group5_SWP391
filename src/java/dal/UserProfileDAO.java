/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.UserProfile;

/**
 *
 * @author dohoa
 */
public class UserProfileDAO extends DBContext{
    public ArrayList<UserProfile> getAll() {
    ArrayList<UserProfile> listUserProfile = new ArrayList<>();
    try {
        String sql = "SELECT customer.id, [accountID], [firstName], [lastName], [DOB], [addressID], [gmail], " +
                     "address.description, address.commune, address.district, address.city " +
                     "FROM [dbo].[customer] INNER JOIN address ON address.id = customer.addressID";
        try (PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                UserProfile userprofile = new UserProfile();
                userprofile.setId(rs.getInt("id"));
                userprofile.setAccountID(rs.getString("accountID"));
                userprofile.setFirstName(rs.getString("firstName"));
                userprofile.setLastName(rs.getString("lastName"));
                userprofile.setDOB(rs.getString("DOB"));
                userprofile.setGmail(rs.getString("gmail"));
                userprofile.setAddressID(rs.getString("addressID"));
                userprofile.setDescription(rs.getString("description"));
                userprofile.setCommune(rs.getString("commune"));
                userprofile.setDistrict(rs.getString("district"));
                userprofile.setCity(rs.getString("city"));
                
                listUserProfile.add(userprofile);
            }
        }
    } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        }
    return listUserProfile;
}
 public UserProfile getUserProfile(int cID) {
    UserProfile userProfile = null;
    String sql = """
                 SELECT customer.id,
                        [accountID],
                        [firstName],
                        [lastName],
                        [DOB],
                        [addressID],
                        [gmail],
                        address.description,
                        address.commune,
                        address.district,
                        address.city
                 FROM [dbo].[customer]
                 INNER JOIN address ON address.id = customer.addressID
                 WHERE customer.id = ?""";

    try (PreparedStatement ps = connection.prepareStatement(sql)) {
        ps.setInt(1, cID);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                userProfile = new UserProfile();
                userProfile.setId(rs.getInt("id"));
                userProfile.setAccountID(rs.getString("accountID"));
                userProfile.setFirstName(rs.getString("firstName"));
                userProfile.setLastName(rs.getString("lastName"));
                userProfile.setDOB(rs.getString("DOB"));
                userProfile.setGmail(rs.getString("gmail"));
                userProfile.setAddressID(rs.getString("addressID"));
                userProfile.setDescription(rs.getString("description"));
                userProfile.setCommune(rs.getString("commune"));
                userProfile.setDistrict(rs.getString("district"));
                userProfile.setCity(rs.getString("city"));
            }
        }
    } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        }
    

    return userProfile;
}   
       
}
    

