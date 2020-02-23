/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homethree;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Vitaliy
 */
public class HomeThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("My program");
        frame.setBounds(200, 200, 500, 300);
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(20, 0, 0, 0));
        JTextArea text = new JTextArea("Информация для файла\r\nNew string", 8,10);
        JPanel middle = new JPanel();
        middle.setBorder(new EmptyBorder(20, 0, 0, 0));
        JButton button = new JButton("Send");
        panel.add(text);
        middle.add(button);
        frame.add(panel, BorderLayout.NORTH);
        frame.add(middle);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*File file = new File("src/a.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file.getAbsolutePath());
        String s = "Информация для файла\r\nNew string";
        writer.write(s);
        writer.close();*/
    }
    
}
