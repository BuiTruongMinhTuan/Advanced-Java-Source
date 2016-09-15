package chapter6_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

/*
 * @author Bui Truong Minh Tuan
 * Date : 15/9/2016
 * Version : 1.0
 * 
 */
@SuppressWarnings("serial")
public class Employee implements Serializable {
	String name;
	String address;
	float salary;

	public Employee(String name, String address, float salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

    //input employee from user
	public static Employee getEmployee() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--------------------------------");
		System.out.println("-----Input a Employee-----");
		System.out.println("Employee name: ");
		String name = input.readLine();
		System.out.println("Employee address: ");
		String address = input.readLine();
		System.out.println("Employee salary: ");
        float salary = Float.parseFloat(input.readLine());
        System.out.println("--------------------------------");
		

		Employee emp = new Employee(name, address, salary);
		return emp;
	}

	// out put information
	@Override
	public String toString() {
		
		return "name " + name + " address " + address + " salary " + salary + "]";
	}
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}
