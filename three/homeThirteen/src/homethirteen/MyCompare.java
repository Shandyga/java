/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homethirteen;

import java.util.Comparator;
/**
 *
 * @author Vitaliy
 */
public class MyCompare implements Comparator<Integer>{
    @Override
    public int compare(Integer t1, Integer t2) {
        return Integer.compare(t2, t1);
    }
}
