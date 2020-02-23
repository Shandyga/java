/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeone;

/**
 *
 * @author Vitaliy
 */
public class HomeOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
        //int a = arr[5];
        //System.out.println(a);
        try {
            int a = arr[5];
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Завершение программы!");
        }
    }
    
}
