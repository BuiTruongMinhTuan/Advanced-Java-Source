package chapter9_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.ResourceBundle;

/*
 * @author Bui Truong Minh Tuan
 * Date : 13/9/2016
 * Version : 1.0
 * 
 */
//manage CD by list
public class ManageCD {

    ArrayList<CD> listCD = new ArrayList<>();
    String name;
    //manage method
    public void ManageCD() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String language = "en";
        String country = "US";
        Locale currentLocal = new Locale(language, country);
        ResourceBundle message = null;
        int chooselg = 0;
        boolean sup = true;
        while (sup) {
            try {
                System.out.println("Please choose language (1)English (2)Vietnamese (3)Exit");
                chooselg = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.err.println("Please choose 1 or 2");
                continue;
            }
            if (chooselg == 1) {
                message = ResourceBundle.getBundle("chapter9_2/resource_en_US", currentLocal);
            } else if (chooselg == 2) {
                message = ResourceBundle.getBundle("chapter9_2/resource_vi_VN", currentLocal);
            }else if (chooselg == 3) {
                System.err.println("Good bye");
                
                break;
            }
            else {
                System.err.println("Please choose 1 or 2");
                continue;
            }
            sup = false;
        }

        boolean flag = true;
        while (flag) {
            System.out.println(message.getString("continue"));
            String choose = input.readLine();
            if (choose.equalsIgnoreCase("y")) {
                CD cd = new CD();
                System.out.println(message.getString("id"));
                cd.setId(input.readLine());
                System.out.println(message.getString("name"));
                cd.setName(input.readLine());
                System.out.println(message.getString("singer"));
                cd.setSinger(input.readLine());
                boolean check = true;
                while (check) {
                    try {
                        System.out.println(message.getString("number"));
                        cd.setNumOfSongs(Integer.parseInt(input.readLine()));
                    } catch (Exception e) {
                        System.err.println(message.getString("wrong"));
                        continue;
                    }
                    check = false;
                }
                check = true;
                while (check) {
                    try {
                        System.out.println(message.getString("price"));
                        cd.setPrice(Double.parseDouble(input.readLine()));
                    } catch (Exception e) {
                        System.err.println(message.getString("wrong"));
                        continue;
                    }
                    check = false;
                }
                listCD.add(cd);
                Collections.sort(listCD);
            } else {
                for (CD cd : listCD) {
                    System.out.println(cd.toString());
                    System.out.println("-----------------------------");
                }
                double sum = 0;
                for (CD cd : listCD) {
                    sum += cd.getPrice();
                }
                System.out.println(message.getString("sumprice")+" "+ + sum);
                flag = false;
            }
        }
    }

}
