
package chapter1part1_10;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class MainManagerInfomation {
    public static void main(String[] args) {
        try {
            ManagerInformation MI = new ManagerInformation();
            MI.manager();
            
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
