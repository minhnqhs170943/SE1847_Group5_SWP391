/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.brand;
import model.product;

/**
 *
 * @author tran tung
 */
public class productListDAO extends DBContext{
    public List<product> getProductList() {
        List<product> productList = new ArrayList<>();
        String sql = "SELECT * FROM dbo.product";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
//                int id1, String name2, String description3, int price4, int quality5, String url_img1 6, String url_img2 7, String url_img3 8, String url_img4 9 String url_img5 10, int categoryID 11, int brandID 12, String code 13, Date date 14
                productList.add(new product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getInt(12),rs.getString(13),rs.getDate(14)));
            }
            System.out.println(productList);

        } catch (Exception e) {
            System.out.println(e);
        }
        return productList;
    }
   
    public List<product> getPhoneList() {
        List<product> productList = new ArrayList<>();
        String sql = "SELECT * FROM dbo.product where categoryID = 1";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
//                int id1, String name2, String description3, int price4, int quality5, String url_img1 6, String url_img2 7, String url_img3 8, String url_img4 9 String url_img5 10, int categoryID 11, int brandID 12, String code 13, Date date 14
                productList.add(new product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getInt(12),rs.getString(13),rs.getDate(14)));
            }
            System.out.println(productList);

        } catch (Exception e) {
            System.out.println(e);
        }
        return productList;
    }
    public List<product> getLaptopList() {
        List<product> productList = new ArrayList<>();
        String sql = "SELECT * FROM dbo.product where categoryID = 3";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
//                int id1, String name2, String description3, int price4, int quality5, String url_img1 6, String url_img2 7, String url_img3 8, String url_img4 9 String url_img5 10, int categoryID 11, int brandID 12, String code 13, Date date 14
                productList.add(new product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getInt(12),rs.getString(13),rs.getDate(14)));
            }
            System.out.println(productList);

        } catch (Exception e) {
            System.out.println(e);
        }
        return productList;
    }
    public List<product> getTabletList() {
        List<product> productList = new ArrayList<>();
        String sql = "SELECT * FROM dbo.product where categoryID = 2";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
//                int id1, String name2, String description3, int price4, int quality5, String url_img1 6, String url_img2 7, String url_img3 8, String url_img4 9 String url_img5 10, int categoryID 11, int brandID 12, String code 13, Date date 14
                productList.add(new product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getInt(12),rs.getString(13),rs.getDate(14)));
            }
            System.out.println(productList);

        } catch (Exception e) {
            System.out.println(e);
        }
        return productList;
    }
    
    
    
    
    
    public String getBrandName(int id) {
        String sql = "SELECT brandName FROM dbo.brand WHERE id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getString("brandName");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        
        
        
        
        
    }
     public static void main(String[] args) {
        productListDAO dao = new productListDAO();
        String name = dao.getBrandName(1);
           
        System.out.println(name);
  
    
    
    
    
    }
}