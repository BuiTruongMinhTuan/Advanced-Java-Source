
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



/*
 * @author Bui Truong Minh Tuan
 * Date : 20/9/2016
 * Version : 1.0
 * 
 */
public class TestSuiteRunner {
    //to run test suite
    public static void main(String[] args) {
		Result result = JUnitCore.runClasses(EmployeeTestSuite.class);
        result.getFailures().stream().forEach((failure) -> {
            System.out.println(failure.toString());
        });
			
	      System.out.println(result.wasSuccessful());

	}
}
