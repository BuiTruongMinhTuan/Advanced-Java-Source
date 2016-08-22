/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_8;

import java.io.IOException;

/**
 *
 * @author BTMT
 * @Date 22/08/2016
 * @version 1.0
 */
public class Main1_8 {
    public static void main(String[] args) throws IOException {
        try {
            SimulatedBattles SB = new SimulatedBattles();
            SB.battles();
            
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
