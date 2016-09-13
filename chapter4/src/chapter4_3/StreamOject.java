package chapter4_3;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * @author Bui Truong Minh Tuan
 * Date : 12/9/2016
 * Version : 1.0
 * 
 */
public class StreamOject {

    public static void main(String[] args) {
        try {
            Random random = new Random();
            List<Student> listStudent = Arrays.asList(
                    new Student("Student1", random.nextInt(25)+3, random.nextInt(10)+1, random.nextInt(10)+1),
                    new Student("Student2", random.nextInt(25)+3, random.nextInt(10)+1, random.nextInt(10)+1),
                    new Student("Student3", random.nextInt(25)+3, random.nextInt(10)+1, random.nextInt(10)+1),
                    new Student("Student4", random.nextInt(25)+3, random.nextInt(10)+1, random.nextInt(10)+1),
                    new Student("HStudent5", random.nextInt(25)+3, random.nextInt(10)+1, random.nextInt(10)+1),
                    new Student("Student6", random.nextInt(25)+3, random.nextInt(10)+1, random.nextInt(10)+1),
                    new Student("HStudent7", random.nextInt(25)+3, random.nextInt(10)+1, random.nextInt(10)+1),
                    new Student("Student9", random.nextInt(25)+3, random.nextInt(10)+1, random.nextInt(10)+1),
                    new Student("Student10", random.nextInt(25)+3, random.nextInt(10)+1, random.nextInt(10)+1)
            );

            Stream<Student> stream = listStudent.stream();
            stream.forEach(st -> st.showInfo());

            // count number of student have age >= 18
            int countAge = (int) listStudent.stream().filter(st -> st.getAge() >= 18).count();
            System.out.println("Number of student have age >= 18: " + countAge);

            // count number of student have first name is H
            int countName = (int) listStudent.stream().filter(st -> st.getName().startsWith("H")).count();
            System.out.println("Number of student have first name is H: " + countName);
            System.out.println("List student have first name is H: ");
            List<Student> lst = listStudent.stream().filter(st -> st.getName().startsWith("H")).collect(Collectors.toList());
            lst.forEach(st -> st.showInfo());

            // find max, min and avg mark
            DoubleSummaryStatistics stats = listStudent.stream().mapToDouble(s -> s.calAvg()).summaryStatistics();
            System.out.println("- Max avg mark: " + stats.getMax());
            System.out.println("- Min avg mark: " + stats.getMin());
            System.out.println("- Averange avg mark: " + stats.getAverage());

            // create listStudent good student
            List<Student> goodSt = listStudent.stream().filter(st -> st.calAvg() >= 8).collect(Collectors.toList());
            Stream<Student> goodStudent = goodSt.stream();
            System.out.println("List good student");
            goodStudent.forEach(st -> st.showInfo());

        } catch (NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }
}
