/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Vitaliy
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MySingleton obj1 = MySingleton.getMySingleton();
        System.out.println(obj1.x);
        obj1.x = 20;
        System.out.println(obj1.x);
        MySingleton obj2 = MySingleton.getMySingleton();
        System.out.println(obj2.x);
    }
    
}
