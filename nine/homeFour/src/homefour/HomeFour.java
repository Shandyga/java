/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homefour;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vitaliy
 */
public class HomeFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            int i = 0;
            while (true) {
                System.out.println("Секунд  0 прошло " + i);
                //if (i == 3) break;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(HomeFour.class.getName()).log(Level.SEVERE, null, ex);
                }
                i++;
            }
        });
        
        Thread t_2 = new Thread(() -> {
            int i = 0;
            while (true) {
                System.out.println("Секунд 1 прошло " + i);
                if (i == 3) break;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(HomeFour.class.getName()).log(Level.SEVERE, null, ex);
                }
                i++;
            }
        });
         Thread t_3 = new Thread(() -> {
            int i = 0;
            while (true) {
                System.out.println("Секунд 2 прошло " + i);
                if (i == 3) break;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(HomeFour.class.getName()).log(Level.SEVERE, null, ex);
                }
                i++;
            }
        });
        t.setDaemon(true);
        t_2.setDaemon(true);
        t_3.setDaemon(true);
        t.setPriority(1);
        t.start();
        t_2.start();
        t_3.start();
        Thread.sleep(1500);
    }
    
}
