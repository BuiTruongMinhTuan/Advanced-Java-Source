package chapter1_31;


/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class ModernAoDai extends AoDai {

	public ModernAoDai(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	//to sew a modern frock.
	public void sew(){
		System.out.println("Sew modern AoDai");
	}

}