package BigExercise1;

import java.util.List;

/**
 * @author Bui Truong Minh Tuan
 * @created 06-Thg9-2016 11:32:05 CH
 * @version 1.0
 *
 * Class about information of CLass
 */
public class Class {

    private String endDate;
    private String startDate;
    private String nameOfClass;
    private String idContract;
    private int numOfLesson;

    public List<Subject> listSubject;
    public List<Student> listStudent;
    public Teacher m_Teacher;
    public MarkTable m_MarkTable;

    public Class() {

    }

    public Class(String endDate, String nameOfClass, String numOfContract, String startDate, List<Subject> listSubject,
            List<Student> listStudent, Teacher m_Teacher, MarkTable m_MarkTable) {
        super();
        this.endDate = endDate;
        this.nameOfClass = nameOfClass;
        this.idContract = numOfContract;
        this.startDate = startDate;
        this.listSubject = listSubject;
        this.listStudent = listStudent;
        this.m_Teacher = m_Teacher;
        this.m_MarkTable = m_MarkTable;
    }

    public Class(String endDate, String nameOfClass, String numOfContract, int numOfLesson, String startDate,
            List<Subject> listSubject, List<Student> listStudent, Teacher m_Teacher) {
        super();
        this.endDate = endDate;
        this.nameOfClass = nameOfClass;
        this.idContract = numOfContract;
        this.numOfLesson = numOfLesson;
        this.startDate = startDate;
        this.listSubject = listSubject;
        this.listStudent = listStudent;
        this.m_Teacher = m_Teacher;
    }

    //Get information of class
    @Override
    public String toString() {
        System.out.println("*************************************");
        return "Class name: " + nameOfClass
                + " \n- start date: " + startDate
                + " - end date: " + endDate
                + " \n- name of teacher: " + m_Teacher.name
                + " \n- total of lesson: " + numOfLesson
                + " \n- num of contract: " + idContract;
    }

    //Get information of students in class
    public String printInformationStudent() {
        System.out.println("*************************************");
        String information = "";
        for (Student student : listStudent) {
            information += "Name: " + student.name
                    + " - phone: " + student.phone
                    + " \n- email: " + student.email
                    + " - birthday: " + student.getBirthDay()
                    + "\n";
        }
        return information;
    }

    //Get information of subject 
    public String printInformationSubject() {
        System.out.println("*************************************");
        String information = "";
        for (Subject subject : listSubject) {
            information += "Subject name: " + subject.getNameOfSubject()
                    + " - total of lesson: " + subject.getNumOfLesson()
                    + " \n- start date: " + subject.getStartDate()+ " - end date: " 
                    + " \n- name of teacher: " + subject.getM_Teacher().name 
                    + "\n";
        }
        return information;
    }

    public void addStudent(Student student) {
        listStudent.add(student);
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public void setNameOfClass(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
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

    public List<Subject> getListSubject() {
        return listSubject;
    }

    public void setListSubject(List<Subject> listSubject) {
        this.listSubject = listSubject;
    }

    public List<Student> getM_Student() {
        return listStudent;
    }

    public void setM_Student(List<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public Teacher getM_Teacher() {
        return m_Teacher;
    }

    public void setM_Teacher(Teacher m_Teacher) {
        this.m_Teacher = m_Teacher;
    }

    public MarkTable getM_MarkTable() {
        return m_MarkTable;
    }

    public void setM_MarkTable(MarkTable m_MarkTable) {
        this.m_MarkTable = m_MarkTable;
    }

}
