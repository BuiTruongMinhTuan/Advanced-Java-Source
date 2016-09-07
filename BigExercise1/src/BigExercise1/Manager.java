package BigExercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

/**
 * @author Bui Truong Minh Tuan
 * @created 06-Thg9-2016 11:32:05 CH
 * @version 1.0
 *
 * Class Manager Program
 */
public class Manager {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    Class Trainer;

    public Manager() {
        Trainer = new Class("11/10", "Training", "001", 24, "11/7", defaultSubject(), defaultStudent(), defaultTeacher());
        defaultListMark();
    }

    //add default Student
    public List<Student> defaultStudent() {
        List<Student> listStudent = new ArrayList<>();
        student_1 = new Student("student_1@gmail.com", "student_1", "091919191", "1/1");

        listStudent.add(student_1);
        return listStudent;

    }

    //add default Teacher
    public Teacher defaultTeacher() {
        List<String> listsubject = new ArrayList<>();
        listsubject.add("Java Basic");
        listsubject.add("Java Advanced");

        Teacher ktPhuong = new Teacher("ktphuong@gmail.com", "Phuong", "0123456789", listsubject);
        return ktPhuong;

    }

    //add default Subject
    public List<Subject> defaultSubject() {
        javaBasic = new Subject("18/7", "Java Basic", 12, "12/8", defaultTeacher());
        List<Subject> subjects = new ArrayList<>();
        subjects.add(javaBasic);
        return subjects;
    }
    Student student_1;
    Subject javaBasic;

    //add default Subject
    public void defaultListMark() {
        MarkSession javaSession_1A = new MarkSession(10, 10, 10);
        MarkSession javaSession_2A = new MarkSession(10, 10, 10);

        List<MarkSession> listJava_A = new ArrayList<>();
        listJava_A.add(javaSession_1A);
        listJava_A.add(javaSession_2A);
        FinalGrade finalJava_A = new FinalGrade(listJava_A, new MarkBigExercise(8, 8));
        DetailMark detailJava_A = new DetailMark(javaBasic, student_1, finalJava_A);
        List<DetailMark> listDetail = new ArrayList<>();
        listDetail.add(detailJava_A);
        MarkTable markTable = new MarkTable(listDetail);
        Trainer.setM_MarkTable(markTable);
    }

    public void menuChoice() {

        System.out.println(Trainer.toString());
        try {
            int cont = 1;
            while (cont == 1) {
                System.out.println("+++++++++++++++++++++++++++++++++++");
                System.out.println("1.Show information of Students ");
                System.out.println("2.Add new student ");
                System.out.println("3.Show all mark of all student");
                System.out.println("4.Show information teacher");
                System.out.println("5.Show information of Subject ");
                System.out.println("6.Exit");
                System.out.println("Please choice 1 to 6");
                int choice = 0;
                try {
                    choice = Integer.parseInt(input.readLine());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.toString());
                    continue;
                }

                switch (choice) {
                    //Show information all student
                    case 1:
                        List<Student> listStudent = Trainer.getM_Student();
                        for (Student student : listStudent) {
                            System.out.println(student.toString());

                        }
                        break;

                    //Add new student
                    case 2:
                        Student student = createStudent();
                        Trainer.addStudent(student);
                        FinalGrade java = createFinalGradeJava();

                        List<Subject> listSub = Trainer.getListSubject();
                        MarkTable markTable = Trainer.getM_MarkTable();
                        for (Subject subject : listSub) {

                            DetailMark detailJava = new DetailMark(subject, student, java);
                            markTable.addDetailMark(detailJava);

                        }

                        break;

                    //Print all mark of all student
                    case 3:
                        List<DetailMark> listDetailMark = Trainer.getM_MarkTable().getList();
                        System.out.println(listDetailMark.get(0).getM_Subject().toString());
                        for (DetailMark detail : listDetailMark) {
                            System.out.println("...............");
                            System.out.println(detail.getM_Student().toString());

                            double practice = detail.getM_FinalGrade().getM_MarkExam().getMarkPractice();
                            double multichoice = detail.getM_FinalGrade().getM_MarkExam().getMarkMultiChoice();
                            System.out.println("Mark of practice: " + practice);
                            System.out.println("Mark of multichoice: " + multichoice);
                            List<MarkSession> listSession = detail.getM_FinalGrade().getList();
                            int i = 1;
                            for (MarkSession markSession : listSession) {
                                System.out.println();
                                System.out.println("Session " + i);
                                System.out.println("Mark active : " + markSession.getMarkActive());
                                System.out.println("Mark exercise" + markSession.getMarkExercise());
                                System.out.println("Mark attendence: " + markSession.getMarkAttendence());

                                i++;
                            }
                            System.out.println();
                            System.out.println("Total mark: " + detail.getM_FinalGrade().calFinalGrade());
                            System.out.println("++++++++++++++++++++++++++");
                        }
                        break;

                    //Print information of teacher
                    case 4:

                        Teacher teacher = Trainer.getM_Teacher();
                        System.out.println(teacher.toString());

                        break;

                    //Show information all subject
                    case 5:
                        List<Subject> listSubject = Trainer.getListSubject();
                        for (Subject subject : listSubject) {
                            System.out.println(subject.toString());
                            System.out.println("=============================");
                        }
                        break;

                    //Exit application
                    case 6:
                        cont = 0;
                        break;
                    default:
                        System.err.println("Choice is incorrect olny choice 1-6");
                        continue;
                }
            }

        } catch (NumberFormatException | IOException | InputMismatchException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
    }

    //Create new Student
    public Student createStudent() throws IOException {

        System.out.println("Input name of student: ");
        String name = input.readLine();
        System.out.println("Input email of student: ");
        String email = input.readLine();
        System.out.println("Input phone of student: ");
        String phone = input.readLine();
        System.out.println("Input birthday of student: ");
        String birthday = input.readLine();
        Student student = new Student(email, name, phone, birthday);
        return student;
    }

    //Create new final grade for a student of java subject
    public FinalGrade createFinalGradeJava() throws NumberFormatException, IOException {
        boolean check;
        System.out.println("This is java subject");
        FinalGrade finalGrade = new FinalGrade();
        List<MarkSession> listMarkSession = new ArrayList<>();

        //Create 2 mark session and add to list 
        for (int i = 1; i <= 2; i++) {
            System.out.println("-------------");
            System.out.println("Session " + i);
            double markAttendence = 0;
            double markActive = 0;
            double markExercise = 0;

            check = true;
            while (check) {
                System.out.println("Input mark attendence: ");

                try {
                    markAttendence = Double.parseDouble(input.readLine());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.toString());
                    System.out.println("try agian!");
                    continue;
                }
                if (markAttendence < 0 || markAttendence > 10) {
                    System.out.println("Mark attendence must be greater than 0 and less than 10");
                    continue;
                } check = false;
            }

            check = true;
            while (check) {
                System.out.println("Input mark active: ");

                try {
                    markActive = Double.parseDouble(input.readLine());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.toString());
                    System.out.println("try agian!");
                    continue;
                }
                if (markActive < 0 || markActive > 10) {
                    System.out.println("Mark active must be greater than 0 and less than 10");
                    continue;
                } check = false;
            }

            check = true;
            while (check == true) {
                System.out.println("Input mark exercise: ");

                try {
                    markExercise = Double.parseDouble(input.readLine());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.toString());
                    System.out.println("try agian!");
                    continue;
                }
                if (markExercise < 0 || markExercise > 10) {
                    System.out.println("Mark exercise must be greater than 0 and less than 10");
                    continue;
                } check = false;
            }

            MarkSession markSession = new MarkSession(markAttendence, markActive, markExercise);
            listMarkSession.add(markSession);
        }

        System.out.println();
        //Create mark exam
        double practice = 0;
        double multichoice = 0;

        check = true;
        while (check) {
            System.out.println("Input mark practice exam: ");

            try {
                practice = Double.parseDouble(input.readLine());
            } catch (NumberFormatException ex) {
                System.err.println(ex.toString());
                System.out.println("try agian!");
                continue;
            }
            if (practice < 0 || practice > 10) {
                System.out.println("Mark practice exam must be greater than 0 and less than 10");
                continue;
            } check = false;
        }

        check = true;
        while (check == true) {
            System.out.println("Input mark multichoice exam: ");

            try {
                multichoice = Double.parseDouble(input.readLine());
            } catch (NumberFormatException ex) {
                System.err.println(ex.toString());
                System.out.println("try agian!");
                continue;
            }
            if (multichoice < 0 || multichoice > 10) {
                System.out.println("Mark mulitchoice exam must be greater than 0 and less than 10");
                continue;
            } check = false;
        }

        MarkBigExercise markExam = new MarkBigExercise(multichoice, practice);

        finalGrade.setList(listMarkSession);
        finalGrade.setM_MarkExam(markExam);
        return finalGrade;
    }
}
