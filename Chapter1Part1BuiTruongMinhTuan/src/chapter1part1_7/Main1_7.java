/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_7;

/**
 *
 * @author long
 */
public class Main1_7 {
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
