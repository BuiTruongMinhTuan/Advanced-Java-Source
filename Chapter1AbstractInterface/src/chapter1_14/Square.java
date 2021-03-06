
package chapter1_14;

/**
 *
 * @author Bui Truong Minh Tuan
 * @Date 23/08/2016
 * @version 1.0
 */
public class Square extends Shape {

    public double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double perimeter() {
        return 4 * width;
    }

    @Override
    double area() {
        return width * width;
    }
    
    

}
