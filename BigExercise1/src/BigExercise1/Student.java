package BigExercise1;


/**
 * @author Bui Truong Minh Tuan
 * @created 06-Thg9-2016 11:32:05 CH
 * @version 1.0
 
 Class about information Student
 This class extend by Human
 */
public class Student extends Human {

	private String birthDay;

	public Student(){

	}

	public Student(String email, String name, String phone, String birthDay) {
		super(email, name, phone);
		this.birthDay = birthDay;
	}
  
    //Get information of student
	@Override
	public String toString() {
		
		return "Name of student: " + name 
                + " - email: " + email 
                + " - phone: " + phone
				+ " - birthday: " + birthDay;
	}
	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	

}