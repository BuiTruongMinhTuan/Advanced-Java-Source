
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
 * @author Bui Truong Minh Tuan
 * Date : 20/9/2016
 * Version : 1.0
 * 
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({AverageSalaryTest.class, HighestSalaryTest.class, AverageAgeTest.class})
public class EmployeeTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
