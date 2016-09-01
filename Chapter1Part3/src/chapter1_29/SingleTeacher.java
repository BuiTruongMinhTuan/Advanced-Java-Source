
package chapter1_29;

/**
 *
 * @author Bui Truong Minh Tuan
 * @Date 01/09/2016
 * @version 1.0
 */
public class SingleTeacher {

    private static SingleTeacher instance = new SingleTeacher();

    private SingleTeacher() {
    }

    public static SingleTeacher getInstance() {
        return instance;
    }
    
    //teacher share document
    public String shareDocument() {
        return "Tai lieu tham khai: \n - Chuong 1\n - Chuong 2\n - Chuong 3\n - Chuong 4\n ...";
    }
}
