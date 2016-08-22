/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_5;

/**
 *
 * @author long
 */
public class Main1_5 {
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
