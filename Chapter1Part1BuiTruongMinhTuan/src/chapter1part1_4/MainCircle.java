
package chapter1part1_4;



/**
 *
 * @author BTMT
 * @Date 19/08/2016
 * @version 1.0
 */
public class MainCircle {
    public static void main(String[] args) {
        try {
            CircuitAreaCircle ca = new CircuitAreaCircle(1, 1, 2, 4);
            double circuit = ca.calcuCircuit();
            System.out.println("Circuit Of Circle " + String.format("%.2f", circuit));
            double area = ca.calcuArea();
            System.out.println("Circuit Of Circle " + String.format("%.2f", area));
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
