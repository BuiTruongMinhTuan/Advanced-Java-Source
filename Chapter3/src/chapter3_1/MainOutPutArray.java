
package chapter3_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javafx.print.Collation;

/*
 * @author Bui Truong Minh Tuan
 * Date : 9/9/2016
 * Version : 1.0
 * 
 */
public class MainOutPutArray {

   
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 9, 3, 6, 5, 6, 7);
        Collections.sort(list,(a,b)->a.compareTo(b));
        list.forEach(n -> System.out.println(n));
    }
    
}
