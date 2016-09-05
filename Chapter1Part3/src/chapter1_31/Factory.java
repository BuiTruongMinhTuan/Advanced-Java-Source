package chapter1_31;


/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public abstract class Factory {

	public Factory(){

	}

	public void finalize() throws Throwable {

	}
	
	public abstract AoDai chooseFactory();

}