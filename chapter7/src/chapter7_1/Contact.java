package chapter7_1;

/*
 * @author Bui Truong Minh Tuan
 * Date : 16/9/2016
 * Version : 1.0
 * 
 */
public class Contact {
    private String numberPhone;
    private String name;
    
    public Contact(String numberPhone, String name) {
        this.numberPhone = numberPhone;
        this.name = name;
    }
    //show information contact
    public void showInfo(){
        System.out.println("------------------------------------");
        System.out.println("Name: "+this.name);
        System.out.println("Phone Number : "+this.numberPhone);
        System.out.println("------------------------------------");
    }
    public String getNumberPhone() {
        return numberPhone;
    }

    public String getName() {
        return name;
    }
}
