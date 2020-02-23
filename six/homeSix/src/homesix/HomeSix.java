/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homesix;

import javax.swing.*;

/**
 *
 * @author Vitaliy
 */
public class HomeSix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("My program!");
        MyListener listener = new MyListener(frame);
        frame.setBounds(0, 0, 300, 100);
        
        
        JMenuBar mb = new JMenuBar();
        JMenu main = new JMenu("Вид");
        JMenu exit = new JMenu("Размер окна");
        JMenuItem size_1 = new JMenuItem("640x480");
        JMenuItem size_2 = new JMenuItem("800x600");
        JMenuItem size_3 = new JMenuItem("1024x768");
        exit.add(size_1);
        exit.add(size_2);
        exit.add(size_3);
        main.add(exit);
        mb.add(main);
        frame.setJMenuBar(mb);
        
        size_1.addActionListener(listener);
        size_2.addActionListener(listener);
        size_3.addActionListener(listener);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
