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
public class HomeFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MyMath result = new MyMath();
        new MyMath();
        System.out.println("Статическое поле до вызова " + MyMath.getCount());
        System.out.println(MyMath.getAdd(2, 4));
        System.out.println("Статическое поле при каждом вызове метода " + MyMath.getCount());
        System.out.println("===============================================");
        System.out.println("Статическое поле до вызова " + MyMath.getCount());
        System.out.println(MyMath.getSub(2, 3));
        System.out.println("Статическое поле при каждом вызове метода " + MyMath.getCount());
        System.out.println("===============================================");
        System.out.println("Статическое поле до вызова " + MyMath.getCount());
        System.out.println(MyMath.getMult(2, 3));
        System.out.println("Статическое поле при каждом вызове метода " + MyMath.getCount());
        System.out.println("===============================================");
        System.out.println("Статическое поле до вызова " + MyMath.getCount());
        System.out.println(MyMath.getDiv(2, 3));
        System.out.println("Статическое поле при каждом вызове метода " + MyMath.getCount());
    }
    
}
