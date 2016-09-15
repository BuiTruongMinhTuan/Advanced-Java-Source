package chapter6_1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * @author Bui Truong Minh Tuan
 * Date : 14/9/2016
 * Version : 1.0
 * 
 */
public class Diary {

    //input from user
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    //to run program
    public static void main(String[] args) throws IOException {
        boolean check = true;
        int choose = 0;
        while (check) {
            try {
                System.out.println("Do you want Read(1)/ Write(2)/ Exit(3)");
                choose = Integer.parseInt(input.readLine());
                //read file
                if (choose == 1) {
                    System.out.println("" + readFile());
                    continue;
                
                } 
                //write file
                else if (choose == 2) {
                    writeFlie();
                    continue;
                } 
                //exit program
                else if (choose == 3) {
                    System.out.println("Goodbye!!!");
                    check = false;
                    break;
                } else {
                    System.err.println("Please input 1 to  3");
                    continue;
                }
            } catch (Exception e) {
                System.err.println(e.toString());
                continue;
            }
        }

    }
    
    //read file from txt
    static String readFile() throws IOException {
        String diaryTxt = "";
        String Date;
        String Data = "";
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/chapter6_1/daily.txt")))) {
            while (true) {
                //read date
                Date = in.readUTF();
                //read date
                Data = in.readUTF();
                //add date, date to string
                diaryTxt += Date + "\n" + Data + "\n\n";

            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return diaryTxt;
    }

    //write file to txt    
    static void writeFlie() throws IOException {
        //get time from system
        Date today = new Date(System.currentTimeMillis());
        //get fomat date time
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
        String date = timeFormat.format(today.getTime());

        String data = "";
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/chapter6_1/daily.txt", true)))) {
            System.out.println("write any!!!");
            System.out.println("Diary " + date + ":");
            data = input.readLine();
            //write date to file
            out.writeUTF(date);
            //write data to file
            out.writeUTF(data);
            out.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
