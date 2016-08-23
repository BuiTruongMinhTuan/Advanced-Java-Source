package chapter1_17;

/**
 *
 * @author Bui Truong Minh Tuan
 * @Date 23/08/2016
 * @version 1.0
 */
public class Boa extends Animal implements IMove, IGrow, IResidence {

	public Boa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boa(String name, String mainFood) {
		super(name, mainFood);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getResidence() {
		// TODO Auto-generated method stub
		return "cave, tree, walter";
	}

	@Override
	public String getGrow() {
		// TODO Auto-generated method stub
		return "molt";
	}

	@Override
	public String getMove() {
		// TODO Auto-generated method stub
		return "crawl, swim";
	}
}
