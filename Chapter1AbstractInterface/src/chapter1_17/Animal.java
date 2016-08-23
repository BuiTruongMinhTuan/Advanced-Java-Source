package chapter1_17;

/**
 *
 * @author Bui Truong Minh Tuan
 * @Date 23/08/2016
 * @version 1.0
 */
public abstract class Animal implements IMove, IGrow, IResidence {

	public String name;
	public String mainFood;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMainFood() {
		return mainFood;
	}

	public void setMainFood(String mainFood) {
		this.mainFood = mainFood;
	}

	public Animal(String name, String mainFood) {
		super();
		this.name = name;
		this.mainFood = mainFood;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Show information of animal
	public void showInformationAnimal() {
		System.out.println("Name: " + name);
		System.out.println("Main food: " + mainFood);
		System.out.println("Residence: " + getResidence());
		System.out.println("Grow: " + getGrow());
		System.out.println("Move: " + getMove());
	}
}
