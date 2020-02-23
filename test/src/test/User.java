/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import folder.MyClass;


/**
 *
 * @author Vitaliy
 */
public class User extends MyClass {
    public String login;
    
    public User(String name, int age, String login){
        super(name, age);
        this.login = login;
    }
    
    @Override
    public void print() {
        System.out.println("Print User");
    }
}
