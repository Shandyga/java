/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homefive;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Vitaliy
 */
public class MyForm extends JFrame implements ActionListener{
    
    public MyForm() {
        super("My program");
        setBounds(200, 200, 850, 500);
        setResizable(true);
        
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(50, 0, 0, 0));
        JButton button_1 = new JButton("Красный");
        JButton button_2 = new JButton("Белый");
        JButton button_3 = new JButton("Зелёный");
        button_1.setPreferredSize(new Dimension(200, 50));
        button_2.setPreferredSize(new Dimension(200, 50));
        button_3.setPreferredSize(new Dimension(200, 50));
        
        panel.add(button_1);
        panel.add(button_2);
        panel.add(button_3);
        
        add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel.setBackground(Color.RED);
            }
            
        });
        
         button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel.setBackground(Color.WHITE);
            }
            
        });
         
        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel.setBackground(Color.GREEN);
            }
            
        });
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
