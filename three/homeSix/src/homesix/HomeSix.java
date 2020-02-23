/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homesix;

/**
 *
 * @author Vitaliy
 */
public class HomeSix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       UserSocial userSocial = new UserSocial(1, "Login", "1111", "Vitaliy", 33);
       WebMaster webMaster = new WebMaster(1, "Log", "1113", "https://myrusakov.ru/rusakov-mihail.html");
       userSocial.setName("Vi");
       System.out.println(userSocial.getName());
       userSocial.setAge(0);
       System.out.println(userSocial.getAge());
       webMaster.setSite("");
       System.out.println(webMaster.getSite());
    }
    
}
