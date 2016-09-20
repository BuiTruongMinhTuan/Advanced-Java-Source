
package Exercise2_JDBC;

/*
 * @author Bui Truong Minh Tuan
 * Date : 19/9/2016
 * Version : 1.0
 * 
 */
public class CD {
    int id;
    String name;
    String singer;
    int numbersongs;
    double price;

    public CD() {
    }

    public CD( String name, String singer, int numbersongs, double price) {
        
        this.name = name;
        this.singer = singer;
        this.numbersongs = numbersongs;
        this.price = price;
    }
    
    
    // show information of product
	public void show(){
		System.out.println("------------------------------");
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Singer: " + singer);
		System.out.println("Number songs: " + numbersongs);
        System.out.println("Price: " + price);
		System.out.println("------------------------------");
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getNumbersongs() {
        return numbersongs;
    }

    public void setNumbersongs(int numbersongs) {
        this.numbersongs = numbersongs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}

