/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import controller.UserGoogleDto;
import model.Account;

/**
 *
 * @author ADMIN
 */
public class AccountUtils {

    public static Account convertToAccount(UserGoogleDto userGoogleDto) {
        Account account = new Account();
        account.setUsername(userGoogleDto.getEmail());
        account.setPassword(""); // Set default or encrypted password
        account.setRoleID(1); // Default role ID, adjust as needed
        return account;
    }
}
