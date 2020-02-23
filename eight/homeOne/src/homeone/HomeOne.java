/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeone;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Vitaliy
 */
public class HomeOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String directory = "";
        directory += JOptionPane.showInputDialog(null, "Enter the direcotry HomeOne.java");
        if ("HomeOne.java".equals(directory)) {
            
            File file = new File(directory);
            System.out.println(file);
            System.out.println("Full path " + file.getAbsolutePath());
            File parent = file.getAbsoluteFile().getParentFile().getParentFile().getParentFile();
            System.out.println(parent);
            File[] files = parent.listFiles();
            for (File f : files) {
                System.out.println("-------------");
                System.out.println(f);
                System.out.println("Size file: " + f.length());
            }
        } else {
            System.out.println("Error!");
        }
    }
    
}
