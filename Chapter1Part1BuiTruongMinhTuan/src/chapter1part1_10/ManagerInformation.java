/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class ManagerInformation {

    ArrayList<Teacher> ListTeacher;
    ArrayList<Student> ListStudent;
    Student student;
    Teacher teacher;

    public ManagerInformation() {
        ListTeacher = new ArrayList<>();
        ListStudent = new ArrayList<>();
    }

    int chosen = 0;

    //Manager Infomation
    public void manager() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("==Infomation Managerment Program ==");
        while (true) {
            try {
                boolean check = true;
                while (check) {
                    System.out.println("Choose kind Infomation Teacher(1)/ Student(2)");
                    chosen = Integer.parseInt(input.readLine());
                    if (chosen == 1) {
                        teacher = new Teacher();
                        teacher.inputInfo();
                        ListTeacher.add(teacher);
                    } else if (chosen == 2) {
                        student = new Student();
                        student.inputInfo();
                        ListStudent.add(student);
                    }
                    if (chosen != 1 && chosen != 2) {
                        System.out.println("only Chosen 1 or 2 please try agian!");
                        continue;
                    }

                    check = false;
                }
                System.out.println("Just added your Infomation into to the Collection");
                System.out.print("Do you want to add Infomation into to Collection (y/n) continue? ");
                String answer = input.readLine();
                if (answer.equalsIgnoreCase("y")) {
                    System.out.println("-----------------");
                    continue;
                }
                System.out.println("-----------------");
                System.out.println("Information of teacher kind Desktop: ");
                for (Teacher teacher : ListTeacher) {

                    teacher.outputInfo();
                    System.out.println("*****");
                }
                System.out.println("-----------------");
                System.out.println("Information of student kind Laptop: ");
                for (Student student : ListStudent) {

                    student.outputInfo();
                    System.out.println("*****");
                }

                System.exit(0);
            } catch (Exception ex) {
                System.out.println(ex.toString());
                continue;
            }

        }
    }

}
