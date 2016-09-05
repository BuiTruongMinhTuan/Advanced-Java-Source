package chapter1_32;

import java.util.List;
/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class BookingFacade {
	private Booking fightBooker;
	private Booking hotelBooker;
	private Booking trainBooker;

	public BookingFacade() {
		fightBooker = new FightBooker();
		hotelBooker = new HotelBooker();
		trainBooker = new TrainBooker();
	}

	//to search a fight list.
	public List<Object> searchFightBooker() {
		
		return fightBooker.search();
	}
	//to search a hotel list.
	public List<Object> searchHotelBooker() {
		
		return hotelBooker.search();
	}
	//to search a train list.
	public List<Object> searchTrainBooker() {
		
		return trainBooker.search();
	}
}
