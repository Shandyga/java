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
public class MySingleton {
    public int x;
    private static MySingleton object;
    
    private MySingleton() {
        this.x = 10;
    }
    
    public static MySingleton getMySingleton() {
        if(object == null) object =  new MySingleton();
        return object;
    }
}
