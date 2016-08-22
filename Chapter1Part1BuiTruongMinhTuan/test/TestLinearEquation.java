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
import chapter1part1_1.LinearEquation;

/**
 *
 * @author long
 */
public class TestLinearEquation {

    public TestLinearEquation() {

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
    LinearEquation LE = new LinearEquation(0, 0);//object initialization

    @Test//test for Linear Equation
    public void Test1() {
        LE.setaFactor(3);
        LE.setbFactor(3);
        String ac = LE.findRoot();
        String ex = "-1,0";
        assertEquals(ex, ac);
    }

    @Test
    public void Test2() {
        LE.setaFactor(6);
        LE.setbFactor(3);
        String ac = LE.findRoot();
        String ex = "-0,5";
        assertEquals(ex, ac);
    }

    @Test
    public void Test3() {
        LE.setaFactor(6);
        LE.setbFactor(2);
        String ac = LE.findRoot();
        String ex = "-0,3";
        assertEquals(ex, ac);
    }

    @Test
    public void Test4() {
        LE.setaFactor(0);
        LE.setbFactor(0);
        String ac = LE.findRoot();
        String ex = "Equations infinitely many solutions";
        assertEquals(ex, ac);
    }
     @Test
    public void Test5() {
        LE.setaFactor(0);
        LE.setbFactor(2);
        String ac = LE.findRoot();
        String ex = "The equation has no solution";
        assertEquals(ex, ac);
    }
     @Test
    public void Test6() {
        LE.setaFactor(2);
        LE.setbFactor(2);
        String ac = LE.findRoot();
        String ex = "3,2";
        assertNotEquals(ex, ac);
    }
     @Test
    public void Test7() {
        LE.setaFactor(20);
        LE.setbFactor(2);
        String ac = LE.findRoot();
        String ex = "5,0";
        assertNotEquals(ex, ac);
    }
     @Test
    public void Test8() {
        LE.setaFactor(7);
        LE.setbFactor(2);
        String ac = LE.findRoot();
        String ex = "The equation has no solution";
        assertNotEquals(ex, ac);
    }
     @Test
    public void Test9() {
        LE.setaFactor(8.2);
        LE.setbFactor(2);
        String ac = LE.findRoot();
        String ex = "2,5";
        assertNotEquals(ex, ac);
    }
     @Test
    public void Test10() {
        LE.setaFactor(0);
        LE.setbFactor(2);
        String ac = LE.findRoot();
        String ex = "Equations infinitely many solutions";
        assertNotEquals(ex, ac);
    }
    
}
