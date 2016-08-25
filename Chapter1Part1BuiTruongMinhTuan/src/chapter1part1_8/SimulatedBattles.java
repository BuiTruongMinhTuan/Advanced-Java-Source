
package chapter1part1_8;

import chapter1part1_8.Infantryman;
import chapter1part1_8.Trooper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author BTMT
 * @Date 22/08/2016
 * @version 1.0
 */
public class SimulatedBattles {

    Infantryman infantryman;
    Trooper trooper;

    public SimulatedBattles() {
        infantryman = new Infantryman();
        trooper = new Trooper();
    }
    
    //fight the battles
    public void battles() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("input infomation Infantryman: ");
        infantryman.inputInfoSoldier();
        System.out.println("==================");
        System.out.println("input infomation Trooper: ");
        trooper.inputInfoSoldier();
        int chosenFight = 0;

        boolean check = true;
        while (check) {
            try {
                System.out.println("Do you want Infantryman fight Trooper chosen(1) else (2):");
                chosenFight = Integer.parseInt(input.readLine());

            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            System.out.println(chosenFight);
            if (chosenFight != 1 && chosenFight != 2) {
                System.out.println("only Chosen 1 or 2 please try agian!");
                continue;
            }
            if (chosenFight == 1) {
                trooper.fight();
            } else {
                infantryman.fight();
            }
            System.out.println("Power of Infantryman:" + infantryman.getPower());
            System.out.println("Power of Trooper:" + trooper.getPower());
            if (trooper.getPower() <= 0 || infantryman.getPower() <= 0) {
                check = false;
            }
            chosenFight = 0;
            System.out.println("==================");
        }

        if (trooper.getPower() > 0) {
            System.out.println("Trooper is winner");
        } else {
            System.out.println("Infantryman is winner");
        }

    }
}
