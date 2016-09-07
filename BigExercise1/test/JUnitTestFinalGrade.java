
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import BigExercise1.FinalGrade;
import BigExercise1.MarkSession;
import BigExercise1.MarkBigExercise;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Bui Truong Minh Tuan
 * @created 06-Thg9-2016 11:52:05 CH
 * @version 1.0
 */
public class JUnitTestFinalGrade {
    FinalGrade finalGrade = new FinalGrade();
    public JUnitTestFinalGrade() {
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
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkBigExercise markExam = new MarkBigExercise(8, 8);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 8.6;
		
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test2() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkBigExercise markExam = new MarkBigExercise(7, 7);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 7.9;
		
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test3() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkBigExercise markExam = new MarkBigExercise(5, 5);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 6.5;
		
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkBigExercise markExam = new MarkBigExercise(8, 5);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 7.7;
		
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test5() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkBigExercise markExam = new MarkBigExercise(8, 9);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 8.9;
		
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkBigExercise markExam = new MarkBigExercise(8, 8);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 8.16;
		
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test7() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkBigExercise markExam = new MarkBigExercise(7, 7);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 7.5;
		
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test8() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkBigExercise markExam = new MarkBigExercise(5, 5);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 6.2;
		
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test9() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkBigExercise markExam = new MarkBigExercise(8, 5);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 7.0;
		
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test10() {
		
		List<MarkSession> list = new ArrayList<>();
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		list.add(new MarkSession(10, 10, 10));
		
		MarkBigExercise markExam = new MarkBigExercise(8, 9);
		
		finalGrade.setList(list);
		finalGrade.setM_MarkExam(markExam);
		
		double ac = finalGrade.calFinalGrade();
		double ex = 18.9;
		
		assertNotEquals(ex, ac, 0);
	}
}
