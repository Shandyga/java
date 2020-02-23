/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homethree;

import javax.swing.JOptionPane;

/**
 *
 * @author Vitaliy
 */
public class HomeThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog(null, "Enter the number!");
        try {
            int numberParse = Integer.parseInt(number);
            //if (numberParse < 0) throw new Exception();
            JOptionPane.showMessageDialog(null, "Thank you!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input!");
            System.out.println(e);
        }
    }
    
}
