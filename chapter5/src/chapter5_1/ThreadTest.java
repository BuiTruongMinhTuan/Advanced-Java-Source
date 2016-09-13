
package chapter5_1;

/*
 * @author Bui Truong Minh Tuan
 * Date : 13/9/2016
 * Version : 1.0
 * 
 */
public class ThreadTest {
    //to run program
     public static void main(String[] args) {
        
        ThreadDemo T1 = new ThreadDemo("Google");
        T1.start();
        ThreadDemo T2 = new ThreadDemo("Yahoo");
        T2.start();
        ThreadDemo T3 = new ThreadDemo("Facebook");
        T3.start();
    }
}
