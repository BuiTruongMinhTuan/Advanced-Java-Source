

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1part1_4.CircuitAreaCircle;
import chapter1part1_4.Pointer;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * UnitTest for Circle
 */
public class TestCircle {

	Pointer O = new Pointer();
	Pointer R = new Pointer();
	CircuitAreaCircle circle ;
	
	@Test
	public void testCircle1() {
		O.setPointX(1);
		O.setPointY(2);
		R.setPointX(3);
		R.setPointY(4);
		circle = new CircuitAreaCircle(O,R);
		double ac = circle.calcuCircuit();
		assertNotEquals(17.76, ac, 0.01);
	}

	@Test
	public void testCircle2() {
		O.setPointX(51);
		O.setPointY(62);
		R.setPointX(73);
		R.setPointY(84);
		circle = new CircuitAreaCircle(O,R);
		double ac = circle.calcuCircuit();
		assertNotEquals(195.38, ac, 0.01);
	}
	
	@Test
	public void testCircle3() {
		
		O.setPointX(11);
		O.setPointY(14);
		R.setPointX(12);
		R.setPointY(13);
		circle = new CircuitAreaCircle(O,R);
		double ac = circle.calcuCircuit();
		assertNotEquals(8.88, ac, 0.01);
	}
	
	@Test
	public void testCircle4() {
		
		O.setPointX(131);
		O.setPointY(144);
		R.setPointX(152);
		R.setPointY(163);
		circle = new CircuitAreaCircle(O,R);
		double ac = circle.calcuCircuit();
		assertNotEquals(177.84, ac, 0.01);
	}
	
	@Test
	public void testCircle5() {
		
		O.setPointX(171);
		O.setPointY(183);
		R.setPointX(192);
		R.setPointY(204);
		circle = new CircuitAreaCircle(O,R);
		double ac = circle.calcuCircuit();
		assertNotEquals(186.50, ac, 0.01);
	}
	
	@Test
	public void testCircle6() {
		
		O.setPointX(21);
		O.setPointY(22);
		R.setPointX(23);
		R.setPointY(24);
		circle = new CircuitAreaCircle(O,R);
		double ac = circle.calcuCircuit();
		assertNotEquals(6, ac, 0.01);
	}
	
	@Test
	public void testCircle7() {
		
		O.setPointX(25);
		O.setPointY(26);
		R.setPointX(27);
		R.setPointY(28);
		circle = new CircuitAreaCircle(O,R);
		double ac = circle.calcuCircuit();
		assertNotEquals(7, ac, 0.01);
	}
	
	@Test
	public void testCircle8() {
		
		O.setPointX(29);
		O.setPointY(30);
		R.setPointX(31);
		R.setPointY(32);
		circle = new CircuitAreaCircle(O,R);
		double ac = circle.calcuCircuit();
		assertNotEquals(8, ac, 0.01);
	}
	
	@Test
	public void testCircle9() {
		
		O.setPointX(33);
		O.setPointY(34);
		R.setPointX(35);
		R.setPointY(36);
		circle = new CircuitAreaCircle(O,R);
		double ac = circle.calcuCircuit();
		assertNotEquals(9, ac, 0.01);
	}
	
	@Test
	public void testCircle10() {
		
		O.setPointX(37);
		O.setPointY(38);
		R.setPointX(39);
		R.setPointY(40);
		circle = new CircuitAreaCircle(O,R);
		double ac = circle.calcuCircuit();
		assertNotEquals(10, ac, 0.01);
	}
}
