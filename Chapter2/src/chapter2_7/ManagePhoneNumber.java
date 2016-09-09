package chapter2_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * @author Bui Truong Minh Tuan
 * Date : 9/9/2016
 * Version : 1.0
 * 
 */
public class ManagePhoneNumber {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public void menuPhone() throws IOException {
        try {
            String check = "y";
            ArrayList<PhoneNumber> listPhoneNumber = new ArrayList<>();
            listPhoneNumber.add(new PhoneNumber("GO", "0969696969"));
            while (check.equals("y")) {
                System.out.println("---------- Menu ----------");
                System.out.println("Choice 1 to 5");
                System.out.println(" 1: View all PhoneNumber");
                System.out.println(" 2: Add new PhoneNumber");
                System.out.println(" 3: Search PhoneNumber");
                System.out.println(" 4: Remove PhoneNumber");
                System.out.println(" 5: Update PhoneNumber");
                System.out.println("----------------------------");
                int choiceMenu = Integer.parseInt(input.readLine());

                switch (choiceMenu) {
                    case 1: {
                        System.out.println("----- Contacts detail ------");
                        if (!listPhoneNumber.isEmpty()) {
                            for (PhoneNumber c : listPhoneNumber) {
                                c.show();
                            }
                        } else {
                            System.out.println("List PhoneNumber is empty!");
                        }
                        System.out
                                .println("------------------------------");
                    }
                    break;
                    case 2: {
                        System.out
                                .println("----------- Add new Contacts ---------");
                        System.out.print("Input name: ");
                        String name = input.readLine();
                        System.out.print("Input phone: ");
                        String phone = input.readLine();
                        listPhoneNumber.add(new PhoneNumber(name, phone));

                        System.out.println("Add PhoneNumber completed!");
                        System.out.println("------------------------------------");
                    }
                    break;
                    case 3: {
                        System.out
                                .println("-----------Search PhoneNumber ----------");
                        System.out.println("Press 1: Search name");
                        System.out.println("Press 2: Search phone: ");
                        int choice = Integer.parseInt(input.readLine());
                        switch (choice) {
                            case 1: {
                                System.out.print("Input name to search: ");
                                String name = input.readLine();
                                int checkSearch = 0;
                                for (PhoneNumber c : listPhoneNumber) {
                                    if (c.getName().equals(name)) {
                                        c.show();
                                        checkSearch = 1;
                                    }
                                }
                                if (checkSearch == 0) {
                                    System.out
                                            .println("Name is not exists in contact!");
                                }
                            }
                            break;
                            case 2: {
                                System.out.print("Input phone to search: ");
                                String phone = input.readLine();
                                int checkSearch = 0;
                                for (PhoneNumber c : listPhoneNumber) {
                                    if (c.getPhone().equals(phone)) {
                                        c.show();
                                        checkSearch = 1;
                                    }
                                }
                                if (checkSearch == 0) {
                                    System.out
                                            .println("Phone is not exists in contact!");
                                }
                            }
                            break;

                            default:
                                System.out.println("Choice is not valid!");
                                break;
                        }
                        System.out.println("------------------------------------");
                    }
                    break;
                    case 4: {
                        System.out.println("------------ Remove Contacts ------------");
                        System.out.println("Press 1: Remove cause name");
                        System.out.println("Press 2: Remove cause phone");
                        int choice = Integer.parseInt(input.readLine());
                        deleteContact(choice, listPhoneNumber);
                    }
                    break;
                    case 5: {
                        System.out.println("--------- Update PhoneNumber ---------");
                        System.out.print("Input name to update: ");
                        String name = input.readLine();
                        System.out.print("Input phone number update: ");
                        String phone = input.readLine();
                        for (PhoneNumber c : listPhoneNumber) {
                            if (c.getName().equals(name)) {
                                listPhoneNumber.set(listPhoneNumber.indexOf(c), new PhoneNumber(name, phone));

                            }
                        }
                    }
                    break;
                    default:
                        throw new ArithmeticException("Choice value is not valid!");
                }
                System.out.println("Do you want continue back to menu ? (y/n)");
                check = checkContinue();
            }
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    void deleteContact(int choice, ArrayList<PhoneNumber> listPhoneNumber) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<PhoneNumber> temp = new ArrayList<>();
        switch (choice) {
            case 1: {
                System.out.print("Input name to remove: ");
                String name = input.readLine();
                String checkRemove = "n";
                for (PhoneNumber c : listPhoneNumber) {
                    if (c.getName().equals(name)) {
                        temp.add(c);
                    }
                }
                for (PhoneNumber c : temp) {
                    c.show();
                }
                System.out
                        .println("Do you want remove this PhoneNumber? (y/n)");
                checkRemove = checkContinue();
                if (checkRemove.equals("y")) {
                    listPhoneNumber.removeAll(temp);
                    System.out.println("Remove PhoneNumber completed!");

                }
            }
            break;
            case 2: {
                System.out.print("Input phone to remove: ");
                String phone = input.readLine();
                String checkRemove = "n";
                for (PhoneNumber c : listPhoneNumber) {
                    if (c.getPhone().equals(phone)) {
                        temp.add(c);
                    }
                }
                for (PhoneNumber c : temp) {
                    c.show();
                }
                System.out
                        .println("Do you want remove this contact? (y/n)");
                checkRemove = checkContinue();
                if (checkRemove.equals("y")) {
                    listPhoneNumber.removeAll(temp);
                    System.out.println("Remove PhoneNumber completed!");

                }
            }
            break;
            default:
                System.out.println("Choice is not valid!");
                break;
        }
    }

    public String checkContinue() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(
                System.in));
        String check = input.readLine().toLowerCase();
        if (!check.equals("y") && !check.equals("n")) {
            throw new ArithmeticException("The choice is not valid!");
        }
        return check;
    }
}
