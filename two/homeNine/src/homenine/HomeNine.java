/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homenine;

import javax.swing.JOptionPane;

/**
 *
 * @author Vitaliy
 */
public class HomeNine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        input = JOptionPane.showInputDialog(null, "Ввести неотрицательно целое число", JOptionPane.QUESTION_MESSAGE);
        if (input != null && !input.equals("")) {
            int inputParse = Integer.parseInt(input);
            if (inputParse < 0) System.out.println("Число отрицательное так нельзя");
            else {
                int summa = 1;
                int i = 1;
                if (inputParse < 2) System.out.println("Factorial = 1");
                else {
                    while (i <= inputParse) {
                        summa *= i;
                        //System.out.println("Factorial " + i + " = " + summa);
                        JOptionPane.showMessageDialog(null, "Factorial " + i + " = " + summa);
                        i++;
                    }
                }
            }
        }
    }
    
}
