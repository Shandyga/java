/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometwo;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Vitaliy
 */
public class HomeTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My program!");
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(100, 200, 800, 600);
        //System.out.println(size);
        //frame.setBounds(0, 0, size.width, size.height);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
