/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homefour;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Vitaliy
 */
public class HomeFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My program!");
        frame.setBounds(200, 200, 850, 400);
        
        JPanel top = new JPanel();
        top.setBorder(new EmptyBorder(20, 0, 0, 0));
        JLabel label = new JLabel("My Form");
        top.add(label);
        
        JPanel form = new JPanel();
        JLabel nameL = new JLabel("Name: ");
        JTextField nameT = new JTextField();
        JLabel emailL = new JLabel("E-mail: ");
        JTextField emailT = new JTextField();
        nameL.setHorizontalAlignment(SwingConstants.RIGHT);
        emailL.setHorizontalAlignment(SwingConstants.RIGHT);
        
        nameT.setPreferredSize(new Dimension(200, 40));
        emailT.setPreferredSize(new Dimension(200, 40));
        form.add(nameL);
        form.add(nameT);
        form.add(emailL);
        form.add(emailT);
        
        JPanel bottom = new JPanel();
        JCheckBox checkbox_1 = new JCheckBox("HTML");
        JCheckBox checkbox_2 = new JCheckBox("JavaScript");
        JCheckBox checkbox_3 = new JCheckBox("PHP");
        JButton button = new JButton("Subscribe");
        bottom.add(checkbox_1);
        bottom.add(checkbox_2);
        bottom.add(checkbox_3);
        bottom.add(button);
        
        frame.add(top, BorderLayout.NORTH);
        frame.add(form, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
