package chapter2_3;

/*
 * @author Bui Truong Minh Tuan
 * Date : 7/9/2016
 * Version : 1.0
 * 
 */

public class Student {

	String name;
	String id;
	String placeOfBirth;
	
	public Student() {
		super();
	}

	public Student(String name, String id, String placeOfBirth) {
		super();
		this.name = name;
		this.id = id;
		this.placeOfBirth = placeOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	
	/*
	 * Display information of student
	 */
	public void displayStudent(){
		
		System.out.println("name of student: " + name + " id: " + id + " place: " + placeOfBirth);
	}
}
