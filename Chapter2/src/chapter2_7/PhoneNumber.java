
package chapter2_7;

/*
 * @author Bui Truong Minh Tuan
 * Date : 9/9/2016
 * Version : 1.0
 * 
 */
public class PhoneNumber {
    private String name;
	private String phone;
    public PhoneNumber(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void show(){
		System.out.println("name: " + name);
		System.out.println("phone: " + phone);
	}
}
