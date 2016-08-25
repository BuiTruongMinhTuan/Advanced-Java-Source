
package chapter1part1_9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author BTMT
 * @Date 22/08/2016
 * @version 1.0
 */
public class ManagerListComputer {

    ArrayList<Laptop> listLaptop;
    ArrayList<Desktop> listDesktop;
    Desktop desktop;
    Laptop laptop;

    public ManagerListComputer() {
        listDesktop = new ArrayList<>();
        listLaptop = new ArrayList<>();

    }
    int chosen = 0;

    //Computers Managerment
    public void manager() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("== Computers Managerment Program ==");
        while (true) {
            try {
                boolean check = true;
                while (check) {
                    System.out.println("Choose kind computer Desktop(1)/ Laptop(2)");
                    chosen = Integer.parseInt(input.readLine());
                    if (chosen == 1) {
                        desktop = new Desktop();
                        desktop.inputInfo();
                        listDesktop.add(desktop);
                    } else if (chosen == 2) {
                        laptop = new Laptop();
                        laptop.inputInfo();
                        listLaptop.add(laptop);
                    }
                    if (chosen != 1 && chosen != 2) {
                        System.out.println("only Chosen 1 or 2 please try agian!");
                        continue;
                    }

                    check = false;
                }
                System.out.println("Just added your computer into to the Collection");
                System.out.print("Do you want to add computer into to Collection (y/n) continue? ");
                String answer = input.readLine();
                if (answer.equalsIgnoreCase("y")) {
                    System.out.println("-----------------");
                    continue;
                }
                System.out.println("-----------------");
                double Amount = 0;
                for (Desktop des : listDesktop) {
                    System.out.println("Information of Computer kind Desktop: ");
                    Amount += des.computeAmount();
                    des.outputInfo();
                    System.out.println("*****");
                }
                System.out.println("-----------------");
                for (Laptop lap : listLaptop) {
                    System.out.println("Information of Computer kind Laptop: ");
                    Amount += lap.computeAmount();
                    lap.outputInfo();
                    System.out.println("*****");
                }
                System.out.println("-----------------");
                System.out.println("Total Amount: " + String.format("%.1f", Amount));
                System.exit(0);
            } catch (Exception ex) {
                System.out.println(ex.toString());
                continue;
            }

        }
    }

}
