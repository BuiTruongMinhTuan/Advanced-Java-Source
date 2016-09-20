package Exercise2_TXT;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;


/*
 * @author Bui Truong Minh Tuan
 * Date : 19/9/2016
 * Version : 1.0
 * 
 */
public class MainforTXT {

    static DatabaseConnection db = new DatabaseConnection();

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

        List<CD> listCD = new ArrayList<CD>();
        //load CD from date to list
        loadDatabase(listCD);
        
        String path = "src/Exercise2_TXT/cd.txt";
        //write CD to TXT flie
        writeFile(path, listCD);
        //read CD from TXT file
        readFile(path, listCD);
        //show list
        print(listCD);
    }

    //Load CD from database
    public static void loadDatabase(List<CD> listCD)
            throws ClassNotFoundException, SQLException {
        try (Connection conn = db.connect()) {
            String sql = "SELECT * FROM cd";
            Statement statement = (Statement) conn.createStatement();
            ResultSet resultset = statement.executeQuery(sql);
            
            //add to list CD
            while (resultset.next()) {
                CD cd = new CD();

                cd.setId(resultset.getInt("id"));
                cd.setName(resultset.getString("name"));
                cd.setSinger(resultset.getString("singer"));
                cd.setNumbersongs(resultset.getInt("numbersongs"));
                cd.setPrice(resultset.getDouble("price"));

                listCD.add(cd);
            }
        }
    }

    //write to TXT file
    public static void writeFile(String path, List<CD> listCD) throws FileNotFoundException, IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
        for (CD cd : listCD) {
            out.writeObject(cd);
        }
        out.close();
    }
    
    //read from TXT file
    public static void readFile(String path, List<CD> listCD) {

        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)))) {
            listCD.clear();
            while (true) {
                CD cd = (CD) in.readObject();
                listCD.add(cd);
            }

        } catch (Exception e) {

        }
    }
    
    //check list empty and show
    public static void print(List<CD> listCD){
        System.out.println("----LIST CD From TXT----\n");
        if (listCD.isEmpty() == true) {
            System.out.println("List CD is empty!");
        } else {
            System.out.println("\tHave: "+listCD.size());
            for (CD cd : listCD) {
                cd.show();
                System.out.println();
            }
        }
    }
}
