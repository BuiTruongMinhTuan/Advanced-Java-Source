/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author BTMT
 * @Date 22/08/2016
 * @version 1.0
 */
public class Soldier {

    String nameSoldier;
    int power;
    int weapon;

    public Soldier() {
    }

    public Soldier(String nameSoldier, int power, int weapon) {
        this.nameSoldier = nameSoldier;
        this.power = power;
        this.weapon = weapon;
    }
    // input information Soldier
    public void inputInfoSoldier() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        boolean check = true;
        while (check) {
            try {
                System.out.println("Soldier name:");
                nameSoldier = input.readLine();
            } catch (NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
        check = true;
        while (check) {
            try {
                System.out.println("Soldier power:");
                power = Integer.parseInt(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
        check = true;
        while (check) {
            try {
                System.out.println("Soldier weapon:");
                weapon = Integer.parseInt(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }

    }

    public int fight() {

        return --power;
    }

    public String getNameSoldier() {
        return nameSoldier;
    }

    public void setNameSoldier(String nameSoldier) {
        this.nameSoldier = nameSoldier;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

}
