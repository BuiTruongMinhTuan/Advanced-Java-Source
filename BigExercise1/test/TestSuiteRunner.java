
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/**
 *
 * @author Bui Truong Minh Tuan
 * @created 06-Thg9-2016 11:52:05 CH
 * @version 1.0
 */
public class TestSuiteRunner {
    public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestSuite.class);
		for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());

	}
}
