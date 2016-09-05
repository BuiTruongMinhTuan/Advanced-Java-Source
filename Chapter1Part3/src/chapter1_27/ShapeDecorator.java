package chapter1_27;
/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public abstract class ShapeDecorator implements IShape{
	protected IShape iShape;

	public ShapeDecorator(IShape iShape) {
		super();
		this.iShape = iShape;
	}

	public IShape getiShape() {
		return iShape;
	}

	public void setiShape(IShape iShape) {
		this.iShape = iShape;
	}
	//to draw a shape.
	@Override
	public String draw() {
	
		return iShape.draw();
	}
}
