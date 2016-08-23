package chapter1_16;

/**
 *
 * @author Bui Truong Minh Tuan
 * @Date 23/08/2016
 * @version 1.0
 */
public abstract class Transport extends Vehicle {

	public String id;
	public String owner;
	public String color;
	public String manufacturer;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Transport(double distance, double time, double numberLiterFuel,
			String id, String owner, String color, String manufacturer) {
		super(distance, time, numberLiterFuel);
		this.id = id;
		this.owner = owner;
		this.color = color;
		this.manufacturer = manufacturer;
	}

	public Transport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transport(double distance, double time, double numberLiterFuel) {
		super(distance, time, numberLiterFuel);
		// TODO Auto-generated constructor stub
	}
	
	//Show information of transport
	public void showInformationTransport() {
		System.out.println("ID: " + id);
		System.out.println("Owner: " + owner);
		System.out.println("Color: " + color);
		System.out.println("Manufacturer: " + manufacturer);
	}
}
