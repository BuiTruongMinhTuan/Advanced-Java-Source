
package chapter1part1_7;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class ClassCD {

    String iD;
    String nameCD;
    String nameSinger;
    int numOfSong;
    float price;

    public ClassCD() {
    }

    public ClassCD(String iD, String nameCD, String nameSinger, int numOfSong, float price) {
        this.iD = iD;
        this.nameCD = nameCD;
        this.nameSinger = nameSinger;
        this.numOfSong = numOfSong;
        this.price = price;
    }

    public void outputInfoCD() {
        System.out.println("ID: " + iD);
        System.out.println("Name: " + nameCD);
        System.out.println("Singer: " + nameSinger);
        System.out.println("The number of Songs is in CD: " + numOfSong);
        System.out.println("Price: " + price);
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public void setNameCD(String nameCD) {
        this.nameCD = nameCD;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public void setNumOfSong(int numOfSong) {
        this.numOfSong = numOfSong;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getiD() {
        return iD;
    }

    public String getNameCD() {
        return nameCD;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public int getNumOfSong() {
        return numOfSong;
    }

    public float getPrice() {
        return price;
    }

}
