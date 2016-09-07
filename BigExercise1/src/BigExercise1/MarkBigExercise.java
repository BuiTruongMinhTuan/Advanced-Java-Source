package BigExercise1;


/**
 * @author Bui Truong Minh Tuan
 * @created 06-Thg9-2016 11:32:05 CH
 * @version 1.0
 * 
 * Class about information exam of student
 */
public class MarkBigExercise {

	private double markMultiChoice;
	private double markPractice;

	public MarkBigExercise(){

	}

	public MarkBigExercise(double markMultiChoice, double markPractice) {
		super();
		this.markMultiChoice = markMultiChoice;
		this.markPractice = markPractice;
	}

	public double getMarkMultiChoice() {
		return markMultiChoice;
	}

	public void setMarkMultiChoice(double markMultiChoice) {
		this.markMultiChoice = markMultiChoice;
	}

	public double getMarkPractice() {
		return markPractice;
	}

	public void setMarkPractice(double markPractice) {
		this.markPractice = markPractice;
	}
	
}