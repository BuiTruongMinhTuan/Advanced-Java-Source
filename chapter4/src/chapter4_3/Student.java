
package chapter4_3;

/*
 * @author Bui Truong Minh Tuan
 * Date : 12/9/2016
 * Version : 1.0
 * 
 */
public class Student {
    private String name;
	private int age;
	private double mark1;
	private double mark2;
	
	public Student() {
		
	}

	public Student(String name, int age, double mark1, double mark2) {
		super();
		this.name = name;
		this.age = age;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

   
    //calculate avg mark
	public double calAvg(){
		return (mark1 + mark2 ) / 2;
	}
	
	
    //show information Student
	public void showInfo(){
		System.out.println("+++++++++++++++++++");
		System.out.println("Student Name: " + name 
                            + "\t" + "Student age: " + age 
                            + "\t" + "mark 1: " + mark1 
                            + "\t" + "mark 2: " + mark2 
                            + "\t" + "Avg mark: " + calAvg());
		System.out.println("+++++++++++++++++++");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMark1() {
		return mark1;
	}

	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}

	public double getMark2() {
		return mark2;
	}

	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}
	
	
}
