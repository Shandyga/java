/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homefive;

/**
 *
 * @author Vitaliy
 */
public class NoNumberException extends Exception {
    @Override
    public String toString(){
        return "Вы ввели не число!";
    }
}
