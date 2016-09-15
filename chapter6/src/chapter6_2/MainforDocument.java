package chapter6_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
 * @author Bui Truong Minh Tuan
 * Date : 14/9/2016
 * Version : 1.0
 * 
 */
public class MainforDocument {

    //to run program
    public static void main(String[] args) throws IOException {
        //input from user
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        boolean check = true;
        int choose = 0;
        Document document = new Document();
        String txt = document.readFile();
        while (check) {
            try {
                System.out.println("Do you want Read(1)/ Write(2)/ Find(3)/ Exit(4)");
                choose = Integer.parseInt(input.readLine());
                //read date from file
                if (choose == 1) {
                    txt = document.readFile();
                    document.words = new HashMap<String, Integer>();
                    document.tokenize(txt);
                    document.showInfo();
                    continue;

                }
                //write date to file 
                else if (choose == 2) {
                    document.writeFlie(txt);
                    continue;
                }
                //find word in data
                else if (choose == 3) {
                    System.out.println("input find word:");
                    String find = input.readLine();
                    if (document.words.containsKey(find)) {
                        System.out.println("have "+document.words.get(find)+" [" + find + "] in words");
                    } else {
                        System.out.println(" dont have " + find + " in words");
                    }
                }
                //exit program
                else if (choose == 4) {
                    System.out.println("Goodbye!!!");
                    check = false;
                    break;
                } else {
                    System.err.println("Please input 1 to 4");
                    continue;
                }
            } catch (Exception e) {
                System.err.println(e.toString());
                continue;
            }
        }
    }
}
