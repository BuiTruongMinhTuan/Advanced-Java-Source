
package chapter9_2;

/*
 * @author Bui Truong Minh Tuan
 * Date : 13/9/2016
 * Version : 1.0
 * 
 */
public class CD implements Comparable<CD> {

    
    //constructor CD 5 parameter
    public CD(String id, String name, String singer, int numOfSongs, double price) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.numOfSongs = numOfSongs;
        this.price = price;
    }
    //constructor CD non parameter
    public CD() {
    }
    public String id;
    public String name;
    public String singer;
    public int numOfSongs;
    public double price;
    
    //compare by name
    @Override
    public int compareTo(CD o) {
        return (this.name).compareTo(o.name);
    }
    
    //output infomation
    @Override
    public String toString() {
        return "id: " + this.id + "\nname: " + this.name + "\nsinger: " + this.singer + "\n"
                + "number of song: "
                + this.numOfSongs + "\nprice: " + this.price;
    }
    
    //get and set 
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
