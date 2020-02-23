/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometen;

import javax.swing.JOptionPane;

/**
 *
 * @author Vitaliy
 */
public class HomeTen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        do { 
            input = JOptionPane.showInputDialog(null, "Enter the pozitive number");
            if (input != null && input.equals("")) System.out.println("Enter the pozitive number");
            else {
                int inputParse = Integer.parseInt(input);
                break;
            }
        } while(true);
        JOptionPane.showMessageDialog(null, "Thank you!");
    }
    
}
