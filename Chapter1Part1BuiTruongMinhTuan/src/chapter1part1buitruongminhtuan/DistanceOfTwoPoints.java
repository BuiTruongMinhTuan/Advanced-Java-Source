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
public class DistanceOfTwoPoints {

    double distance;
    Pointer pointerA;
    Pointer pointerB;

    public DistanceOfTwoPoints() {
        distance = 0;
    }

    public DistanceOfTwoPoints(int pointAx, int pointAy, int pointBx, int pointBy) {
        pointerA = new Pointer(pointAx, pointAy);
        pointerB = new Pointer(pointBx, pointBy);
        
    }

    //calculator distance between pointA and pointB
    public double calculatorDistance() {
        distance = (pointerA.pointX - pointerB.pointX) * (pointerA.pointX - pointerB.pointX) + 
                    (pointerA.pointY - pointerB.pointY) * (pointerA.pointY - pointerB.pointY);
        distance = Math.sqrt(distance);
        return distance;
    }
}