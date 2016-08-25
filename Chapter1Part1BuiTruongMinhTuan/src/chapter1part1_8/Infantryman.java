
package chapter1part1_8;

import chapter1part1_8.Soldier;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class Infantryman extends Soldier {

    @Override
    public int fight() {
        power -= 2;
        return power;
    }

}
