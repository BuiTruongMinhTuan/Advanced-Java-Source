package chapter1_27;
/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(IShape iShape) {
		super(iShape);
		
	}
	//to draw a shape with red border.
	@Override
	public String draw() {
		
		return this.iShape.draw() + " and " +setRedBorder(iShape);
	}
	//to set red border.
	private String setRedBorder(IShape iShape) {
	
		return "Border Color: Red.";
	}
}
