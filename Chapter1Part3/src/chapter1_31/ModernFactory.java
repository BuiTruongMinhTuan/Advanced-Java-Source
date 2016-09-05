package chapter1_31;


/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class ModernFactory extends Factory {

	public ModernFactory(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	//to return a modern frock.
	public AoDai chooseFactory(){
		return new ModernAoDai();
	}

}