/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_11;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class MainManagerTrade {
    public static void main(String[] args) {
        try {
            ManagerTrade MT = new ManagerTrade();
            MT.manager();
            
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
