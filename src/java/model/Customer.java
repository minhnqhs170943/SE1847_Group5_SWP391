/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dohoa
 */
public class Customer {
    
    private int accountID;
    private String firstName;
    private String lastName;
    private String DOB;
    private int addressID;
    private String gmail;

    public Customer(int accountID, String firstName, String lastName, String DOB, int addressID, String gmail) {
        this.accountID = accountID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.addressID = addressID;
        this.gmail = gmail;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public int getAddressID() {
        return addressID;
    }

    public String getGmail() {
        return gmail;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}

