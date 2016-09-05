package chapter1_28;
/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class EmailObserver extends Observer{

	public EmailObserver(Account account) {
		this.account = account;
		this.account.attach(this);
	}
	//to notify balance to customer.
	@Override
	public String update() {
		
		return "Email: Your account has changed. Account balance is " +account.getState();
	}
	
}
