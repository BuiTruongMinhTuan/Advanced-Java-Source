package chapter1_31;

/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class FactoryPattern {

	public FactoryPattern() {

	}

	public void finalize() throws Throwable {

	}

	
	public Factory getFactory(int type) {
		switch (type) {
		case 1:
			return new TraditionalFactory();
		case 2:
			return new StylizeFactory();
		case 3:
			return new ModernFactory();
		default:
			return null;
		}
	}

}