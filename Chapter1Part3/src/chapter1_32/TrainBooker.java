package chapter1_32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class TrainBooker extends Booking {
	//to search a train list. Return a object list.
	@Override
	List<Object> search() {
		
		ArrayList<Object> temp = new ArrayList<>(Arrays.asList("Train 1", "Train 2", "Train 3"));
		System.out.println("Train List: " + temp);
		return temp;
	}
}
