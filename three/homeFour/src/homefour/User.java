/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homefour;

/**
 *
 * @author Vitaliy
 */
public class User {
    private int id;
    private String login;
    private String password;
    public User(int id, String login, String password){
        this.id = id;
        this.login = login;
        this.password = password;
    }
    
    /*public void setId(int id) {
        this.id = id;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    
    public void setId() {
        setId(12);
    }
    public void setLogin() {
        setLogin("Default guest");
    }
    public void setPassword() {
        setPassword("Default password");
    }*/
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getLogin() {
        return login;
    }
}
