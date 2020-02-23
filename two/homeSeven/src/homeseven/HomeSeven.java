/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeseven;

import javax.swing.JOptionPane;

/**
 *
 * @author Vitaliy
 */
public class HomeSeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String num_1, num_2;
        num_1 = JOptionPane.showInputDialog(null, "Enter pozitive the number_1:");
        if (num_1.equals("")) JOptionPane.showMessageDialog(null, "This is empty.");
        if (num_1 == "0") JOptionPane.showMessageDialog(null, "Результат: бесконечность:");
        num_2 = JOptionPane.showInputDialog(null, "Enter pozitive the number_1:");
        if (num_2.equals("")) JOptionPane.showMessageDialog(null, "This is empty.");
        if (num_2 == "0") JOptionPane.showMessageDialog(null, "Результат: бесконечность:");
        double result_1 = Double.parseDouble(num_1);
        double result_2 = Double.parseDouble(num_2);
        if (result_1 != 0 && result_2 != 0) {
            System.out.println(result_1 / result_2);
        }
    }
    
}
