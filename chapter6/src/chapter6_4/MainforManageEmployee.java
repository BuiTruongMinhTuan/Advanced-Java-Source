package chapter6_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * @author Bui Truong Minh Tuan
 * Date : 14/9/2016
 * Version : 1.0
 * 
 */
public class MainforManageEmployee {

    //to run program
    public static void main(String[] args) {
        int choose = -1;
        int change = 0;
        String path = "src/chapter6_4/employee.txt";
        EmployeeManager manager = new EmployeeManager();

        try {
            manager.readFiletoList(path);
            while (choose != 0) {
                choose = menuMain();
                switch (choose) {

                    case 1: //print employee list.

                        manager.printList();
                        break;
                    case 2: //search a employee by name

                        manager.search();
                        break;
                    case 3: //add new student to list.

                        change = 1;
                        manager.addEmployee();
                        break;
                    case 4: //write override from list to file when quit program 

                        if (change == 1) {
                            manager.writeListtoFile(path);
                        }
                        choose = 0;
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    //user choice menu
    private static int menuMain() throws IOException {
        @SuppressWarnings("resource")
        BufferedReader input = new BufferedReader(new InputStreamReader(
                System.in));
        int choose = -1;
        while (choose < 1 || choose > 4) {
            System.out.println("----Employee Management----");
            System.out.println("Choice 1 to 4");
            System.out.println("1. Show employee list");
            System.out.println("2. Search a employee by name");
            System.out.println("3. Add new employee");
            System.out.println("4. Quit");
            System.out.println("Enter a chosen: ");
            try{
            choose = Integer.parseInt(input.readLine());
            }catch(NumberFormatException e){
                System.err.println(e.toString());
                continue;
            }
        }
        return choose;
    }

}
