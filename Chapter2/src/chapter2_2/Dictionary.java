package chapter2_2;

/*
 * @author Bui Truong Minh Tuan
 * Date : 7/9/2016
 * Version : 1.0
 * 
 */
import java.util.TreeMap;



public class Dictionary {

	TreeMap tree;
	
	public Dictionary() {
		super();
	}

	public Dictionary(TreeMap tree) {
		super();
		this.tree = tree;
		
	}

	public TreeMap getTree() {
		return tree;
	}

	public void setTree(TreeMap tree) {
		this.tree = tree;
	}

	/*
	 * Add new item into Dictoinary
	 */
	public void addNewItem(String key, String value){
		tree.put(key, value);
	}
	
	/*
	 * Return value by key
	 */
	public String getValue(String key){
		
		String result = "";
		if(tree.containsKey(key) == false)
			result = "No have word";
		else
			result = (String) tree.get(key);
		return result;
	}
	
	/*
	 * Remove value by key in dictionary
	 */
	public void removeValue(String key){
		tree.remove(key);
	}
	
	/*
	 * Display all item in dictionary
	 */
	public void displayAllItem(){
		for(Object key : tree.keySet()){
			System.out.println(key + " meaning: " + tree.get(key));
		}
	}
	
	/*
	 * Check duplicate in dictionary
	 */
	public boolean checkDuplicate(String key){
		
		return tree.containsKey(key);
	}
}
