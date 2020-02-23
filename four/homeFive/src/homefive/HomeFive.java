/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homefive;
import javax.swing.JOptionPane;
/**
 *
 * @author Vitaliy
 */
public class HomeFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String number = JOptionPane.showInputDialog(null, "Enter the number!");
        //System.out.println(number.isEmpty());
        //System.out.println(number);
        try {
            if (number == null) throw new NullException();
            if (number.isEmpty()) throw new NoNumberException();
            int numberParse = Integer.parseInt(number);
            if (numberParse < 0) throw new Exception();
            JOptionPane.showMessageDialog(null, "Thank you!");
        }  catch (NoNumberException e) {
            JOptionPane.showMessageDialog(null, new NoNumberException());
        } catch (NullException e) {
            JOptionPane.showMessageDialog(null, new NullException());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input!");
            System.out.println(e);
        }
    }
    
}
