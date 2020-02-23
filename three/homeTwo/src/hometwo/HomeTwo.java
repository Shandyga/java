/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometwo;

/**
 *
 * @author Vitaliy
 */
public class HomeTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User[] obj_1 = new User[2];
        obj_1[0] = new User(1, "Star", "1111");
        obj_1[1] = new User(2, "Lord", "1112");
        //System.out.println(obj_1.length);
        for (int i = 0; i < obj_1.length; i++) {
            System.out.println("id = " + obj_1[i].id + "; login = " + obj_1[i].login + "; password = " + obj_1[i].password);
        }
    }
    
}
