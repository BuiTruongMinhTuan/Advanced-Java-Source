package chapter6_3;

import java.text.DecimalFormat;

/*
 * @author Bui Truong Minh Tuan
 * Date : 14/9/2016
 * Version : 1.0
 * 
 */
public class Student {
	private String name;
	private int level;
	private double markFisrtSemester;
	private double markSecondSemester;
	
	public Student() {
		super();
	}
    //constroctor with 4 parameters
	public Student(String name, int level, double markFisrtSemester,
			double markSecondSemester) {
		super();
		this.name = name;
		this.level = level;
		this.markFisrtSemester = markFisrtSemester;
		this.markSecondSemester = markSecondSemester;
	}

	
    //calculator average mark
	public double calAvg(){
		return (markFisrtSemester + markSecondSemester * 2) / 3;
	}
    //show information
	public void showInformation(){
		System.out.println("----------------------------------");
		System.out.println("Name: " + name);
		System.out.println("Class: " + level);
		System.out.println("Grade of semester 1: " + markFisrtSemester);
		System.out.println("Grade of semester 2: " + markSecondSemester);
		System.out.println("Avg grade: " + String.format("%.2f",calAvg()));
		System.out.println("----------------------------------");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getMarkFisrtSemester() {
		return markFisrtSemester;
	}

	public void setMarkFisrtSemester(double markFisrtSemester) {
		this.markFisrtSemester = markFisrtSemester;
	}

	public double getMarkSecondSemester() {
		return markSecondSemester;
	}

	public void setMarkSecondSemester(double markSecondSemester) {
		this.markSecondSemester = markSecondSemester;
	}
}
