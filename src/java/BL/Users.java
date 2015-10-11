/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

/**
 *
 * @author Samuel
 */
public class Users {
    //Username
    private String Username;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    //Password
    private String Password;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    //Account type
    private String Account_Type;

    public String getAccount_Type() {
        return Account_Type;
    }

    public void setAccount_Type(String Account_Type) {
        this.Account_Type = Account_Type;
    }
}
