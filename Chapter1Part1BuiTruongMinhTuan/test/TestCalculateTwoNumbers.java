/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import chapter1part1buitruongminhtuan.CalculateTwoNumbers;
/**
 *
 * @author BTMT
 * @Date 19/08/2016
 */
public class TestCalculateTwoNumbers {
    
    public TestCalculateTwoNumbers() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    CalculateTwoNumbers CT = new CalculateTwoNumbers(0, 0);//object initialization

    @Test//test for Linear Equation
    public void Test1() {
        CT.setNumber1(3);
        CT.setNumber2(4);
        double ac = CT.calculater(1);
        double ex = 7;
        assertEquals(ex, ac,.1);
    }
    @Test
    public void Test2() {
        CT.setNumber1(3);
        CT.setNumber2(4);
        double ac = CT.calculater(2);
        double ex = -1;
        assertEquals(ex, ac,.1);
    }
    @Test
    public void Test3() {
        CT.setNumber1(3);
        CT.setNumber2(4);
        double ac = CT.calculater(3);
        double ex = 12;
        assertEquals(ex, ac,.1);
    }
    @Test
    public void Test4() {
        CT.setNumber1(4);
        CT.setNumber2(4);
        double ac = CT.calculater(4);
        double ex = 1;
        assertEquals(ex, ac,.1);
    }
    @Test
    public void Test5() {
        CT.setNumber1(3);
        CT.setNumber2(0);
        double ac = CT.calculater(3);
        double ex = 0;
        assertEquals(ex, ac,.1);
    }
     @Test
    public void Test6() {
        CT.setNumber1(3);
        CT.setNumber2(0);
        double ac = CT.calculater(3);
        double ex = 1;
        assertNotEquals(ex, ac,.1);
    }
        @Test
    public void Test7() {
        CT.setNumber1(3);
        CT.setNumber2(3);
        double ac = CT.calculater(1);
        double ex = 1;
        assertNotEquals(ex, ac,.1);
    }
        @Test
    public void Test8() {
        CT.setNumber1(3);
        CT.setNumber2(0);
        double ac = CT.calculater(3);
        double ex = 5;
        assertNotEquals(ex, ac,.1);
    }
        @Test
    public void Test9() {
        CT.setNumber1(3);
        CT.setNumber2(4);
        double ac = CT.calculater(3);
        double ex = 8;
        assertNotEquals(ex, ac,.1);
    }
        @Test
    public void Test10() {
        CT.setNumber1(3);
        CT.setNumber2(3);
        double ac = CT.calculater(1);
        double ex = 1;
        assertNotEquals(ex, ac,.1);
    }
}
