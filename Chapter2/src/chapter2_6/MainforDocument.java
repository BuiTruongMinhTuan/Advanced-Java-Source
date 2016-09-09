
package chapter2_6;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * @author Bui Truong Minh Tuan
 * Date : 8/9/2016
 * Version : 1.0
 * 
 */
public class MainforDocument {

   
    public static void main(String[] args) {
        
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            Document document = new Document();
            System.out.println("Please input document:");
            String str = input.readLine();
            
            document.tokenize(str);
            document.showInfo();
        } catch (Exception ex) {
            System.out.println("Err: " + ex.getMessage());
        }
    }

}
