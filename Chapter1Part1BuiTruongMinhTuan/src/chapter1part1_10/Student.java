/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_10;

import java.io.IOException;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class Student extends Hunman {

    public Student() {
    }

    public Student(String fullName, String birthDay, String address, String phone) {
        super(fullName, birthDay, address, phone);
    }

    String studentClass;
    float marksSemester1;
    float marksSemester2;

    public Student(String studentClass, float marksSemester1, float marksSemester2, String fullName, String birthDay, String address, String phone) {
        super(fullName, birthDay, address, phone);
        this.studentClass = studentClass;
        this.marksSemester1 = marksSemester1;
        this.marksSemester2 = marksSemester2;
    }

    public float computeMarks() {
        float average = (marksSemester1 + marksSemester2) / 2;
        return average;
    }

    @Override
    public void inputInfo() throws IOException {
        super.inputInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("student Class: ");
        studentClass = input.readLine();
        boolean check = true;
        while (check) {
            try {
                System.out.println("marks Semester1: ");
                marksSemester1 = Float.parseFloat(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
        check = true;
        while (check) {
            try {
                System.out.println("marks Semester2: ");
                marksSemester2 = Float.parseFloat(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }

    }

    @Override
    public void outputInfo() {
        super.outputInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("student Class: " + studentClass);
        System.out.println("marks Semester1: " + marksSemester1);
        System.out.println("marks Semester2: " + marksSemester2);
        System.out.println("marks average: " + computeMarks());
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public float getMarksSemester1() {
        return marksSemester1;
    }

    public void setMarksSemester1(float marksSemester1) {
        this.marksSemester1 = marksSemester1;
    }

    public float getMarksSemester2() {
        return marksSemester2;
    }

    public void setMarksSemester2(float marksSemester2) {
        this.marksSemester2 = marksSemester2;
    }

}
