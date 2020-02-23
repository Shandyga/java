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
public class HomeFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean b_1 = true;
        boolean b_2 = false;
        boolean b_3 = false;
        boolean resultA = b_1 && !(b_2 && b_3);
        System.out.println(resultA);
        boolean resultB = !b_1 || (b_2 || b_3);
        System.out.println(resultB);
        boolean resultC = b_1 ^ (b_2 ^ b_3);
        System.out.println(resultC);
    }
    
}
