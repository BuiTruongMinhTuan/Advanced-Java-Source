package BigExercise1;

/**
 * @author Bui Truong Minh Tuan
 * @created 06-Thg9-2016 11:32:05 CH
 * @version 1.0
 * 
 * Class about information of Subject
 */
public class Subject {

	private String endDate;
	private String nameOfSubject;
	private int numOfLesson;
	private String startDate;
	public Teacher m_Teacher;

	public Subject(){

	}

	public Subject(String endDate, String nameOfSubject, int numOfLesson, String startDate,
			Teacher m_Teacher) {
		super();
		this.endDate = endDate;
		this.nameOfSubject = nameOfSubject;
		this.numOfLesson = numOfLesson;
		this.startDate = startDate;
		this.m_Teacher = m_Teacher;
	}
    //Get information of subject
    @Override
	public String toString() {
		return "Name of subject: " + nameOfSubject 
                + " - start date: " + startDate 
                + " - end date: " + endDate
				+ " - number of lesson: " + numOfLesson 
                + "\n" + m_Teacher.toString();
				
	}
	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getNameOfSubject() {
		return nameOfSubject;
	}

	public void setNameOfSubject(String nameOfSubject) {
		this.nameOfSubject = nameOfSubject;
	}

	public int getNumOfLesson() {
		return numOfLesson;
	}

	public void setNumOfLesson(int numOfLesson) {
		this.numOfLesson = numOfLesson;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Teacher getM_Teacher() {
		return m_Teacher;
	}

	public void setM_Teacher(Teacher m_Teacher) {
		this.m_Teacher = m_Teacher;
	}

	

	
}