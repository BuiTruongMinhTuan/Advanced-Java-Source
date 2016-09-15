package chapter6_4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * @author Bui Truong Minh Tuan
 * Date : 14/9/2016
 * Version : 1.0
 * 
 */
public class EmployeeManager {
	List<Employee> listEmployee = new ArrayList<Employee>();


    //add a new employee
	public void addEmployee() throws IOException {
		Employee emp = Employee.getEmployee();
		listEmployee.add(emp);
		System.out.println("---Employee has Added---");
	}

	
    //search employee by name
	public void search() throws IOException {
		System.out.println("Input name employee to search: ");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String name = input.readLine();

		int temp = 0;
		for (Employee employee : listEmployee) {
			if (employee.getName().equalsIgnoreCase(name)) {
				System.out.println("----Result searching----: ");
				System.out.println(employee);
				temp = 1;
			}
		}
		if (temp == 0)
			System.out.println("----Non name matching----.");

	}

	
    //show list
	public void printList() {
		System.out.println("----List Employee----");
		for (Employee employee : listEmployee) {
			System.out.println(employee);
		}
	}

	
    //write list to file
	public void writeListtoFile(String path) throws IOException {
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(path));
		output.writeInt(listEmployee.size());
		
		for (Employee emp : listEmployee) {
			output.writeObject(emp);
			output.flush();
		}
		output.reset();
		output.close();
	}

	
    //read list from file
	public void readFiletoList(String path) throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream(path);
		if (file.available() != 0) {
			ObjectInputStream input = new ObjectInputStream(file);
			
			int size = input.readInt();
			for (int i = 0; i < size; i++) {
				listEmployee.add((Employee) input.readObject());
			}
			input.close();
		}
	}

}
