/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_1;

/**
 *
 * @author BTMT
 * @Date 18/08/2016
 * @version 1.0
 */
public class Main1_1 {

    public static void main(String[] args) {
        try {
            LinearEquation lE = new LinearEquation(12, 2);
            String root = lE.findRoot();
            System.out.println("Result of superlative equation: " + root);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
    
}
