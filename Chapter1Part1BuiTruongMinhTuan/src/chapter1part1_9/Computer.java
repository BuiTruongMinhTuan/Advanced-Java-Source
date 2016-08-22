/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author long
 */
public class Computer {

    String iD;
    int prince;
    String manufacturer;
    int quantum;
    //For desktop
    String CPU;
    String RAM;
    //For Laptop
    int weight;
    int timeOfCell;
    int screenSize;
    float amount;
    BufferedReader input;
    public Computer() {
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    public Computer(String iD, int prince, String manufacturer, int quantum) {
        this.iD = iD;
        this.prince = prince;
        this.manufacturer = manufacturer;
        this.quantum = quantum;
    }

    public void inputInfo() throws IOException {
        
        System.out.println("ID:");
        iD = input.readLine();
        boolean check = true;
        while (check) {
            try {
                System.out.println("prince:");
                prince = Integer.parseInt(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
        System.out.println("manufacturer:");
        manufacturer = input.readLine();
        check = true;
        while (check) {
            try {
                System.out.println("quantum:");
                quantum = Integer.parseInt(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
    }

    public void outputInfo() {
        System.out.println("ID: " + iD);
        System.out.println("prince: " + prince);
        System.out.println("manufacturer: " + manufacturer);
        System.out.println("quantum: " + quantum);
        System.out.println("Amount : " + String.format("%.1f", computeAmount()));
    }

    public float computeAmount() {
        amount = quantum * prince;
        return amount;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public int getPrince() {
        return prince;
    }

    public void setPrince(int prince) {
        this.prince = prince;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQuantum() {
        return quantum;
    }

    public void setQuantum(int quantum) {
        this.quantum = quantum;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTimeOfCell() {
        return timeOfCell;
    }

    public void setTimeOfCell(int timeOfCell) {
        this.timeOfCell = timeOfCell;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

}
