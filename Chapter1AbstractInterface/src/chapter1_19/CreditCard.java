package chapter1_19;

import java.util.Date;



/**
 * @author BuiTruongMinhTuan
 * @version 1.0
 * @created 29-Thg8-2016 9:30:42 SA
 */
public class CreditCard extends Card implements IAuthMethod {

	private Date expirationDate;
	private double maxDebt;
	private String type;

	public CreditCard(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public String getAuthMethod(){
		return "";
	}

}