/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeeleven;

import javax.swing.JOptionPane;

/**
 *
 * @author Vitaliy
 */
public class HomeEleven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String num_1, num_2, operation;
        num_1 = JOptionPane.showInputDialog(null, "Enter the num_1");
        num_2 = JOptionPane.showInputDialog(null, "Enter the num_2");
        if (num_1 != null && num_1.equals("") || num_2 != null && num_2.equals("")) System.out.println("Error null or \" \"!");
        else {
            operation = JOptionPane.showInputDialog(null, "Enter the operation + or - or * or / ");
            int num_1_parse = Integer.parseInt(num_1);
            int num_2_parse = Integer.parseInt(num_2);
            int result;
            switch(operation) {
                case "+":
                    result = num_1_parse + num_2_parse;
                    JOptionPane.showMessageDialog(null, result);
                    break;
                case "-":
                    result = num_1_parse - num_2_parse;
                    JOptionPane.showMessageDialog(null, result);
                    break;
                case "*":
                    result = num_1_parse * num_2_parse;
                    JOptionPane.showMessageDialog(null, result);
                    break;
                case "/":
                    result = num_1_parse / num_2_parse;
                    JOptionPane.showMessageDialog(null, result);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Another operation!");
            }
            //System.out.println("Hello!");
        }
    }
    
}
