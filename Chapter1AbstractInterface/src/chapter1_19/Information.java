package chapter1_19;

/**
 * @author BuiTruongMinhTuan
 * @version 1.0
 * @created 29-Aug-2016 8:28:11 AM
 * Abstract class for Information 
 */
public abstract class Information {

	protected String address;
	protected String email;
	protected long indentityCardNumber;
	protected String name;
	protected String phoneNumber;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getIndentityCardNumber() {
		return indentityCardNumber;
	}

	public void setIndentityCardNumber(long indentityCardNumber) {
		this.indentityCardNumber = indentityCardNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Information(String address, String email, long indentityCardNumber,
			String name, String phoneNumber) {
		super();
		this.address = address;
		this.email = email;
		this.indentityCardNumber = indentityCardNumber;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public Information() {
		super();
		// TODO Auto-generated constructor stub
	}
}