/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_9;

/**
 *
 * @author BTMT
 * @Date 22/08/2016
 * @version 1.0
 */
public class Main1_9 {
    public static void main(String[] args) {
        try {
            ManagerListComputer SB = new ManagerListComputer();
            SB.manager();
            
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
