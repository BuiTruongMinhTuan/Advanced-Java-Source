
package chapter1_14;

/**
 *
 * @author Bui Truong Minh Tuan
 * @Date 23/08/2016
 * @version 1.0
 */
public class Rectangle extends Shape {

    public double width;
    public double leght;

    @Override
    double perimeter() {
        return 2 * (width + leght);
    }

    @Override
    double area() {
        return width * leght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLeght() {
        return leght;
    }

    public void setLeght(double leght) {
        this.leght = leght;
    }
    
}
