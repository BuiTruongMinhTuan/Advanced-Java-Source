/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1buitruongminhtuan;

/**
 *
 * @author long
 */
public class Chapter1Part1BuiTruongMinhTuan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            LinearEquation LE = new LinearEquation(12, 2);
            String root = LE.findRoot();
            System.out.println("Result of superlative equation: " + root);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }

    }

}
