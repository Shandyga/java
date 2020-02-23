/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeeight;

import javax.swing.JOptionPane;

/**
 *
 * @author Vitaliy
 */
public class HomeEight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String number;
        number = JOptionPane.showInputDialog(null, "Enter the number: ");
        if (number.equals("")) System.out.println("Error the number is empty;");
        else {
            double result = Double.parseDouble(number);
            if (result == 0) System.out.println("Error the number = 0;");
            else if (result < 0) System.out.println("Error the number < 0;");
            else {
                int summa = 0;
                for (int i = 1; i <= result; i++) {
                    summa += i;
                }
                    JOptionPane.showMessageDialog(null, summa);
            }
        }
    }
     
}
