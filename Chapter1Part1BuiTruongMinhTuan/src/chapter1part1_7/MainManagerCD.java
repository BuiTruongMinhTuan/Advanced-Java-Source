
package chapter1part1_7;

/**
 *
 * @author BTMT
 * @Date 19/08/2016
 * @version 1.0
 */
public class MainManagerCD {
    public static void main(String[] args) {
        try {
            ManagerCD MC = new ManagerCD();
            MC.inputCD();
            MC.computePriceOfAllCDs();
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
