/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_12;

import java.io.IOException;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class ReferenceBook extends Book {

    public ReferenceBook() {
    }

    public ReferenceBook(String id, String name, String date, double price, int amount, String publisher) {
        super(id, name, date, price, amount, publisher);
    }
    double tax;

    public ReferenceBook(double tax, String id, String name, String date, double price, int amount, String publisher) {
        super(id, name, date, price, amount, publisher);
        this.tax = tax;
    }

    @Override
    public double calculateMoney() {
        return super.calculateMoney() + super.calculateMoney() * (tax / 100);
    }

    @Override
    public void inputInfo() throws IOException {
        super.inputInfo(); //To change body of generated methods, choose Tools | Templates.
        boolean check = true;
        while (check) {
            try {
                System.out.println("tax of Book:(%)");
                tax = Double.parseDouble(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            if (tax < 1 || tax > 100) {
                System.out.println("tax of Book olny 1 to 100 % please try again!");
                continue;
            }
            check = false;
        }
    }

    @Override
    public void outputInfo() {
        super.outputInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("tax of Book: " + tax + " %");
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

}
