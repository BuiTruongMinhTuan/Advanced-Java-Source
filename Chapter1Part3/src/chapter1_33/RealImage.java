package chapter1_33;

/**
 *
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class RealImage implements Image{
    private String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying "+ fileName);
    }
    private void loadFromDisk(String fileName){
        System.out.println("Loading "+ fileName);
    }
}
