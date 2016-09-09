
package chapter3_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * @author Bui Truong Minh Tuan
 * Date : 9/9/2016
 * Version : 1.0
 * 
 */
public class MainPrintBill {
    public static void main(String[] args) {
         List<Integer> amounts = Arrays.asList(new Integer[] {9, 6, 5, 7});
        int price = 5200;
        Collections.sort(amounts,(a,b)->a.compareTo(b));
        amounts.forEach(n -> System.out.println("Thanh tien= "+n*price));
    

    }
}
