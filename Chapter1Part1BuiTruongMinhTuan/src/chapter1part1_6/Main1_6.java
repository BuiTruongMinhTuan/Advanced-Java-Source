/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_6;

import java.io.IOException;

/**
 *
 * @author long
 */
public class Main1_6 {

    public static void main(String[] args) throws IOException {
        try {
            StaffSalary SS = new StaffSalary();
            SS.inputInformationStaff();
            SS.computeSalary();
            SS.outputInformationStaff();
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
