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
public class WebMaster extends User{
    String site;
    
     public WebMaster(int id, String login, String password, String site) {
       super(id, login ,password);
       this.site = site;
   }
   
   public void setSite(String site){
       this.site = "https://myrusakov.ru/rusakov-mihail.html";
   }
   
   public String getSite(){
       return site;
   }
}
