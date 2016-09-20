package Exercise2_JDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

/*
 * @author Bui Truong Minh Tuan
 * Date : 19/9/2016
 * Version : 1.0
 * 
 */
public class mainforManagerCD {

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        CDController cdController = new CDController();
        try {
            String check = "y";
            while (check.equals("y")) {
                System.out.println("----Manage CD----");
                System.out.println("Choice 1-6");
                System.out.println("1. Show all CD");
                System.out.println("2. Search CD");
                System.out.println("3. Add new CD");
                System.out.println("4. Remove CD");
                System.out.println("5. Update CD");
                System.out.println("6. Exit");
                int choice = 0;
                while (true) {
                    System.out.print("Choose: ");
                    try {
                        choice = Integer.parseInt(input.readLine());
                    } catch (NumberFormatException e) {
                        System.out.println(e.toString());
                        continue;
                    }
                    if (choice >= 1 && choice <= 6) {
                        break;
                    }
                    System.out.print("Only choice 1 to 6");
                }
                switch (choice) {
                    case 1://show all CD
                        System.out.println("----Show all CD----");
                        List<CD> listCD = cdController.getAllCD();
                        listCD.stream().forEach((cd) -> {
                            cd.show();
                        });
                        check = checkContinue();
                        break;
                    case 2://sreach by name CD
                        cdController.runSearch();
                        check = checkContinue();
                        break;
                    case 3://add new CD
                        cdController.addCD();
                        check = checkContinue();
                        break;
                    case 4://delete CD by ID
                        List<CD> lst = cdController.getAllCD();
                        System.out.println("----List product----");
                        lst.stream().forEach((product) -> {
                            product.show();
                        });
                        System.out.print("Choice ID CD to delete: ");
                        int id = Integer.parseInt(input.readLine());
                        cdController.deleteCD(id);
                        System.out.println("Delete completed!");
                        check = checkContinue();
                        break;
                    case 5://update CD by id
                        List<CD> lstCD = cdController.getAllCD();
                        System.out.println("----List product----");
                        for (CD cd : lstCD) {
                            cd.show();
                        }
                        System.out.print("Choice ID CD to update: ");
                        int idCD = Integer.parseInt(input.readLine());
                        System.out.print("Input number update: ");
                        int number = Integer.parseInt(input.readLine());
                        System.out.print("Input price update: ");
                        double price = Double.parseDouble(input.readLine());
                        CD cd = new CD();
                        for (int i = 0; i < lstCD.size(); i++) {
                            if (i == idCD - 1) {
                                cd = lstCD.get(i);
                            }
                        }
                        cd.setId(idCD);
                        cd.setNumbersongs(number);
                        cd.setPrice(price);
                        cdController.updateCD(cd);
                        System.out.println("Update completed!");

                        check = checkContinue();
                        break;
                    case 6://exit program
                        check = "n";

                        break;
                }
            }
            System.out.println("Good bye!");
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static String checkContinue() throws IOException {

        System.out.println("Do you want continue ? y/n");
        String check = input.readLine().toLowerCase();
        if (!check.equals("y") && !check.equals("n")) {
            throw new ArithmeticException("The choice is not valid!");
        }
        return check;
    }
}
