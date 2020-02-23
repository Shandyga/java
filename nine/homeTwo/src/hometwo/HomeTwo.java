/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometwo;

/**
 *
 * @author Vitaliy
 */
public class HomeTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        long time = System.currentTimeMillis();
        int s = 0;
        /*for (int i = 0; i < 100000000; i++) s += i;
        s = 0;
        for (int i = 0; i < 100000000; i++) s += i;*/
        s = 0;
        for (int i = 0; i < 100000000; i++) s += i;
        Thread t1 = new Thread(() -> {
           int summa_1 = 0;
           for (int i = 0; i < 100000000; i++) summa_1 += i;
        });
        Thread t2 = new Thread(new MyThread());
        t2.start();
        if (t1.isAlive()) t1.join();
        if (t2.isAlive()) t2.join();
        System.out.println("Время выполнения " + (System.currentTimeMillis() - time));
    }
    
}
