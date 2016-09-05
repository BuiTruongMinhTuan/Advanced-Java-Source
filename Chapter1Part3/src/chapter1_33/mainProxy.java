
package chapter1_33;

/**
 *
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class mainProxy {

    
    public static void main(String[] args) {
        
        Image image = new ProxyImage("test_10mb.jpg");
        //img will load form disk
        image.display();
        System.out.println("");
        //img not display
        image.display();
    }
    
}
