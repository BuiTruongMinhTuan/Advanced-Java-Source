
package chapter1part1_12;

import java.io.IOException;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class MainManagerBook {

    public static void main(String[] args) throws IOException {
        // 
        try {
            ManagerBook MB = new ManagerBook();
            MB.manager();

        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
