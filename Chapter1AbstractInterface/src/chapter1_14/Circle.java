
package chapter1_14;

/**
 *
 * @author Bui Truong Minh Tuan
 * @Date 23/08/2016
 * @version 1.0
 */
public class Circle extends Shape {

    public double radian;

    public double getRadian() {
        return radian;
    }

    public void setRadian(double radian) {
        this.radian = radian;
    }

    @Override
    double perimeter() {

        return 2 * Math.PI * radian;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radian, 2);
    }

}
