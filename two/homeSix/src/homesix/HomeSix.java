/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homesix;

/**
 *
 * @author Vitaliy
 */
public class HomeSix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n_1 = 5;
        int n_2 = 10;
        String s_n_1 = Integer.toBinaryString(n_1);
        String s_n_2 = Integer.toBinaryString(n_2);
        System.out.println(s_n_1);
        System.out.println(s_n_2);
        System.out.println(s_n_1 + " & " + s_n_2 + " = " + Integer.toBinaryString(n_1 & n_2));
        System.out.println(s_n_1 + " | " + s_n_2 + " = " + Integer.toBinaryString(n_1 | n_2));
        System.out.println(s_n_1 + " >> 1 = " + Integer.toBinaryString(n_1 >> 1));
        System.out.println(s_n_1 + " << 1 = " + Integer.toBinaryString(n_1 << 1));
        System.out.println(" ~ " + n_1 + " = " + ~n_1);
    }
    
}
