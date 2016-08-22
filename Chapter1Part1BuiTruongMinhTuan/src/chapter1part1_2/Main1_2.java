/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_2;



/**
 *
 * @author long
 */
public class Main1_2 {
    public static void main(String[] args) {
        try {
            CalculateTwoNumbers cTN = new CalculateTwoNumbers(1, 2);
            double resutl = cTN.calculater(4);
            System.out.println("Result of superlative equation: " + resutl);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
