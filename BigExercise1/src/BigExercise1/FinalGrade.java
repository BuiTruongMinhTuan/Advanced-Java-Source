package BigExercise1;
import java.util.List;

/**
 * @author Bui Truong Minh Tuan
 * @created 06-Thg9-2016 11:32:05 CH
 * @version 1.0
 * 
 * Class for final grade of student
 */
public class FinalGrade {

	public List<MarkSession> list;
	public MarkBigExercise m_MarkExam;

	public FinalGrade(){

	}

	public FinalGrade(List<MarkSession> list, MarkBigExercise m_MarkExam) {
		super();
		this.list = list;
		this.m_MarkExam = m_MarkExam;
	}
    
   
    //Calculate average of all session mark
	public double calAllSessionMark(){
		double result = 0;
		for(MarkSession mark: list)
			result += mark.calSessionGrade();
		return result = result / list.size();
	}

	
    //Calculate total final grade 
	public double calFinalGrade(){
		return calAllSessionMark() * 0.3 + m_MarkExam.getMarkMultiChoice()
		* 0.4 + m_MarkExam.getMarkPractice() * 0.3;
	}
	public List<MarkSession> getList() {
		return list;
	}

	public void setList(List<MarkSession> list) {
		this.list = list;
	}

	public MarkBigExercise getM_MarkExam() {
		return m_MarkExam;
	}

	public void setM_MarkExam(MarkBigExercise m_MarkExam) {
		this.m_MarkExam = m_MarkExam;
	}

	

}