/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometwo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Vitaliy
 */
public class HomeTwo {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) {
        //throws FileNotFoundException, IOException 
        //String path = "‪src/hometwo/Text.txt";
        //File file = new File(path);
        //FileInputStream fileInput = new FileInputStream("‪src/hometwo/Text.txt");
        /*File file = new File("src/hometwo/Text.txt");

        System.out.println(file.exists());
        FileReader input = new FileReader((file), "UTF-8");
        int code = input.read();
        while(code != -1) {
            System.out.print((char) code);
            code = input.read();
        }
        System.out.println();
        input.close();*/
        
        
        /*BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println();
        }
        reader.close();*/
        
        String path = "src/hometwo/Text.txt";
        try {
            FileInputStream in = new FileInputStream(path);
            int b = in.read();
            while (b != -1) {
                System.out.print((char) b);
                b = in.read();
            }
            in.close();
            FileReader input = new FileReader(path);
            int code = input.read();
            System.out.println();
            while (code != -1) {
                System.out.print((char) code);
                code = input.read();
            }
            System.out.println();
            input.close();
            input = new FileReader(path);
            char[] chars = new char[4096];
            input.read(chars);
            input.close();
            for (int i = 0; i < chars.length; i++) {
                System.out.print(chars[i]);
            }
            System.out.println();
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
