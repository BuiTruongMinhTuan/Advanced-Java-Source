

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1part1_9.Computer;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * UnitTest for Computer
 */
public class TestComputer {

	Computer computer = new Computer();
	
	@Test
	public void testComputer1() {
		computer.setQuantum(1);
		computer.setPrince(10000000);
		assertEquals(10000000, computer.computeAmount(), 0);
	}

	@Test
	public void testComputer2() {
		computer.setQuantum(2);
		computer.setPrince(20000000);
		assertEquals(40000000, computer.computeAmount(), 0);
	}
	
	@Test
	public void testComputer3() {
		computer.setQuantum(3);
		computer.setPrince(30000000);
		assertEquals(90000000, computer.computeAmount(), 0);
	}
	
	@Test
	public void testComputer4() {
		computer.setQuantum(4);
		computer.setPrince(40000000);
		assertEquals(160000000, computer.computeAmount(), 0);
	}
	
	@Test
	public void testComputer5() {
		computer.setQuantum(5);
		computer.setPrince(50000000);
		assertEquals(250000000, computer.computeAmount(), 0);
	}
	
	@Test
	public void testComputer6() {
		computer.setQuantum(6);
		computer.setPrince(60000000);
		assertNotEquals(60000000, computer.computeAmount(), 0);
	}
	
	@Test
	public void testComputer7() {
		computer.setQuantum(7);
		computer.setPrince(70000000);
		assertNotEquals(70000000, computer.computeAmount(), 0);
	}
	
	@Test
	public void testComputer8() {
		computer.setQuantum(8);
		computer.setPrince(80000000);
		assertNotEquals(80000000, computer.computeAmount(), 0);
	}
	
	@Test
	public void testComputer9() {
		computer.setQuantum(9);
		computer.setPrince(90000000);
		assertNotEquals(90000000, computer.computeAmount(), 0);
	}
	
	@Test
	public void testComputer10() {
		computer.setQuantum(10);
		computer.setPrince(100000000);
		assertNotEquals(10000000, computer.computeAmount(), 0);
	}
}
