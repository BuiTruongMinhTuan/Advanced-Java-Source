package BigExercise1;
import java.util.List;

/**
 * @author Bui Truong Minh Tuan
 * @created 06-Thg9-2016 11:32:05 CH
 * @version 1.0
 
 Class about information Teacher
 This class extend by Human
 */
public class Teacher extends Human {

	private List<String> listSubject;

	public Teacher(){

	}

	public Teacher(String email, String name, String phone, List<String> listSubject) {
		super(email, name, phone);
		this.listSubject = listSubject;
	}
   
    //Add new subject
	public List<String> addSubject(String subject){
		return null;
	}

	
    //Get information of teacher
	@Override
	public String toString() {
		
		String result = "Name of teacher: " + name 
                + " - email: " + email 
                + " - phone: " + phone + " ";
		for(String subject : listSubject)
			result += subject + " ";
		return result;
	}
	public List<String> getListSubject() {
		return listSubject;
	}

	public void setListSubject(List<String> listSubject) {
		this.listSubject = listSubject;
	}

	
}