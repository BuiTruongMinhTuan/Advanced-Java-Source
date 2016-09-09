package chapter2_1;

/*
 * @author Bui Truong Minh Tuan
 * Date : 7/9/2016
 * Version : 1.0
 * 
 */
public class CD implements Comparable<CD>{

	String id;
	String name;
	String nameOfSinger;
	int quantityOfSing;
	double price;
	
	public CD() {
		super();
	}

	public CD(String id, String name, String nameOfSinger, int quantityOfSing,
			double price) {
		super();
		this.id = id;
		this.name = name;
		this.nameOfSinger = nameOfSinger;
		this.quantityOfSing = quantityOfSing;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameOfSinger() {
		return nameOfSinger;
	}

	public void setNameOfSinger(String nameOfSinger) {
		this.nameOfSinger = nameOfSinger;
	}

	public int getQuantityOfSing() {
		return quantityOfSing;
	}

	public void setQuantityOfSing(int quantityOfSing) {
		this.quantityOfSing = quantityOfSing;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/*
	 * Get information of CD
	 * Return result as a String type
	 */
	@Override
	public String toString() {
		return "CD [id=" + id + ", name=" + name + ", nameOfSinger="
				+ nameOfSinger + ", quantityOfSing=" + quantityOfSing
				+ ", price=" + price + "]";
	}

	/*
	 * Compare two CD by name of CD
	 */
	@Override
	public int compareTo(CD cd) {
		return this.name.compareTo(cd.name);
	}
	
	
}
