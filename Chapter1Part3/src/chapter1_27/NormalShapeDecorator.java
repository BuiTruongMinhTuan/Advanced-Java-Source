package chapter1_27;
/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class NormalShapeDecorator extends ShapeDecorator{

	public NormalShapeDecorator(IShape iShape) {
		super(iShape);
		
	}
	//to draw a shape with normal border.
	@Override
	public String draw() {
		
		return this.iShape.draw() + " and " +setNormalBorder(iShape);
	}
	//to set normal border.
	private String setNormalBorder(IShape iShape) {
		
		return "with normal border.";
	}
}
