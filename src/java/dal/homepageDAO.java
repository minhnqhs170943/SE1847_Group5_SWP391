/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Category;
import model.product;

/**
 *
 * @author LAPTOP ASUS
 */
public class homepageDAO extends DBContext {

    // Lay tat ca Category
    public List<Category> getAllCategory() {
        String sql = "SELECT * FROM category";
        List<Category> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1), rs.getString(2)));
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        }
        return list;
    }

    //lay 8 san pham apple
    public List<product> getNewApple() {
        String sql = "SELECT *\n"
                + "FROM (\n"
                + "    SELECT TOP 8 *\n"
                + "    FROM product\n"
                + "    WHERE CAST(id AS VARCHAR) LIKE '1%'\n"
                + "    ORDER BY release_date DESC\n"
                + ") AS recent_products\n"
                + "ORDER BY id ASC;";
        List<product> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(5),
                        rs.getDate(4),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)));
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Print stack trace to understand the issue
        }
        return list;

    }

    //lay 8 san pham samsung
    public List<product> getNewSamsung() {
        String sql = "SELECT *\n"
                + "FROM (\n"
                + "    SELECT TOP 8 *\n"
                + "    FROM product\n"
                + "    WHERE CAST(id AS VARCHAR) LIKE '2%'\n"
                + "    ORDER BY release_date DESC\n"
                + ") AS recent_products\n"
                + "ORDER BY id ASC;";
        List<product> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(5),
                        rs.getDate(4),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)));
            }
        } catch (SQLException e) {
        }
        return list;

    }

    //lay 9 san pham laptop gaming
    public List<product> getProductGaming() {
        String sql = "SELECT TOP 9 *\n"
                + "FROM product\n"
                + "WHERE categoryID = 2\n"
                + "  AND CAST(id AS VARCHAR) LIKE '9%';";
        List<product> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(5),
                        rs.getDate(4),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)));
            }
        } catch (SQLException e) {
        }
        return list;

    }

}
