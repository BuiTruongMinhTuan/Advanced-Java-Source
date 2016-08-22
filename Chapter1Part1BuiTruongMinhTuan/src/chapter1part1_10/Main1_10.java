/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_10;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class Main1_10 {
    public static void main(String[] args) {
        try {
            ManagerInformation MI = new ManagerInformation();
            MI.manager();
            
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
