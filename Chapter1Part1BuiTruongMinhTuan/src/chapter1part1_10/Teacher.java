/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_10;

import java.io.IOException;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class Teacher extends Hunman {

    String headClass;
    double coefficients;
    double allowance;
    final double baseSalary = 1260000;

    public Teacher() {
    }

    public Teacher(String headClass, double coefficients, double allowance, String fullName, String birthDay, String address, String phone) {
        super(fullName, birthDay, address, phone);
        this.headClass = headClass;
        this.coefficients = coefficients;
        this.allowance = allowance;
    }

    public Teacher(String fullName, String birthDay, String address, String phone) {
        super(fullName, birthDay, address, phone);
    }

    public double setSalary() {
        double salary = coefficients * baseSalary + allowance;
        return salary;
    }

    @Override
    public void outputInfo() {
        super.outputInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Head Class: " + headClass);
        System.out.println("Coefficients: " + coefficients);
        System.out.println("Allowance: " + allowance);
        System.out.println("Salary: " + String.format("%.1f", setSalary()));
    }
    boolean check;

    @Override
    public void inputInfo() throws IOException {
        super.inputInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Head Class: ");
        headClass = input.readLine();

        boolean check = true;
        while (check) {
            try {
                System.out.println("Coefficients: ");
                coefficients = Double.parseDouble(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
        check = true;
        while (check) {
            try {
                System.out.println("Allowance: ");
                allowance = Double.parseDouble(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
    }

    public String getHeadClass() {
        return headClass;
    }

    public void setHeadClass(String headClass) {
        this.headClass = headClass;
    }

    public double getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(double coefficients) {
        this.coefficients = coefficients;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
    

}
