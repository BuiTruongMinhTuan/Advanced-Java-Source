package chapter2_3;

/*
 * @author Bui Truong Minh Tuan
 * Date : 7/9/2016
 * Version : 1.0
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.TreeMap;

public class MainManagementStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st1 = new Student("student1", "001", "LX");
		Student st2 = new Student("student2", "002", "SG");
		
		TreeMap<String, Student> listStudent = new TreeMap<>();
		listStudent.put(st1.id, st1);
		listStudent.put(st2.id, st2);
		
		ManageStudent manage = new ManageStudent(listStudent);
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int cont = 1;
			while(cont == 1){
				System.out.println("1.Add new student");
				System.out.println("2.Search student by id");
				System.out.println("3.View all student");
				System.out.println("4.Eixt");
				System.out.println("Please choice 1 or 2 or 3 or 4");
				int choice = Integer.parseInt(input.readLine());
				
				switch (choice) {
					case 1:
						System.out.println("Input name of student: ");
						String name = input.readLine();
						System.out.println("Input id of student: ");
						String id = input.readLine();
						System.out.println("Input place of birth: ");
						String place = input.readLine();
						if(manage.checkDuplicate(id))
							System.out.println("Id duplicate");
						else{
							Student student = new Student(name, id, place);
							manage.addNewStudent(student);
						}	
						break;
						
					case 2:
						System.out.println("Input id: ");
						String idSearch = input.readLine();
						Student student = manage.getValue(idSearch);
						if(student == null)
							System.out.println("No have student");
						else
							student.displayStudent();
						break;
					
					case 3:
						manage.displayAllStudent();
						break;
						
					default:
						cont = 0;
				}
			}
		} catch (NumberFormatException | IOException |InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
