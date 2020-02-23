/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeone;

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
        String text = JOptionPane.showInputDialog(null, "Enter the string");
        String hello = "hello";
        try {
            
            
            if (text == null || text.isEmpty()) {
                if (text == null) throw new NullException();
                if (text.isEmpty()) throw new EmptyException();
            }
            
            else {
                System.out.println(text.toUpperCase());
                System.out.println(text.toLowerCase());
                System.out.println(text.equals(hello));
                System.out.println(text.substring(1, 6));
            }
            
            
        }  catch (StringIndexOutOfBoundsException e) {
            System.out.println("Исключение индекса за пределами границ!");
        } catch (EmptyException e) {
            System.out.println(new EmptyException());
        } catch (NullException e) {
            System.out.println(new NullException());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }
    
}
