/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeeleven;

/**
 *
 * @author Vitaliy
 */
public class Shop <T>{
    public T[] data;
    public Shop(T[] data) {
        this.data = data;
    }
    
    public void printObject(){
        System.out.println(this.data);
    }
}
