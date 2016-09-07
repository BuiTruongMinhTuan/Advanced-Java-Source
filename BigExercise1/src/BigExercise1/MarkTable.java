package BigExercise1;
import java.util.List;

/**
 * @author Bui Truong Minh Tuan
 * @created 06-Thg9-2016 11:32:05 CH
 * @version 1.0
 * 
 * Class about information mark table
 */
public class MarkTable {

	private List<DetailMark> list;

	public MarkTable(){

	}
	
	public MarkTable(List<DetailMark> list) {
		super();
		this.list = list;
	}
    
    
    //Add new detail mark table
	public void addDetailMark(DetailMark detail){
		list.add(detail);
	}
	public List<DetailMark> getList() {
		return list;
	}

	public void setList(List<DetailMark> list) {
		this.list = list;
	}

	
	
}