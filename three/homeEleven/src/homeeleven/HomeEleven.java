/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeeleven;

/**
 *
 * @author Vitaliy
 */
public class HomeEleven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] arr = {"12","13"};
        Shop shop = new Shop<String>(arr);
        shop.printObject();
    }
    
}
