/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_7;

import chapter1part1_7.ClassCD;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class ManagerCD {

    ArrayList<ClassCD> ListCD;
    ClassCD cD;

    public ManagerCD() {
        ListCD = new ArrayList<>();
        
    }

    public void inputCD() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("== CDs Managerment Program ==");

            while (true) {
                cD = new ClassCD();
                System.out.println("Please input the information of your CD");
                System.out.print("ID: ");
                cD.setiD(input.readLine());
                System.out.print("Name of CD: ");
                cD.setNameCD(input.readLine());
                System.out.print("Single: ");
                cD.setNameSinger(input.readLine());
                boolean check = true;
                while (check) {
                    try {
                        System.out.print("Number of songs: ");
                        cD.setNumOfSong(Integer.parseInt(input.readLine()));
                    } catch (NumberFormatException | NullPointerException ex) {
                        System.out.println(ex.toString());
                        continue;
                    }
                    check = false;
                }
                check = true;
                while (check) {
                    try {
                        System.out.print("Price: ");
                        cD.setPrice(Float.parseFloat(input.readLine()));
                    } catch (NumberFormatException | NullPointerException ex) {
                        System.out.println(ex.toString());
                        continue;
                    }
                    check = false;
                }

                ListCD.add(cD);
                System.out.println("Just added your CD into to the Collection");
                System.out.print("Do you want to add CD into to Collection (y/n) continue? ");
                String answer = input.readLine();
                if (answer.equalsIgnoreCase("y")) {
                    continue;
                }

                //Print Information and Price
                System.out.println("\n== Show all information in Collection ==");
                computePriceOfAllCDs();
                System.exit(0);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void computePriceOfAllCDs() {
        double price = 0;
        for (int i = 0; i < ListCD.size(); i++) {
            System.out.println("[CD No " + (i+1) + "]:");
            ListCD.get(i).outputInfoCD();
            price += ListCD.get(i).getPrice();
            System.out.println("-----------------");
            
        }
        System.out.println("Total Price: " + String.format("%.1f", price));
    }
}
