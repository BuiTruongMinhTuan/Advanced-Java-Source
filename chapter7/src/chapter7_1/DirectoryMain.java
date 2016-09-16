package chapter7_1;

/*
 * @author Bui Truong Minh Tuan
 * Date : 16/9/2016
 * Version : 1.0
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DirectoryMain {

    //to run program
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            TelephoneDirectory directory = new TelephoneDirectory();
            directory.loadContact();

            while (true) {
                System.out.println("------------------------------------");
                System.out.println("Please choice 1 to 6");
                System.out.println("1. Show all contact");
                System.out.println("2. Search contact");
                System.out.println("3. Add new contact");
                System.out.println("4. Remove contact");
                System.out.println("5. Update contact");
                System.out.println("6. Exit");
                System.out.println("------------------------------------");
                int ans = 0;
                while (true) {
                    System.out.print("Choose: ");
                    try {
                        ans = Integer.parseInt(input.readLine());
                    } catch (NumberFormatException e) {
                        System.err.println(e.toString());
                        continue;
                    }
                    if (ans >= 1 && ans <= 6) {
                        break;
                    }
                    System.out.print("Only choice 1 to 6");
                }
                switch (ans) {
                    case 1://Show all contact
                        System.out.println("----Show all contact----");
                        directory.showAllContact();
                        break;
                    case 2://Search contact by name

                        System.out.print("Input name: ");
                        String name = input.readLine();
                        System.out.println("----List of contacts----");
                        directory.searchContact(name);
                        break;
                    case 3:// add new contact 
                        System.out.println("----Add new contact----");

                        System.out.print("Name: ");
                        name = input.readLine();
                        System.out.print("Phone Number: ");
                        String numberPhone = input.readLine();
                        directory.addContact(numberPhone, name);
                        break;
                    case 4://remove contact
                        System.out.println("----Remove contact----");
                        int ans2 = 0;
                        while (true) {
                            System.out.println("1. Remove a contact regarding to name");
                            System.out.println("2. Remove a contact regarding to numberphone");
                            System.out.print("Choose: ");
                            try {
                                ans2 = Integer.parseInt(input.readLine());
                            } catch (NumberFormatException e) {
                                System.out.println(e.toString());
                                continue;
                            }
                            if (ans2 == 1 || ans2 == 2) {
                                break;
                            }
                        }
                        //remove by name    
                        if (ans2 == 1) {
                            System.out.print("Name: ");
                            String nameSearching = input.readLine();
                            directory.removeContactRegardingName(nameSearching);
                        }
                        //remove by phone number
                        if (ans2 == 2) {
                            System.out.print("Phone number: ");
                            String numberSearching = input.readLine();
                            directory.removeContactRegardingNumPhone(numberSearching);
                        }
                        break;
                    case 5://update contact
                        System.out.println("----Update contact----");
                        System.out.print("Name: ");
                        String updatedName = input.readLine();
                        directory.updateContact(updatedName);
                        break;
                    case 6://to exit program
                        directory.updateFileContact();
                        break;
                }
            if(ans==6)    
               break;
            }
        } catch (Exception ex) {
            System.out.println("Err: " + ex.getMessage());
        }
    }
}
