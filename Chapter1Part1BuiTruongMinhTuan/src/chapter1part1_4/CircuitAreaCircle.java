
package chapter1part1_4;

import chapter1part1_3.DistanceOfTwoPoints;

/**
 *
 * @author BTMT
 * @Date 19/08/2016
 * @version 1.0
 */
public class CircuitAreaCircle {
    DistanceOfTwoPoints DoT;
    double circuit;
    double area;

    public CircuitAreaCircle() {
    }
    public CircuitAreaCircle(Pointer pointer1, Pointer pointer2) {
        DoT=new DistanceOfTwoPoints(pointer1.pointX, pointer1.pointY, pointer2.pointX, pointer2.pointY);
    }
    
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
