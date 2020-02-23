/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homefour;

import java.util.ArrayList;

/**
 *
 * @author Vitaliy
 */
public class HomeFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList();
        
        
        arr.add("Stas");
        arr.add("Stas2");
        arr.add("Stas3");
        
        for (int i = 0; i < arr.size(); i++) {
            
            System.out.println(arr.get(i));
        }
        arr.set(1, "Stan");
        System.out.println("===========");
       
        
        arr.forEach((t) -> System.out.print(t + " "));
        
        /*for (int i = 0; i < 5; i++) {
            String str = Integer.toString(arr[i]);
            arr.add(str);
        }*/
        /*int[] arr = {35, 23, 34};
        for (int i = 0; i < 3; i++) {
            if(arr[i] == arr[1]) arr[1] = 3456;
            String str = Integer.toString(arr[i]);
            System.out.println(str);
        }*/
    }
    
}
