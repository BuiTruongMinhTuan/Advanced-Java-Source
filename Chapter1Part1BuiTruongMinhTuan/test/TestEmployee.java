

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1part1_6.StaffSalary;
import chapter1part1_13.TradeEmployee;
import chapter1part1_13.ProductionEmployee;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * UnitTest for Employee
 */
public class TestEmployee {

	ProductionEmployee produceEmployee = new ProductionEmployee();
	TradeEmployee businessEmployee = new TradeEmployee();
	
	@Test
	public void testEmployee1() {
		produceEmployee.setCoefficientsSalary(2.1f);
		produceEmployee.setAmountOfPeopleReduce(1);
		produceEmployee.setAmount(1100);
		
		assertEquals(2646005, produceEmployee.computeSalary(), 0);
	}

	@Test
	public void testEmployee2() {
		produceEmployee.setCoefficientsSalary(2.2f);
		produceEmployee.setAmountOfPeopleReduce(2);
		produceEmployee.setAmount(1200);
		
		assertEquals(2772010, produceEmployee.computeSalary(), 0);
	}
	
	@Test
	public void testEmployee3() {
		produceEmployee.setCoefficientsSalary(2.3f);
		produceEmployee.setAmountOfPeopleReduce(3);
		produceEmployee.setAmount(1300);
		
		assertEquals(2898015, produceEmployee.computeSalary(), 0);
	}
	
	@Test
	public void testEmployee4() {
		businessEmployee.setCoefficientsSalary(2.4f);
		businessEmployee.setAmountOfPeopleReduce(4);
		businessEmployee.setSalaryTrade(4000000.f);
		businessEmployee.setRateSalaryTrade(0.04f);
		
		assertEquals(3184000.0, businessEmployee.computeSalary(), 0);
	}
	
	@Test
	public void testEmployee5() {
		businessEmployee.setCoefficientsSalary(2.5f);
		businessEmployee.setAmountOfPeopleReduce(5);
		businessEmployee.setSalaryTrade(5000000);
		businessEmployee.setRateSalaryTrade(0.05f);
		
		assertEquals(3400000, businessEmployee.computeSalary(), 0);
	}
	
	@Test
	public void testEmployee6() {
		produceEmployee.setCoefficientsSalary(2.6f);
		produceEmployee.setAmountOfPeopleReduce(6);
		produceEmployee.setAmount(1600);
		
		assertNotEquals(3143704.75, produceEmployee.computeSalary(), 0);
	}
	
	@Test
	public void testEmployee7() {
		produceEmployee.setCoefficientsSalary(2.7f);
		produceEmployee.setAmountOfPeopleReduce(7);
		produceEmployee.setAmount(1700);
		
		assertNotEquals(3443409.5, produceEmployee.computeSalary(), 0);
	}
	
	@Test
	public void testEmployee8() {
		produceEmployee.setCoefficientsSalary(2.8f);
		produceEmployee.setAmountOfPeopleReduce(8);
		produceEmployee.setAmount(1800);
		
		assertNotEquals(3743114.25, produceEmployee.computeSalary(), 0);
	}
	
	@Test
	public void testEmployee9() {
		businessEmployee.setCoefficientsSalary(2.9f);
		businessEmployee.setAmountOfPeopleReduce(9);
		businessEmployee.setSalaryTrade(9000000);
		businessEmployee.setRateSalaryTrade(0.09f);
		
		assertNotEquals(4194800.0, businessEmployee.computeSalary(), 0);
	}
	
	@Test
	public void testEmployee10() {
		businessEmployee.setCoefficientsSalary(2.11f);
		businessEmployee.setAmountOfPeopleReduce(11);
		businessEmployee.setSalaryTrade(11000000);
		businessEmployee.setRateSalaryTrade(0.011f);
		
		assertNotEquals(4580000.0, businessEmployee.computeSalary(), 0);
	}
}
