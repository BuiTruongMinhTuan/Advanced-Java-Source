
package chapter1part1_9;

/**
 *
 * @author BTMT
 * @Date 22/08/2016
 * @version 1.0
 */
public class MainManagerComputer {
    public static void main(String[] args) {
        try {
            ManagerListComputer SB = new ManagerListComputer();
            SB.manager();
            
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
