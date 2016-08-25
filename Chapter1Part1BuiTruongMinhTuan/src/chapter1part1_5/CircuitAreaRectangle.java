
package chapter1part1_5;



/**
 *
 * @author BTMT
 * @Date 19/08/2016
 * @version 1.0
 */
public class CircuitAreaRectangle {

    Pointer pointerA;
    Pointer pointerB;
    double circuit;
    double area;

    public CircuitAreaRectangle() {
    }
    
   
    public CircuitAreaRectangle(int pointAx, int pointAy, int pointBx, int pointBy) {
        pointerA = new Pointer(pointAx, pointAy);
        pointerB = new Pointer(pointBx, pointBy);
    }

    double leght;
    double wide;

    public double calcuCircuit() {
        wide = pointerB.pointX - pointerA.pointX;
        leght = pointerB.pointY - pointerA.pointY;
        circuit = (wide + leght) * 2;
        if (circuit < 0) {
            circuit = -circuit;
        }
        return circuit;
    }

    public double calcuArea() {
        area = wide * leght;
        if (area < 0) {
            area = -area;
        }
        return area;
    }

    public Pointer getPointerA() {
        return pointerA;
    }

    public void setPointerA(Pointer pointerA) {
        this.pointerA = pointerA;
    }

    public Pointer getPointerB() {
        return pointerB;
    }

    public void setPointerB(Pointer pointerB) {
        this.pointerB = pointerB;
    }
    
}
