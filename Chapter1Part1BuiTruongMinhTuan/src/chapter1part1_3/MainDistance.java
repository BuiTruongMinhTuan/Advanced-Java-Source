
package chapter1part1_3;

/**
 *
 * @author BTMT
 * @Date 19/08/2016
 * @version 1.0
 */
public class MainDistance {
    public static void main(String[] args) {
         try {
            DistanceOfTwoPoints doT = new DistanceOfTwoPoints(1, 3, 2, 4);
            double resutl = doT.calculatorDistance();
            System.out.println("Distance Of TwoPoints: " + String.format("%.2f", resutl));
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
