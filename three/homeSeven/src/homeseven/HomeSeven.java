/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeseven;

/**
 *
 * @author Vitaliy
 */
public class HomeSeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLine myLine = new MyLine(5,7,10,3);
        System.out.println("Начальная точка (" + myLine.pointStart.x + "," + myLine.pointStart.y + "); Конечная точка (" + myLine.pointEnd.x + "," + myLine.pointEnd.y + ");");
    }
    
}
