
package Exercise4_Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*
 * @author Bui Truong Minh Tuan
 * Date : 19/9/2016
 * Version : 1.0
 * 
 */
public class MainforStream {
    public static void main(String[] args) {
        List<Employee> listEmployee = new ArrayList<Employee>();
        createListEmployee(listEmployee);
        
        System.out.println("----List Employee----");
        showInfoListEmployee(listEmployee);
        
        
        System.out.println("----List Employee Salary More 3M----");
        double salary=3000000;
        filterSalary(listEmployee, salary);
        
        System.out.println("----List Employee have \"Anh\"----");
        String name="Anh";
        filterName(listEmployee, name);
        
        System.out.println("The average age of employees: "+averageAge(listEmployee));
        System.out.println("The highest salaries of employees: "+highestSalary(listEmployee));
        System.out.println("The lowest salaries of employees: "+lowestSalary(listEmployee));
        System.out.println("The average salaries of employees: "+String.format("%.1f",averageSalary(listEmployee)));
    }
    //creta random Employee list
    static void createListEmployee(List<Employee> listEmployee){
        Random rd = new Random();
       
        for (int i = 0; i < 15; i++) {
            String name="Employee "+i;
            int age=rd.nextInt(65);
            double salary=rd.nextInt(2000000)+2000000;
            
            listEmployee.add(new Employee(name, age, salary));
        }
    }
    
    //show Infomation all Employeee
    static void showInfoListEmployee(List<Employee> listEmployee){
        
        listEmployee.stream().forEach(e ->System.out.println(e.toString()));
    }
    
    //filter Employee more salary over 3M
    static void filterSalary(List<Employee> listEmployee,double salary){
        List<Employee> listEmployeeSalary=listEmployee.stream().filter(sl->sl.getSalary()>salary).collect(Collectors.toList());
        System.out.println("\t\tHave "+listEmployeeSalary.size());
        listEmployeeSalary.stream().forEach(e ->System.out.println(e.toString()));
    }
    
    //filter contains name
    static void filterName(List<Employee> listEmployee,String name){
        List<Employee> listEmployeeName=listEmployee.stream().filter(sl->sl.getName().contains(name)).collect(Collectors.toList());
        System.out.println("\t\tHave "+listEmployeeName.size());
        listEmployeeName.stream().forEach(e ->System.out.println(e.toString()));
    }
    
    //The average age of employees
    public static int averageAge(List<Employee> employees) {
        System.out.println("-----------------------------");
        DoubleSummaryStatistics average = employees.stream().mapToDouble(e -> e.getAge()).summaryStatistics();
        return (int)average.getAverage();
    }
    
    //find employees with the highest salaries
    public static double highestSalary(List<Employee> employees) {
        System.out.println("-----------------------------");
        DoubleSummaryStatistics highest = employees.stream().mapToDouble(e -> e.getSalary()).summaryStatistics();
        return highest.getMax();
    }
    
    //find employees with the lowest salaries
    public static double lowestSalary(List<Employee> employees) {
        System.out.println("-----------------------------");
        DoubleSummaryStatistics lowest = employees.stream().mapToDouble(e -> e.getSalary()).summaryStatistics();
        return lowest.getMin();
    }

    //The average salary of employees
    public static double averageSalary(List<Employee> employees) {
        System.out.println("-----------------------------");
        DoubleSummaryStatistics average = employees.stream().mapToDouble(e -> e.getSalary()).summaryStatistics();
        return average.getAverage();
    }
}
