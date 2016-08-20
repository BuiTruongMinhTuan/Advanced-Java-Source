/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1buitruongminhtuan;

/**
 *
 * @author BTMT
 * @Date 19/08/2016
 */
public class CircuitAreaCircle {
    DistanceOfTwoPoints DoT;
    double circuit;
    double area;
    
    public CircuitAreaCircle(int aX,int aY,int bX, int bY) {
        DoT=new DistanceOfTwoPoints(aX, aY, bX, bY);
        circuit=0;
        area=0;
    }
    
    //calculator Circuit
    double radius;
    double pi=22/7;
    public double calcuCircuit(){
        radius =DoT.calculatorDistance();
        circuit=radius*2*pi;
        return circuit;
    }
    
     //calculator area
    public double calcuArea(){
        
        area=radius*radius*pi;
        return area;
    }
    
}
