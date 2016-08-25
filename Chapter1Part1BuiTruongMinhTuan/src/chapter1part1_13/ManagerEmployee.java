
package chapter1part1_13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class ManagerEmployee {

    ArrayList<TradeEmployee> ListtTradeEmployees;
    ArrayList<ProductionEmployee> ListProductionEmployees;
    TradeEmployee tradeEmployee;
    ProductionEmployee productionEmployee;

    public ManagerEmployee() {
        ListtTradeEmployees = new ArrayList<>();
        ListProductionEmployees = new ArrayList<>();

    }

    int chosen = 0;

    //Manager Employee
    public void manager() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("==Employee Managerment Program ==");
        while (true) {
            try {
                boolean check = true;
                while (check) {
                    System.out.println("Choose kind Infomation TradeEmployee(1)/ ProductionEmployee(2)");
                    chosen = Integer.parseInt(input.readLine());
                    if (chosen == 1) {
                        tradeEmployee = new TradeEmployee();
                        tradeEmployee.inputInformationStaff();
                        tradeEmployee.computeSalary();
                        ListtTradeEmployees.add(tradeEmployee);
                    } else if (chosen == 2) {
                        productionEmployee = new ProductionEmployee();
                        productionEmployee.inputInformationStaff();
                        productionEmployee.computeSalary();
                        ListProductionEmployees.add(productionEmployee);
                    }
                    if (chosen != 1 && chosen != 2) {
                        System.out.println("only Chosen 1 or 2 please try agian!");
                        continue;
                    }

                    check = false;
                }
                System.out.println("Just added your Employee into to the Collection");
                System.out.print("Do you want to add Employee into to Collection (y/n) continue? ");
                String answer = input.readLine();
                if (answer.equalsIgnoreCase("y")) {
                    System.out.println("-----------------");
                    continue;
                }
                System.out.println("-----------------");
                System.out.println("Information of Trade Employee: ");
                for (TradeEmployee tradeEmployee: ListtTradeEmployees) {

                    tradeEmployee.outputInformationStaff();
                    System.out.println("*****");
                }
                System.out.println("-----------------");
                System.out.println("Information of Production Employee: ");
                for (ProductionEmployee productionEmployee : ListProductionEmployees) {

                    productionEmployee.outputInformationStaff();
                    System.out.println("*****");
                }

                System.exit(0);
            }catch (Exception ex) {
                System.out.println(ex.toString());
                continue;
            }
        }
    }
}
