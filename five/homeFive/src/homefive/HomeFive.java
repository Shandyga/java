/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homefive;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Vitaliy
 */
public class HomeFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
        Calendar c = new GregorianCalendar();
        System.out.println(c.getTimeInMillis());
        String date = JOptionPane.showInputDialog(null, "Ввести дату в заданном формате! dd.MM.YYYY");
        //String date = "10.10.2000";
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        d = format.parse(date);
        c.setTime(d);
        System.out.println(d);
        int myDay = c.get(GregorianCalendar.DAY_OF_MONTH);
        int myMonth = c.get(GregorianCalendar.MONTH) + 1;
        int myDate = c.get(GregorianCalendar.YEAR) + 1;
        JOptionPane.showMessageDialog(null, myDay + "." + myMonth + "." + myDate);
        //System.out.println(myDate);
    }
    
}
