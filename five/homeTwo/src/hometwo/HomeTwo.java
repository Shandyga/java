/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometwo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

/**
 *
 * @author Vitaliy
 */
public class HomeTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String radius = JOptionPane.showInputDialog(null, "Ввести радиус окружности.");
        int radiusParse = Integer.parseInt(radius);
        double square = Math.PI * (radiusParse * radiusParse);
        JOptionPane.showMessageDialog(null, square);
        
        double summa = 9895;
        double annualInterestRate = 5.7;
        double profit = summa * annualInterestRate / 100;
        System.out.println("Прибыль по вкладу в течение года = " + profit);
        BigDecimal bd = new BigDecimal(profit);
        System.out.println("Прибыль по вкладу в течение года = " + bd);
        System.out.println("Прибыль по вкладу в течение года = " + bd.setScale(2, RoundingMode.HALF_UP));
    }
    
}
