package chapter1_31;


/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class StylizeFactory extends Factory {

	public StylizeFactory(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	//to return a Stylized AoDai.
	public AoDai chooseFactory(){
		return new StylizeAoDai();
	}

}