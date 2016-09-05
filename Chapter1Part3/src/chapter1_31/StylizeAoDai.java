package chapter1_31;


/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class StylizeAoDai extends AoDai {

	public StylizeAoDai(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	//to sew Stylized AoDai.
	public void sew(){
		System.out.println("Sew Stylize AoDai");
	}

}