/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homefour;

import javax.swing.JOptionPane;

/**
 *
 * @author Vitaliy
 */
public class HomeFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        String index = JOptionPane.showInputDialog(null, "Enter the index!");
        try {
            int indexParse = Integer.parseInt(index);
            if (indexParse < 0 ) throw new Exception();
            JOptionPane.showMessageDialog(null, "Индекс = " + arr[indexParse]);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Некорректный индекс!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Индекс отрицательный!");
        }
    }
    
}
