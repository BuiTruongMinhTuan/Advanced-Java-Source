package chapter2_5;

/*
 * @author Bui Truong Minh Tuan
 * Date : 8/9/2016
 * Version : 1.0
 * 
 */

public class Employee implements Comparable<Employee>{

	 public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public Employee(){
    }
    public String id;
    public String name;
    public int age;
    public double salary;

    @Override
    public int compareTo(Employee o) {
        return Double.compare(o.salary, this.salary);
    }
    public String toString(){
        return "id: " + this.id + "\nname: " + this.name + "\nage: " + this.age
                + "\nsalary: " + this.salary;
    }
}
