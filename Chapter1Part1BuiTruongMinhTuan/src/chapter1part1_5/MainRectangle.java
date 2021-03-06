
package chapter1part1_5;

/**
 *
 * @author BTMT
 * @Date 19/08/2016
 * @version 1.0
 */
public class MainRectangle {
    public static void main(String[] args) {
        try {
            CircuitAreaRectangle ca = new CircuitAreaRectangle(1, 1, 3, 3);
            double circuit = ca.calcuCircuit();
            System.out.println("Circuit of Rectangle " + String.format("%.1f", circuit));
            double area = ca.calcuArea();
            System.out.println("Area of Rectangle " + String.format("%.1f", area));
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
