
package chapter1_33;

/**
 *
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;
    
    public ProxyImage(String fileName){
        this.fileName= fileName;
    }    
    @Override
    public void display() {
       if(realImage == null){
           realImage = new RealImage(fileName);
       }
       realImage.display();
    }
    
}
