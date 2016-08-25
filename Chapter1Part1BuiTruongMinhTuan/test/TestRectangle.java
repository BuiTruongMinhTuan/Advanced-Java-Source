

import static org.junit.Assert.*;

import org.junit.Test;


import chapter1part1_5.CircuitAreaRectangle;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * UnitTest for Rectangle
 */
public class TestRectangle {

	
	CircuitAreaRectangle rectangle = new CircuitAreaRectangle();
	
	@Test
	public void testRectangle1() {
	
		rectangle= new CircuitAreaRectangle(1,2,3,4);
		double ac = rectangle.calcuCircuit();
		assertEquals(8.0, ac, 0.01);
	}

	@Test
	public void testRectangle2() {
		
		rectangle= new CircuitAreaRectangle(51,62,73,84);
		double ac = rectangle.calcuCircuit();
		assertEquals(88.0, ac, 0.01);
	}
	
	@Test
	public void testRectangle3() {
		
		rectangle= new CircuitAreaRectangle(11,14,12,13);
		double ac = rectangle.calcuCircuit();
		assertEquals(0.0, ac, 0.01);
	}
	
	@Test
	public void testRectangle4() {
		
		rectangle= new CircuitAreaRectangle(131,144,152,163);
		double ac = rectangle.calcuCircuit();
		assertEquals(80.0, ac, 0.01);
	}
	
	@Test
	public void testRectangle5() {
		
		rectangle= new CircuitAreaRectangle(171,183,192,204);
		double ac = rectangle.calcuCircuit();
		assertEquals(84.0, ac, 0.01);
	}
	
	@Test
	public void testRectangle6() {
		
		rectangle= new CircuitAreaRectangle(21,22,23,24);
		double ac = rectangle.calcuCircuit();
		assertNotEquals(6, ac, 0.01);
	}
	
	@Test
	public void testRectangle7() {
		
		rectangle= new CircuitAreaRectangle(25,26,27,28);
		double ac = rectangle.calcuCircuit();
		assertNotEquals(7, ac, 0.01);
	}
	
	@Test
	public void testRectangle8() {
		
		rectangle= new CircuitAreaRectangle(29,30,31,32);
		double ac = rectangle.calcuCircuit();
		assertNotEquals(9, ac, 0.01);
	}
	
	@Test
	public void testRectangle9() {
		
		rectangle= new CircuitAreaRectangle(33,34,35,36);
		double ac = rectangle.calcuCircuit();
		assertNotEquals(9, ac, 0.01);
	}
	
	@Test
	public void testRectangle10() {
		
		rectangle= new CircuitAreaRectangle(37,38,39,40);
		double ac = rectangle.calcuCircuit();
		assertNotEquals(10, ac, 0.01);
	}
}
