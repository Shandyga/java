/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homethirteen;
import java.util.Arrays;
/**
 *
 * @author Vitaliy
 */
public class HomeThirteen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 3, 4, 1, 17, 6, 15, 10, 9};
        Arrays.sort(arr, new MyCompare());
        //for (Integer i : arr) System.out.println(i);
        //arr.forEach(System.out::println);
        arr.forEach((t) -> {
                System.out.println(t);
            }
        );
    }
    
}
