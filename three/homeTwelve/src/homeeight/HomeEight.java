/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeeight;

/**
 *
 * @author Vitaliy
 */
public class HomeEight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserSocial userSocial = new UserSocial(2, "Lord", "5555", "Vitaliy", 33);
        //userSocial.printUser();
        WebMaster webMaster = new WebMaster(1, "Stas", "1555", "");
        //webMaster.printUser();
        System.out.println(userSocial);
        System.out.println(webMaster);
        
        UserSocial userSocial2 = userSocial.clone();
        WebMaster webMaster2 = webMaster.clone();
        System.out.println(userSocial2);
        System.out.println(webMaster2);

    }
    
}
