
package chapter6_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
 * @author Bui Truong Minh Tuan
 * Date : 14/9/2016
 * Version : 1.0
 * 
 */
public class Document {
    //word with key-value
    public HashMap<String, Integer> words;
    //input from user
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    public Document() {
        this.words = new HashMap<String, Integer>();
    }
    public String readFile() throws IOException{
        String dataTxt="";
        
        String Data="";
        try(DataInputStream in = new DataInputStream(new BufferedInputStream (new FileInputStream("src/chapter6_2/document.txt")))){
            while (true) {                
                //read data from file
                Data=in.readUTF();
                //add data to String
                dataTxt+=Data+"\n";
                
            }
            
        }catch( IOException  e){
            System.out.println(e.toString());
        }
        return dataTxt;
    }
    
    // write data to file
    public void writeFlie(String dataTxt ) throws IOException{
     
        String data="";
        try(DataOutputStream out=new DataOutputStream(new  BufferedOutputStream(new FileOutputStream("src/chapter6_2/document.txt")))){
            System.out.println("write any!!!");
            
            data=input.readLine();
            dataTxt+=data;
            //write date
            out.writeUTF(dataTxt);
            out.close();
        }catch(IOException e){
            System.out.println(e.toString());
        }
    }
    //carve string to token
    public void tokenize(String document) {
        //Split sentence;
        StringTokenizer multiTokenizer = new StringTokenizer(document);
        while (multiTokenizer.hasMoreTokens()) {
            //word as key in hasmap
            String word = multiTokenizer.nextToken();
            if (this.words.containsKey(word)) {
                int oldValue = this.words.get(word);
                //add value if word exist
                this.words.replace(word, oldValue + 1);
            } else {
                //add new word
                this.words.put(word, 1);
            }
        }
    }

    //show word after carve
    public void showInfo() {
        System.out.println("== Tokens in document ==");
        for (Object object : words.keySet()) {
            //get key in hashmap
            System.out.print("["+object+"]");
            //get value in hashmap
            System.out.println(" Have "+this.words.get(object));
        }
    }
}
