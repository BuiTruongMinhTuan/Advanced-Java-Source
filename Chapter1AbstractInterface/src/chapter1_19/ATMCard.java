package chapter1_19;



/**
 * @author BuiTruongMinhTuan
 * @version 1.0
 * @created 29-Thg8-2016 9:30:43 SA
 */
public class ATMCard extends Card implements IAuthMethod {

	private double balance;

	public ATMCard(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public String getAuthMethod(){
		return "";
	}

}