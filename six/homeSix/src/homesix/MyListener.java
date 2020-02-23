/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homesix;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Vitaliy
 */
public class MyListener implements ActionListener{
    
    JFrame frame;
    
    public MyListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand());
        String size = ae.getActionCommand();
        if (size.equals("640x480")) {
            frame.setBounds(0, 0, 640, 480);
        }
        
        else if (size.equals("800x600")) {
            frame.setBounds(0, 0, 800, 600);
        }
        
        else if (size.equals("1024x768")) {
            frame.setBounds(0, 0, 1024, 768);
        }
    }
    
}
