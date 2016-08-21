/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1buitruongminhtuan;

import java.io.IOException;

/**
 *
 * @author BTMT
 * @Date 19/08/2016
 */
public class Chapter1Part1BuiTruongMinhTuan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //part1();
        //part1_2();
        //part1_3();
        //part1_4();
        //part1_5();
        //part1_6();
        part1_7();

    }

    //find the root of linear equation
    static void part1() {
        try {
            LinearEquation lE = new LinearEquation(12, 2);
            String root = lE.findRoot();
            System.out.println("Result of superlative equation: " + root);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }

    //calculate 2 numbers
    static void part1_2() {
        try {
            CalculateTwoNumbers cTN = new CalculateTwoNumbers(1, 2);
            double resutl = cTN.calculater(4);
            System.out.println("Result of superlative equation: " + resutl);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }

    //calculator distance between pointA and pointB
    static void part1_3() {
        try {
            DistanceOfTwoPoints doT = new DistanceOfTwoPoints(1, 3, 2, 4);
            double resutl = doT.calculatorDistance();
            System.out.println("Distance Of TwoPoints: " + String.format("%.2f", resutl));
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }

    //calculator  Circuit & Area of Circle
    static void part1_4() {
        try {
            CircuitAreaCircle ca = new CircuitAreaCircle(1, 1, 2, 4);
            double circuit = ca.calcuCircuit();
            System.out.println("Circuit Of Circle " + String.format("%.2f", circuit));
            double area = ca.calcuArea();
            System.out.println("Circuit Of Circle " + String.format("%.2f", area));
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
    
     //calculator  Circuit & Area of Rectangle
    static void part1_5() {
        try {
            CircuitAreaRectangle ca = new CircuitAreaRectangle(1, 1, 3, 3);
            double circuit = ca.calcuCircuit();
            System.out.println("Circuit of Rectangle " + String.format("%.1f", circuit));
            double area = ca.calcuArea();
            System.out.println("Area of Rectangle " + String.format("%.1f", area));
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
    
    static void part1_6() throws IOException {
        try {
            StaffSalary SS = new StaffSalary();
            SS.inputInformationStaff();
            SS.computeSalary();
            SS.outputInformationStaff();
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
    
    static void part1_7() throws IOException {
        try {
            ManagerCD MC = new ManagerCD();
            MC.inputCD();
            MC.computePriceOfAllCDs();
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
