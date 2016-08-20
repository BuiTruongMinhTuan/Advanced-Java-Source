/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1buitruongminhtuan;

/**
 *
 * @author BTMT
 * @Date 18/08/2016
 */
public class LinearEquation {

    double aFactor;
    double bFactor;
    String xRoot = "";

    public double getaFactor() {
        return aFactor;
    }

    public void setaFactor(double aFactor) {
        this.aFactor = aFactor;
    }

    public double getbFactor() {
        return bFactor;
    }

    public void setbFactor(double bFactor) {
        this.bFactor = bFactor;
    }

    public LinearEquation(double aFactor, double bFactor) {
        this.aFactor = aFactor;
        this.bFactor = bFactor;
    }
    //find the root of linear equation
    public String findRoot() {
        if (aFactor == 0 && bFactor == 0) {
            xRoot = "Equations infinitely many solutions";

        } else if (aFactor == 0 ) {
            xRoot = "The equation has no solution";
        } else {
            double temp = -bFactor / aFactor;
            xRoot = Double.toString(temp).format("%.1f", temp);
        }
        return xRoot;
    }
}
