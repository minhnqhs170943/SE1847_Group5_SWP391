/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author LAPTOP ASUS
 */
public class Product {
    private int id;
    private String name;
    private String description;
    private int price;
    private Date releaseDate;
    private int quantity;
    private String url_img1, url_img2, url_img3, url_img4, url_img5;
    private int categoryId;

    public Product() {
    }

    public Product(int id, String name, String description, int price, Date releaseDate, int quantity, String url_img1, String url_img2, String url_img3, String url_img4, String url_img5, int categoryId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.releaseDate = releaseDate;
        this.quantity = quantity;
        this.url_img1 = url_img1;
        this.url_img2 = url_img2;
        this.url_img3 = url_img3;
        this.url_img4 = url_img4;
        this.url_img5 = url_img5;
        this.categoryId = categoryId;
    }
    
    public Product(int id, String name, String description, int price, Date releaseDate, int quantity, String url_img1, String url_img2, String url_img3, String url_img4, String url_img5) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.releaseDate = releaseDate;
        this.quantity = quantity;
        this.url_img1 = url_img1;
        this.url_img2 = url_img2;
        this.url_img3 = url_img3;
        this.url_img4 = url_img4;
        this.url_img5 = url_img5;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUrl_img1() {
        return url_img1;
    }

    public void setUrl_img1(String url_img1) {
        this.url_img1 = url_img1;
    }

    public String getUrl_img2() {
        return url_img2;
    }

    public void setUrl_img2(String url_img2) {
        this.url_img2 = url_img2;
    }

    public String getUrl_img3() {
        return url_img3;
    }

    public void setUrl_img3(String url_img3) {
        this.url_img3 = url_img3;
    }

    public String getUrl_img4() {
        return url_img4;
    }

    public void setUrl_img4(String url_img4) {
        this.url_img4 = url_img4;
    }

    public String getUrl_img5() {
        return url_img5;
    }

    public void setUrl_img5(String url_img5) {
        this.url_img5 = url_img5;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", releaseDate=" + releaseDate + ", quantity=" + quantity + ", url_img1=" + url_img1 + ", url_img2=" + url_img2 + ", url_img3=" + url_img3 + ", url_img4=" + url_img4 + ", url_img5=" + url_img5 + '}';
    }
    
    public String getFormattedPrice() {
        NumberFormat formatter = NumberFormat.getInstance(new Locale("vi", "VN"));
        return formatter.format(price);
    }

}
