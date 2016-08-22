/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_13;

import chapter1part1_6.StaffSalary;
import java.io.IOException;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class ProductionEmployee extends StaffSalary {

    final float RATEBONUS = 0.05f;
    final int BASEAMOUNT = 1000;
    int amount;

    public ProductionEmployee() {
    }

    @Override
    public void inputInformationStaff() throws IOException {
        super.inputInformationStaff(); //To change body of generated methods, choose Tools | Templates.
        boolean check = true;
        while (check) {
            try {
                System.out.println("amount of Production: ");
                amount = Integer.parseInt(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
    }

    @Override
    public float computeSalary() {
        this.income = this.coefficientsSalary * this.basicSalary + (amount - BASEAMOUNT) * RATEBONUS;
        incomeTax = income - basicTax - amountOfPeopleReduce * basicReduce;
        if (incomeTax < 0) {
            incomeTax = 0;
        }
        computePersonalIncomeTax(incomeTax);
        this.realSalary = income - personalIncomeTax;
        return this.realSalary;
    }

    @Override
    public void outputInformationStaff() {
        System.out.println("Information Trade Employyee:");
        System.out.println("income :" + coefficientsSalary + " * " + basicSalary + " + " + ((amount - BASEAMOUNT) * RATEBONUS) + " = " + income);
        System.out.println("income Tax :" + income + " - " + basicTax + " - " + amountOfPeopleReduce + " * " + basicReduce + " = " + incomeTax);
        System.out.println("personal Income Tax :" + personalIncomeTax);
        System.out.println("real Salary :" + income + " - " + personalIncomeTax + " = " + realSalary);
    }

}
