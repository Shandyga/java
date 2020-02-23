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
public class MyThread implements Runnable{

    @Override
    public void run() {
        int summa_2 = 0;
        for (int i = 0; i < 100000000; i++) summa_2 += i;
    }
    
}
