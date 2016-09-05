package chapter1_31;


/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class TraditionalAoDai extends AoDai {

	public TraditionalAoDai(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	//to sew a traditional frock.
	public void sew(){
		System.out.println("Sew traditional AoDai");
	}

}