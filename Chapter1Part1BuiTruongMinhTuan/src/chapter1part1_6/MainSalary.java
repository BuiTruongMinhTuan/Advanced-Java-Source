
package chapter1part1_6;

import java.io.IOException;

/**
 *
 * @author BTMT
 * @Date 19/08/2016
 * @version 1.0
 */
public class MainSalary {

    public static void main(String[] args) throws IOException {
        try {
            StaffSalary SS = new StaffSalary();
            SS.inputInformationStaff();
            SS.computeSalary();
            SS.outputInformationStaff();
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
