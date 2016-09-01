
package chapter1_29;

/**
 *
 * @author Bui Truong Minh Tuan
 * @Date 01/09/2016
 * @version 1.0
 */
public class MainforSingle {

    public static void main(String[] args) {
        SingleTeacher object = SingleTeacher.getInstance();
        System.out.println(object.shareDocument());
    }
}
