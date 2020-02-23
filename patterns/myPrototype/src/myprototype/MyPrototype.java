/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprototype;

/**
 *
 * @author Vitaliy
 */
public class MyPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prototype p1 = new Prototype(5, 10);
        System.out.println(p1);
        Prototype p2 = p1.clone();
        System.out.println(p2);
    }
    
}
