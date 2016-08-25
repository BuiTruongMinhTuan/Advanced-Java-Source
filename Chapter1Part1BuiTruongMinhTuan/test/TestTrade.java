

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1part1_11.GoldTrade;
import chapter1part1_11.MoneyTrade;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * UnitTest for Trade
 */
public class TestTrade {

	GoldTrade goldTrade = new GoldTrade();
	MoneyTrade moneyTrade = new MoneyTrade();
	
	@Test
	public void testTrade1() {
		goldTrade.setGoldType(1);
		goldTrade.setNumberTrade(1);
		assertEquals(1.3889E7, goldTrade.getTotalPrice(), 0);
		moneyTrade.setMoneyTrade(1);
		moneyTrade.setTypeTrade(1);
		moneyTrade.setNumberTrade(1);
		assertEquals(22260.0, moneyTrade.getTotalPrice(), 0);
	}

	@Test
	public void testTrade2() {
		goldTrade.setGoldType(2);
		goldTrade.setNumberTrade(2);
		assertEquals(3.983E7, goldTrade.getTotalPrice(), 0);
		moneyTrade.setMoneyTrade(2);
		moneyTrade.setTypeTrade(2);
		moneyTrade.setNumberTrade(2);
		assertEquals(50452, moneyTrade.getTotalPrice(), 01);
	}
	
	@Test
	public void testTrade3() {
		
        goldTrade.setGoldType(3);
		goldTrade.setNumberTrade(3);
		assertEquals(7.7934E7, goldTrade.getTotalPrice(), 0);
		
        moneyTrade.setMoneyTrade(3);
		moneyTrade.setTypeTrade(1);
		moneyTrade.setNumberTrade(3);
		assertEquals(50241.39, moneyTrade.getTotalPrice(), 0);
	}
	
	@Test
	public void testTrade4() {
		
         goldTrade.setGoldType(4);
		goldTrade.setNumberTrade(4);
		assertEquals(1.40564E8, goldTrade.getTotalPrice(), 0.1);
		
        moneyTrade.setMoneyTrade(1);
		moneyTrade.setTypeTrade(2);
		moneyTrade.setNumberTrade(4);
		assertEquals(89930, moneyTrade.getTotalPrice(), 1);
	}
	
	@Test
	public void testTrade5() {
		goldTrade.setGoldType(1);
		goldTrade.setNumberTrade(5);
		assertEquals(6.9445E7, goldTrade.getTotalPrice(), 0);
        
        moneyTrade.setMoneyTrade(2);
		moneyTrade.setTypeTrade(1);
		moneyTrade.setNumberTrade(5);
		assertEquals(124881.4, moneyTrade.getTotalPrice(), 0);
	}
	
	@Test
	public void testTrade6() {
		goldTrade.setGoldType(1);
		goldTrade.setNumberTrade(5);
		assertNotEquals(6.9445, goldTrade.getTotalPrice(), 0);
		moneyTrade.setMoneyTrade(2);
		moneyTrade.setTypeTrade(1);
		moneyTrade.setNumberTrade(5);
		assertNotEquals(124881, moneyTrade.getTotalPrice(), 0);
	}
	
	@Test
	public void testTrade7() {
		goldTrade.setGoldType(1);
		goldTrade.setNumberTrade(5);
		assertNotEquals(1.40564E8, goldTrade.getTotalPrice(), 0);
		moneyTrade.setMoneyTrade(2);
		moneyTrade.setTypeTrade(1);
		moneyTrade.setNumberTrade(5);
		assertNotEquals(89129.04, moneyTrade.getTotalPrice(), 0);
	}
	
	@Test
	public void testTrade8() {
		goldTrade.setGoldType(1);
		goldTrade.setNumberTrade(5);
		assertNotEquals(7.7934E7, goldTrade.getTotalPrice(), 0);
		moneyTrade.setMoneyTrade(2);
		moneyTrade.setTypeTrade(1);
		moneyTrade.setNumberTrade(5);
		assertNotEquals(50241.39, moneyTrade.getTotalPrice(), 0);
	}
	
	@Test
	public void testTrade9() {
		goldTrade.setGoldType(1);
		goldTrade.setNumberTrade(5);
		assertNotEquals(3.983E7, goldTrade.getTotalPrice(), 0);
		moneyTrade.setMoneyTrade(2);
		moneyTrade.setTypeTrade(1);
		moneyTrade.setNumberTrade(5);
		assertNotEquals(50002.512559999996, moneyTrade.getTotalPrice(), 0);
	}
	
	@Test
	public void testTrade10() {
		goldTrade.setGoldType(1);
		goldTrade.setNumberTrade(5);
		assertNotEquals(1.3889E7, goldTrade.getTotalPrice(), 0);
		moneyTrade.setMoneyTrade(2);
		moneyTrade.setTypeTrade(1);
		moneyTrade.setNumberTrade(5);
		assertNotEquals(22260.0, moneyTrade.getTotalPrice(), 0);
	}
}
