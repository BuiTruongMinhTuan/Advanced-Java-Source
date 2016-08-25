
package chapter1part1_13;

import java.io.IOException;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class MainManagerEmployee {
    public static void main(String[] args) throws IOException {
        try {
            ManagerEmployee ME = new ManagerEmployee();
            ME.manager();

        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
