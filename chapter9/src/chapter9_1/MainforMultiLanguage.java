package chapter9_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/*
 * @author Bui Truong Minh Tuan
 * Date : 13/9/2016
 * Version : 1.0
 * 
 */
public class MainforMultiLanguage {
    //to run program
    public static void main(String[] args) {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int choose = 0;
        boolean check = true;
        while (check) {
            try {
                System.out.println("Please choose language (1)English (2)Vietnamese (3)Exit");
                choose = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.err.println("Wrong format! Please input Integer");
                continue;
            }
            //choice English
            if (choose == 1) {
                String language = "en";
                String country = "US";
                Locale currentLocal = new Locale(language, country);
                //read file language
                ResourceBundle message;
                message = ResourceBundle.getBundle("chapter9_1/resource_en_US", currentLocal);
                //call choice language
                choiceLanguage(message);

            //choice Vietnamese
            } else if (choose == 2) {
                String language1 = "vi";
                String country1 = "VN";
                Locale currentLocal1 = new Locale(language1, country1);
                //read file language
                ResourceBundle message1;
                message1 = ResourceBundle.getBundle("chapter9_1/resource_vi_VN", currentLocal1);
                //call choice language
                choiceLanguage(message1);
            
            //exit program
            } else if (choose == 3) {
                System.err.println("Good bye");
                break;
            } else {
                System.err.println("Input wrong format!! Plesse choose 1 to 3");
                continue;
            }
        }
    }
    
    //print language after choice
    static void choiceLanguage(ResourceBundle message) {
        List<String> list = new ArrayList<>();
        Enumeration<String> keys = message.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = message.getString(key);
            list.add(value);
        }
        //output List
        for (Object object : list) {
                    System.out.println(" " + object);
                }
    }
    
}
