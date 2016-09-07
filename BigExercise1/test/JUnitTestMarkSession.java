

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import BigExercise1.MarkSession;
/**
 * @author Bui Truong Minh Tuan
 * @created 06-Thg9-2016 11:52:05 CH
 * @version 1.0
 */
 
public class JUnitTestMarkSession {
    MarkSession markSession = new MarkSession();
    public JUnitTestMarkSession() {
        
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
   @Test
	public void test1() {
		markSession.setMarkActive(10);
		markSession.setMarkAttendence(10);
		markSession.setMarkExercise(10);
		
		double ac = markSession.calSessionGrade();
		double ex = 10;
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test2() {
		markSession.setMarkActive(0);
		markSession.setMarkAttendence(0);
		markSession.setMarkExercise(0);
		
		double ac = markSession.calSessionGrade();
		double ex = 0;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test3() {
		markSession.setMarkActive(0);
		markSession.setMarkAttendence(10);
		markSession.setMarkExercise(0);
		
		double ac = markSession.calSessionGrade();
		double ex = 3;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() {
		markSession.setMarkActive(0);
		markSession.setMarkAttendence(0);
		markSession.setMarkExercise(10);
		
		double ac = markSession.calSessionGrade();
		double ex = 6;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test5() {
		markSession.setMarkActive(10);
		markSession.setMarkAttendence(0);
		markSession.setMarkExercise(0);
		
		double ac = markSession.calSessionGrade();
		double ex = 1;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() {
		markSession.setMarkActive(10);
		markSession.setMarkAttendence(10);
		markSession.setMarkExercise(10);
		
		double ac = markSession.calSessionGrade();
		double ex = 1;
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test7() {
		markSession.setMarkActive(0);
		markSession.setMarkAttendence(0);
		markSession.setMarkExercise(0);
		
		double ac = markSession.calSessionGrade();
		double ex = 10;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test8() {
		markSession.setMarkActive(0);
		markSession.setMarkAttendence(10);
		markSession.setMarkExercise(0);
		
		double ac = markSession.calSessionGrade();
		double ex = 31;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test9() {
		markSession.setMarkActive(0);
		markSession.setMarkAttendence(0);
		markSession.setMarkExercise(10);
		
		double ac = markSession.calSessionGrade();
		double ex = 16;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test10() {
		markSession.setMarkActive(10);
		markSession.setMarkAttendence(0);
		markSession.setMarkExercise(0);
		
		double ac = markSession.calSessionGrade();
		double ex = 10;
		assertNotEquals(ex, ac, 0);
	}
}
