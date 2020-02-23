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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Vitaliy", 33);
        System.out.println(myClass.name + " " + myClass.age);
        myClass.print();
        User user = new User("Vitaliy", 33, "Login");
        System.out.println(user.name + " " + user.age + " " + user.login);
        user.print();
    }
    
}
