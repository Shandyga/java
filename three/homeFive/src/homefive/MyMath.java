/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homefive;

/**
 *
 * @author Vitaliy
 */
public class MyMath {
    
    private static int count = 0;
    
    /*public MyMath() {
        count++;
    }*/
    
    static int  getAdd(int number_1, int number_2) {
        return number_1 + number_2;
    }
    
    static int getSub(int number_1, int number_2) {
        return number_1 - number_2;
    }
    
    
    static int getMult(int number_1, int number_2) {
        return number_1 * number_2;
    }
    
    static int getDiv(int number_1, int number_2) {
        return number_1 / number_2;
    }
    
    static int getCount() {
        return count++;
    }
}
