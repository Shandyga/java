/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprototype;

/**
 *
 * @author Vitaliy
 */
public class Prototype {
    private int x;
    private int y;
    
    public Prototype(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    @Override
    public Prototype clone() {
        return new Prototype(x, y);
    }
    
    @Override
    public String toString() {
        return x + ";" + y;
    }
}
