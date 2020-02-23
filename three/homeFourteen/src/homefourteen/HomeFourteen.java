/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homefourteen;

/**
 *
 * @author Vitaliy
 */
public class HomeFourteen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        numbers(1);
        
    }
    
    public static int numbers(int a){
        System.out.println(a);
        if(a == 10) return 10;
        return numbers(a + 1);
    }
}
