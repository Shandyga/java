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
        double d_1 = 5.4;
        double d_2 = 1.1;
        d_1++;
        double result_1 = d_1 + d_2;
        double result_2 = d_1 - d_2;
        double result_3 = d_1 * d_2;
        double result_4 = d_1 / d_2;
        System.out.println("Summa: " + result_1);
        System.out.println("Minus: " + result_2);
        System.out.println("Mult: " + result_3);
        System.out.println("Div: " + result_4);
        d_1 = d_1 + 5;
        d_1 += 5;
        System.out.println(d_1);
        int number = 8 % 3;
        System.out.println("Ostatok: " + number);
    }
    
}
