package chapter1_28;
/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class MobiObserver extends Observer{

	public MobiObserver(Account account) {
		this.account = account;
		this.account.attach(this);
	}
	//to print notify balance to customer.
	@Override
	public String update() {
		
		return "Mobi: Your account has changed. Account balance is " +account.getState();
	}
	
}
