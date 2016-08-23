

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1part1_12.ReferenceBook;
import chapter1part1_12.TextBook;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * UnitTest for Book
 */
public class TestBook {

	TextBook textBook = new TextBook();
	ReferenceBook referenceBook = new ReferenceBook();
	
	@Test
	public void testBook1() {
		textBook.setAmount(1);
		textBook.setPrice(10000);
		textBook.setState(2);
		assertEquals(5000.0, textBook.calculateMoney(), 0);
		referenceBook.setAmount(1);
		referenceBook.setPrice(11000);
		referenceBook.setTax(0.1);
		assertEquals(11011.0, referenceBook.calculateMoney(), 0);
	}

	@Test
	public void testBook2() {
		textBook.setAmount(1);
		textBook.setPrice(10000);
		textBook.setState(1);
		assertEquals(10000.0, textBook.calculateMoney(), 0);
		referenceBook.setAmount(1);
		referenceBook.setPrice(11000);
		referenceBook.setTax(0.3);
		assertEquals(11033, referenceBook.calculateMoney(), 0);
	}
	
	@Test
	public void testBook3() {
		textBook.setAmount(2);
		textBook.setPrice(10000);
		textBook.setState(2);
		assertEquals(10000.0, textBook.calculateMoney(), 0);
		referenceBook.setAmount(1);
		referenceBook.setPrice(11000);
		referenceBook.setTax(0.5);
		assertEquals(11055.0, referenceBook.calculateMoney(), 0);
	}

	@Test
	public void testBook4() {
		textBook.setAmount(1);
		textBook.setPrice(10000);
		textBook.setState(2);
		assertEquals(5000.0, textBook.calculateMoney(), 0);
		referenceBook.setAmount(1);
		referenceBook.setPrice(11000);
		referenceBook.setTax(0.1);
		assertEquals(11011.0, referenceBook.calculateMoney(), 0);
	}

	@Test
	public void testBook5() {
		textBook.setAmount(3);
		textBook.setPrice(10000);
		textBook.setState(2);
		assertEquals(15000.0, textBook.calculateMoney(), 0);
		referenceBook.setAmount(2);
		referenceBook.setPrice(11000);
		referenceBook.setTax(0.55);
		assertEquals(22121.0, referenceBook.calculateMoney(), 0);
	}
	
	@Test
	public void testBook6() {
		textBook.setAmount(3);
		textBook.setPrice(10000);
		textBook.setState(2);
		assertNotEquals(5000.0, textBook.calculateMoney(), 0);
		referenceBook.setAmount(1);
		referenceBook.setPrice(11000);
		referenceBook.setTax(0.1);
		assertNotEquals(12100.0, referenceBook.calculateMoney(), 0);
	}
	
	@Test
	public void testBook7() {
		textBook.setAmount(2);
		textBook.setPrice(10000);
		textBook.setState(2);
		assertNotEquals(5000.0, textBook.calculateMoney(), 0);
		referenceBook.setAmount(1);
		referenceBook.setPrice(11000);
		referenceBook.setTax(0.1);
		assertNotEquals(12100.0, referenceBook.calculateMoney(), 0);
	}
	
	@Test
	public void testBook8() {
		textBook.setAmount(1);
		textBook.setPrice(10000);
		textBook.setState(2);
		assertNotEquals(25000.0, textBook.calculateMoney(), 0);
		referenceBook.setAmount(1);
		referenceBook.setPrice(11000);
		referenceBook.setTax(0.1);
		assertNotEquals(12100.0, referenceBook.calculateMoney(), 0);
	}
	
	@Test
	public void testBook9() {
		textBook.setAmount(1);
		textBook.setPrice(10000);
		textBook.setState(2);
		assertNotEquals(15000.0, textBook.calculateMoney(), 0);
		referenceBook.setAmount(1);
		referenceBook.setPrice(11000);
		referenceBook.setTax(0.1);
		assertNotEquals(12100.0, referenceBook.calculateMoney(), 0);
	}
	
	@Test
	public void testBook10() {
		textBook.setAmount(1);
		textBook.setPrice(10000);
		textBook.setState(2);
		assertNotEquals(51000.0, textBook.calculateMoney(), 0);
		referenceBook.setAmount(1);
		referenceBook.setPrice(11000);
		referenceBook.setTax(0.1);
		assertNotEquals(12100.0, referenceBook.calculateMoney(), 0);
	}
}
