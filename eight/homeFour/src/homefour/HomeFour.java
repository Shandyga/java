/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homefour;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 *
 * @author Vitaliy
 */
public class HomeFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String url = JOptionPane.showInputDialog(null, "Enter the URL!");
        URL myUrl = new URL(url);
        System.out.println(myUrl);
        File file = new File("src/homefour/url.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file.getAbsolutePath());
        writer.write(url);
        writer.close();
    }
    
}
