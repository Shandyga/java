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
public class UserSocial extends User implements Cloneable{
   String name;
   int age;
   public UserSocial(int id, String login, String password, String name, int age) {
       super(id, login ,password);
       this.name = name;
       this.age = age;
   }
   
   public void setName(String name){
       this.name = name;
   }
   
   public String getName(){
       return name;
   }
   
   public void setAge(int age){
       this.age = 30;
   }
   
   public int getAge(){
       return age;
   }
   
   public void printUser(){
       System.out.println("UserSocial");
   }
   
   @Override
   public String toString(){
       return "name " + name;
   }
   
   @Override
   public UserSocial clone() {
       return new UserSocial(getId(), getLogin(),  getPassword(),  name,  age);
   }
}
