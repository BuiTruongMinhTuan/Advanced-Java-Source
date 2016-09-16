package chapter7_2;

/*
 * @author Bui Truong Minh Tuan
 * Date : 16/9/2016
 * Version : 1.0
 * 
 */
public class Department {

    private String id;
    private String name;

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
    }
    //show infomation
    public void showInfo() {
        System.out.println("---------------------");
        System.out.println("id " + this.id);
        System.out.println("name " + this.name);
        System.out.println("---------------------");
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
