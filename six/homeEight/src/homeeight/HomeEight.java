/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeeight;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author Vitaliy
 */
public class HomeEight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My program");
        frame.setBounds(200, 200, 500, 250);
        JPanel panel = new JPanel();
        JButton button = new JButton("Button");
        button.setPreferredSize(new Dimension(80, 25));
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
              System.out.println("1");
            }

            @Override
            public void keyPressed(KeyEvent ke) {
              System.out.println("2");
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
              System.out.println("3");
              System.out.println(ke.getKeyCode()); 
              if (ke.getKeyCode() == 27) System.exit(0);
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
