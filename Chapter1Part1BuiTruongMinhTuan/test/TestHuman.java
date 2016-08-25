

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1part1_10.Student;
import chapter1part1_10.Teacher;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * UnitTest for Human
 */
public class TestHuman {

	Teacher teacher = new Teacher();
	Student student = new Student();
	
	@Test
	public void testHuman1() {
		teacher.setCoefficients(2.1);
		teacher.setAllowance(1000000);
		assertEquals(3646000.0, teacher.setSalary(), 0);
		student.setMarksSemester1(1);
		student.setMarksSemester2(10);
		assertEquals(5.5, student.computeMarks(), 0);
	}

	@Test
	public void testHuman2() {
		teacher.setCoefficients(2.2);
		teacher.setAllowance(2000000);
		assertEquals(4772000.0, teacher.setSalary(), 0);
		student.setMarksSemester1(2);
		student.setMarksSemester2(10);
		assertEquals(6, student.computeMarks(), 0);
	}
	
	@Test
	public void testHuman3() {
		teacher.setCoefficients(2.3);
		teacher.setAllowance(3000000);
		assertEquals(5898000.0, teacher.setSalary(), 0);
		student.setMarksSemester1(3);
		student.setMarksSemester2(10);
		assertEquals(6.5, student.computeMarks(), 0);
	}
	
	@Test
	public void testHuman4() {
		teacher.setCoefficients(2.4);
		teacher.setAllowance(4000000);
		assertEquals(7024000.0, teacher.setSalary(), 0);
		student.setMarksSemester1(5);
		student.setMarksSemester2(9);
		assertEquals(7, student.computeMarks(), 0);
	}
	
	@Test
	public void testHuman5() {
		teacher.setCoefficients(2.5);
		teacher.setAllowance(5000000);
		assertEquals(8150000.0, teacher.setSalary(), 0);
		student.setMarksSemester1(8);
		student.setMarksSemester2(9);
		assertEquals(8.5, student.computeMarks(), 0);
	}
	
	@Test
	public void testHuman6() {
		teacher.setCoefficients(2.6);
		teacher.setAllowance(6000000);
		assertNotEquals(6000000, teacher.setSalary(), 0);
		student.setMarksSemester1(6);
		student.setMarksSemester2(6);
		assertNotEquals(5, student.computeMarks(), 0);
	}
	
	@Test
	public void testHuman7() {
		teacher.setCoefficients(2.7);
		teacher.setAllowance(7000000);
		assertNotEquals(7000000, teacher.setSalary(), 0);
		student.setMarksSemester1(7);
		student.setMarksSemester2(7);
		assertNotEquals(4, student.computeMarks(), 0);
	}
	
	@Test
	public void testHuman8() {
		teacher.setCoefficients(2.8);
		teacher.setAllowance(8000000);
		assertNotEquals(8000000, teacher.setSalary(), 0);
		student.setMarksSemester1(8);
		student.setMarksSemester2(8);
		assertNotEquals(3, student.computeMarks(), 0);
	}
	
	@Test
	public void testHuman9() {
		teacher.setCoefficients(2.9);
		teacher.setAllowance(9000000);
		assertNotEquals(9000000, teacher.setSalary(), 0);
		student.setMarksSemester1(9);
		student.setMarksSemester2(9);
		assertNotEquals(2, student.computeMarks(), 0);
	}
	
	@Test
	public void testHuman10() {
		teacher.setCoefficients(2.11);
		teacher.setAllowance(11000000);
		assertNotEquals(11000000, teacher.setSalary(), 0);
		student.setMarksSemester1(10);
		student.setMarksSemester2(10);
		assertNotEquals(1, student.computeMarks(), 0);
	}
}
