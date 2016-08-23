package chapter1_17;

/**
 *
 * @author Bui Truong Minh Tuan
 * @Date 23/08/2016
 * @version 1.0
 */
public class Tiger extends Animal implements IMove, IGrow, IResidence {

	public Tiger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tiger(String name, String mainFood) {
		super(name, mainFood);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getResidence() {
		// TODO Auto-generated method stub
		return "cave, forest";
	}

	@Override
	public String getGrow() {
		// TODO Auto-generated method stub
		return "grow";
	}

	@Override
	public String getMove() {
		// TODO Auto-generated method stub
		return "run, swim, climb";
	}
}
