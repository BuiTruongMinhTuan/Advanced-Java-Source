/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_8;

import chapter1part1_8.Soldier;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class Trooper extends Soldier {

    @Override
    public int fight() {
        power -= 3;
        return power;
    }

}
