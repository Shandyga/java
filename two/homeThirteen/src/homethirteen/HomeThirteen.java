/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homethirteen;

/**
 *
 * @author Vitaliy
 */
public class HomeThirteen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int summa = 0;
        int[][] arr = new int[2][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i + 5) + (j + 5);
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(i + " " + j + " = " + arr[i][j]);
                summa += arr[i][j];
            }
                System.out.println("Summa = " + summa);
        }
        
        int[] myArr = {arr[0][0] + arr[0][1] + arr[0][2], arr[1][0] + arr[1][1] + arr[1][2]};
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }
    }
    
}
