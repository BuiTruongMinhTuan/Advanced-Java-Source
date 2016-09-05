package chapter1_31;


/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class TraditionalFactory extends Factory {

	public TraditionalFactory(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	//to return a Traditional AoDai.
	public AoDai chooseFactory(){
		return new TraditionalAoDai();
	}

}