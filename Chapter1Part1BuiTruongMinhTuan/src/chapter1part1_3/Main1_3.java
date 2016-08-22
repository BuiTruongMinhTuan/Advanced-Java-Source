/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_3;

/**
 *
 * @author BTMT
 * @Date 19/08/2016
 * @version 1.0
 */
public class Main1_3 {
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
