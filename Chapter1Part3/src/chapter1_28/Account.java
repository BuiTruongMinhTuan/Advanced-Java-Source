package chapter1_28;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class Account {
	private List<Observer> observers = new ArrayList<>();
	private double state;
	public double getState() {
		return state;
	}
	public void setState(double state) {
		this.state = state;
	}
	//to add a Observer into list.
	public void attach(Observer observer){
		observers.add(observer);
	}
	//to print notify email and mobi sms.
	public void notifyAllObservers(){
		for (Observer observer : observers) {
			System.out.println(observer.update());
		}
	}
}
