package chapter1_32;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class FightBooker extends Booking {
	//to search a fight list. Return a object list.
	@Override
	ArrayList<Object> search() {
		
		ArrayList<Object> temp = new ArrayList<>(Arrays.asList("Fight 1", "Fight 2", "Fight 3"));
		System.out.println("Fight List :" + temp);
		return temp;
	}
}
