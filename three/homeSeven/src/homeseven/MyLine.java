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
public class MyLine {
    
   
    public MyPoint pointStart;
    public MyPoint pointEnd;
    
    
    
    public MyLine(int xStart, int  yStart, int xEnd, int yEnd) {
        this.pointStart = new MyPoint(xStart, yStart);
        this.pointEnd = new MyPoint(xEnd, yEnd);
    }
    
    class MyPoint{
        public int x;
        public int y;
        
        public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
            
        }
    }
}
