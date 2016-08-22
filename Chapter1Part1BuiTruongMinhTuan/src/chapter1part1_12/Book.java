/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class Book {

    public Book() {
        input = new BufferedReader(new InputStreamReader(System.in));
    }
    String id;
    String name;
    String date;
    double price;
    int amount;
    String publisher;

    BufferedReader input;

    public Book(String id, String name, String date, double price, int amount, String publisher) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.price = price;
        this.amount = amount;
        this.publisher = publisher;
    }
    // compute money
    public double calculateMoney(){
        return this.amount * this.price;
    }
    public void inputInfo() throws IOException {
        System.out.println("Book ID:");
        id = input.readLine();
        System.out.println("Book name:");
        name = input.readLine();
        System.out.println("date of Book:");
        date = input.readLine();
        boolean check = true;
        while (check) {
            try {
                System.out.println("price of Book:");
                price = Integer.parseInt(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
        check = true;
        while (check) {
            try {
                System.out.println("amount of Book:");
                amount = Integer.parseInt(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
        System.out.println("publisher of Book:");
        publisher = input.readLine();
    }
    
    public void outputInfo() {
        System.out.println("ID: " + id);
        System.out.println("Book name: " + name);
        System.out.println("date of Book: " + date);
        System.out.println("price of Book: " + price);
        System.out.println("amount of Book : " + amount);
        System.out.println("publisher of Book : " + publisher);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    
}
