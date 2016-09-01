
package chapter1_30;

/**
 *
 * @author Bui Truong Minh Tuan
 * @Date 01/09/2016
 * @version 1.0
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType== null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
