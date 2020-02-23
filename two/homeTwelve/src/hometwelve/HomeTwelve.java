/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometwelve;

/**
 *
 * @author Vitaliy
 */
public class HomeTwelve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] arr = new double[5];
        arr[0] = 5.3;
        arr[1] = 2.2;
        arr[2] = 2.3;
        arr[3] = 1.2;
        arr[4] = 5.0;
        double summa = 0;
        int i = 0;
        while (i < arr.length) {
            summa += arr[i];
            System.out.println("Сумма всех чисел массива = " + summa);
            i++;
        }
        System.out.println("=============================");
        double proiz = 1;
        for (int j = 0; j < arr.length; j++) {
            proiz *= arr[j];
            System.out.println("Произведение всех чисел массива. = " + proiz);
        }
    }
    
}
