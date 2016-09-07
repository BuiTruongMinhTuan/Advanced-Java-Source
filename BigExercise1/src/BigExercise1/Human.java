package BigExercise1;


/**
 * @author Bui Truong Minh Tuan
 * @created 06-Thg9-2016 11:32:05 CH
 * @version 1.0
 
 Abstract class about information Human
 */
public abstract class Human {

	public String email;
	public String name;
	public String phone;

	public Human(){

	}

	public Human(String email, String name, String phone) {
		super();
		this.email = email;
		this.name = name;
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	
}