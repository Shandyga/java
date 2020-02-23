/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homethree;

import javax.swing.*;

/**
 *
 * @author Vitaliy
 */
public class HomeThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new JFrame("My program!");
       frame.setBounds(600, 400, 850, 400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       JPanel panel = new JPanel();
       JButton button = new JButton("Кнопка");
       panel.add(button);
       
       JLabel label = new JLabel("Текст метки");
       panel.add(label);
       
       JCheckBox checkbox = new JCheckBox("Checkbox");
       panel.add(checkbox);
       
       JTextArea text = new JTextArea("Текст в текстовой области.");
       panel.add(text);
       
       JRadioButton radio = new JRadioButton("Радио-кнопка.");
       panel.add(radio);
       
       frame.add(panel);
       frame.setResizable(true);
       frame.setVisible(true);
    }
    
}
