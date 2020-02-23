/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homenine;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Vitaliy
 */
public class HomeNine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My program");
        frame.setBounds(200, 200, 500, 250);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Text");
        JTextField textF = new JTextField(25);
        panel.add(label);
        panel.add(textF);
        
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
