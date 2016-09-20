

import Exercise4_Stream.Employee;
import Exercise4_Stream.MainforStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * @author Bui Truong Minh Tuan
 * Date : 20/9/2016
 * Version : 1.0
 * 
 */
public class HighestSalaryTest {
    
    public HighestSalaryTest() {
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

    @Test
    public void test1() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 2000000);
        Employee e3 = new Employee("abc", 24, 3000000);
        Employee e4 = new Employee("abc", 26, 1000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainforStream.highestSalary(lst);
        double ex = 5000000;
        assertEquals(ex, ac, 0.1);
    }
    
    @Test
    public void test2() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 5000000);
        Employee e3 = new Employee("abc", 24, 3000000);
        Employee e4 = new Employee("abc", 26, 1000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainforStream.highestSalary(lst);
        double ex = 5000000;
        assertEquals(ex, ac, 0.1);
    }
    @Test
    public void test3() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 10000000);
        Employee e3 = new Employee("abc", 24, 3000000);
        Employee e4 = new Employee("abc", 26, 1000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainforStream.highestSalary(lst);
        double ex = 10000000;
        assertEquals(ex, ac, 0.1);
    }
    @Test
    public void test4() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 5000000);
        Employee e3 = new Employee("abc", 24, 5000000);
        Employee e4 = new Employee("abc", 26, 5000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainforStream.highestSalary(lst);
        double ex = 5000000;
        assertEquals(ex, ac, 0.1);
    }
    @Test
    public void test5() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 5000000);
        Employee e3 = new Employee("abc", 24, 5000000);
        Employee e4 = new Employee("abc", 26, 5000001);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainforStream.highestSalary(lst);
        double ex = 5000001;
        assertEquals(ex, ac, 0.1);
    }
    @Test
    public void test6() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 5000000);
        Employee e3 = new Employee("abc", 24, 5000000);
        Employee e4 = new Employee("abc", 26, 5000001);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainforStream.highestSalary(lst);
        double ex = 5000000;
        assertNotEquals(ex, ac, 0.1);
    }
    @Test
    public void test7() {
        Employee e1 = new Employee("abc", 20, 2000000);
        Employee e2 = new Employee("abc", 22, 2000000);
        Employee e3 = new Employee("abc", 24, 2000000);
        Employee e4 = new Employee("abc", 26, 10000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainforStream.highestSalary(lst);
        double ex = 1000000;
        assertNotEquals(ex, ac, 0.1);
    }
    @Test
    public void test8() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 6000000);
        Employee e3 = new Employee("abc", 24, 9000000);
        Employee e4 = new Employee("abc", 26, 10000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainforStream.highestSalary(lst);
        double ex = 5000000;
        assertNotEquals(ex, ac, 0.1);
    }
    @Test
    public void test9() {
        Employee e1 = new Employee("abc", 20, 0000000);
        Employee e2 = new Employee("abc", 22, 0000000);
        Employee e3 = new Employee("abc", 24, 0000000);
        Employee e4 = new Employee("abc", 26, 10000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainforStream.highestSalary(lst);
        double ex = 0000000;
        assertNotEquals(ex, ac, 0.1);
    }
    @Test
    public void test10() {
        Employee e1 = new Employee("abc", 20, 1000000);
        Employee e2 = new Employee("abc", 22, 1000000);
        Employee e3 = new Employee("abc", 24, 1000000);
        Employee e4 = new Employee("abc", 26, 10000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainforStream.highestSalary(lst);
        double ex = 1000000;
        assertNotEquals(ex, ac, 0.1);
    }
}
