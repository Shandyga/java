/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homethree;

/**
 *
 * @author Vitaliy
 */
public class HomeThree {

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
        User user = new User(10, "Dod", "1234");
        user.setId(0);
        user.setLogin("Kiev");
        user.setPassword("0000");
        System.out.println(user.getId());
        System.out.println(user.getLogin());
        System.out.println(user.getPassword());
        
        user.setId();
        user.setLogin();
        user.setPassword();
        System.out.println(user.getId());
        System.out.println(user.getLogin());
        System.out.println(user.getPassword());
    }
    
}
