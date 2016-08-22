/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author BTMT
 * @Date 19/08/2016
 * @version 1.0
 */
//List final lever salary 
enum LeverSalary {
    lever1(5000000, .05f, 250000),
    lever2(10000000, .1f, 500000),
    lever3(18000000, .15f, 1200000),
    lever4(32000000, .2f, 2800000),
    lever5(52000000, .25f, 5000000),
    lever6(80000000, .3f, 8400000),
    lever7(80000000, .35f, 8400000);

    private final int incomeTax;
    private final float tax;
    private final int maxLeverTax;

    private LeverSalary(int incomeTax, float tax, int maxLeverTax) {

        this.incomeTax = incomeTax;
        this.tax = tax;
        this.maxLeverTax = maxLeverTax;

    }

    public int getIncomeTax() {

        return this.incomeTax;

    }

    public float getTax() {

        return this.tax;

    }

    public float getMaxLeverTax() {

        return this.maxLeverTax;

    }
}

public class StaffSalary {

    protected String staffName;
    protected float coefficientsSalary;
    protected int amountOfPeopleReduce;
    protected int allowance;
    protected float income;
    protected float incomeTax;
    protected float personalIncomeTax;
    protected float realSalary;

    protected BufferedReader input;

    public StaffSalary() {
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    //input infomation of staff
    public void inputInformationStaff() throws IOException {

        System.out.println("Input Information Staff:");
        boolean check = true;
        while (check) {
            try {
                System.out.println("Staff name:");
                staffName = input.readLine();
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
        check = true;
        while (check) {
            try {
                System.out.println("Coefficients Salary:");
                coefficientsSalary = Float.parseFloat(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
        check = true;
        while (check) {
            try {
                System.out.println("Amount of People Reduce:");
                amountOfPeopleReduce = Integer.parseInt(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
        check = true;
        while (check) {
            try {
                System.out.println("Allowance:");
                allowance = Integer.parseInt(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }

    }

    //output infomation of staff
    public void outputInformationStaff() {

        System.out.println("Information Staff:");
        System.out.println("income :" + coefficientsSalary + " * " + basicSalary + " + " + allowance + " = " + income);
        System.out.println("income Tax :" + income + " - " + basicTax + " - " + amountOfPeopleReduce + " * " + basicReduce + " = " + incomeTax);
        System.out.println("personal Income Tax :" + personalIncomeTax);
        System.out.println("real Salary :" + income + " - " + personalIncomeTax + " = " + realSalary);

    }
    protected int basicSalary = 1260000;
    protected int basicTax = 9000000;
    protected int basicReduce = 3600000;

    public float computeSalary() {
        income = coefficientsSalary * basicSalary + allowance;
        incomeTax = income - basicTax - amountOfPeopleReduce * basicReduce;
        if (incomeTax < 0) {
            incomeTax = 0;
        }
        computePersonalIncomeTax(incomeTax);
        realSalary = income - personalIncomeTax;
        return realSalary;
    }

    public float computePersonalIncomeTax(float incomeTax) {
        if (incomeTax < LeverSalary.lever1.getIncomeTax()) {

            personalIncomeTax = incomeTax * LeverSalary.lever1.getTax();

        } else if (incomeTax < LeverSalary.lever2.getIncomeTax()) {

            personalIncomeTax = LeverSalary.lever1.getMaxLeverTax();
            personalIncomeTax += (incomeTax - LeverSalary.lever1.getIncomeTax()) * LeverSalary.lever2.getTax();

        } else if (incomeTax < LeverSalary.lever3.getIncomeTax()) {

            personalIncomeTax = LeverSalary.lever1.getMaxLeverTax();
            personalIncomeTax += LeverSalary.lever2.getMaxLeverTax();
            personalIncomeTax += (incomeTax - LeverSalary.lever2.getIncomeTax()) * LeverSalary.lever3.getTax();

        } else if (incomeTax < LeverSalary.lever4.getIncomeTax()) {

            personalIncomeTax = LeverSalary.lever1.getMaxLeverTax();
            personalIncomeTax += LeverSalary.lever2.getMaxLeverTax();
            personalIncomeTax += LeverSalary.lever3.getMaxLeverTax();
            personalIncomeTax += (incomeTax - LeverSalary.lever3.getIncomeTax()) * LeverSalary.lever4.getTax();

        } else if (incomeTax < LeverSalary.lever5.getIncomeTax()) {

            personalIncomeTax = LeverSalary.lever1.getMaxLeverTax();
            personalIncomeTax += LeverSalary.lever2.getMaxLeverTax();
            personalIncomeTax += LeverSalary.lever3.getMaxLeverTax();
            personalIncomeTax += LeverSalary.lever4.getMaxLeverTax();
            personalIncomeTax += (incomeTax - LeverSalary.lever4.getIncomeTax()) * LeverSalary.lever5.getTax();

        } else if (incomeTax < LeverSalary.lever6.getIncomeTax()) {

            personalIncomeTax = LeverSalary.lever1.getMaxLeverTax();
            personalIncomeTax += LeverSalary.lever2.getMaxLeverTax();
            personalIncomeTax += LeverSalary.lever3.getMaxLeverTax();
            personalIncomeTax += LeverSalary.lever4.getMaxLeverTax();
            personalIncomeTax += LeverSalary.lever5.getMaxLeverTax();
            personalIncomeTax += (incomeTax - LeverSalary.lever5.getIncomeTax()) * LeverSalary.lever6.getTax();

        } else {

            personalIncomeTax = LeverSalary.lever1.getMaxLeverTax();
            personalIncomeTax += LeverSalary.lever2.getMaxLeverTax();
            personalIncomeTax += LeverSalary.lever3.getMaxLeverTax();
            personalIncomeTax += LeverSalary.lever4.getMaxLeverTax();
            personalIncomeTax += LeverSalary.lever5.getMaxLeverTax();
            personalIncomeTax += LeverSalary.lever6.getMaxLeverTax();
            personalIncomeTax += (incomeTax - LeverSalary.lever6.getIncomeTax()) * LeverSalary.lever7.getTax();
        }
        return personalIncomeTax;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public float getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(float coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public int getAmountOfPeopleReduce() {
        return amountOfPeopleReduce;
    }

    public void setAmountOfPeopleReduce(int amountOfPeopleReduce) {
        this.amountOfPeopleReduce = amountOfPeopleReduce;
    }

    public int getAllowance() {
        return allowance;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public float getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(float incomeTax) {
        this.incomeTax = incomeTax;
    }

    public float getPersonalIncomeTax() {
        return personalIncomeTax;
    }

    public void setPersonalIncomeTax(float personalIncomeTax) {
        this.personalIncomeTax = personalIncomeTax;
    }

    public float getRealSalary() {
        return realSalary;
    }

    public void setRealSalary(float realSalary) {
        this.realSalary = realSalary;
    }

}
