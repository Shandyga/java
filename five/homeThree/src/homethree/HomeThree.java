/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homethree;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Vitaliy
 */
public class HomeThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Integer> data = new HashMap<String, Integer>();
        data.put("Vitaliy", 33);
        data.put("Stas", 30);
        data.put("Oleg", 27);
        data.put("Stas", data.get("Stas") + 4);
        for (Map.Entry<String, Integer> d : data.entrySet()) {
            String key = d.getKey();
            Integer value = d.getValue();
            System.out.println(key + " = " + value);
        }
    }
    
}
