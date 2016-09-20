package Exercise2_JDBC;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * @author Bui Truong Minh Tuan
 * Date : 19/9/2016
 * Version : 1.0
 * 
 */
public class CDController {

    // declare database connection 
    DatabaseConnection db = new DatabaseConnection();

    // add new CD to db
    public void addCD() throws IOException, ClassNotFoundException, SQLException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---- Add new CD ----");
        System.out.print("Name: ");
        String name = input.readLine();
        System.out.print("Singer: ");
        String singer = input.readLine();
        System.out.print("Number songs: ");
        int numbersongs = Integer.parseInt(input.readLine());
        System.out.print("Price: ");
        Double price = Double.parseDouble(input.readLine());
        try {
            CD cd = new CD(name, singer, numbersongs, price);
            CDController cDController = new CDController();
            cDController.addCD(cd);
            System.out.println("Add CD successed!");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    // execute add new CD
    public void addCD(CD cd) throws ClassNotFoundException, SQLException {
        try (Connection conn = db.connect()) {
            String sql = "INSERT INTO cd VALUES(NULL, '" + cd.getName() + "', '" + cd.getSinger() + "', '"
                    + cd.getNumbersongs() + "', '" + cd.getPrice() + "')";
            PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
            statement.execute();
        }
    }

    // search CD with parameter name of CD -> return list CD
    public List<CD> searchCD(String name) throws ClassNotFoundException, SQLException {
        List<CD> listCD;
        try (Connection conn = db.connect()) {
            listCD = new ArrayList<>();
            Statement statement = (Statement) conn.createStatement();
            String sql = "SELECT * FROM cd WHERE name like '%" + name + "%'";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                CD cd = new CD();
                cd.setId(resultSet.getInt("id"));
                cd.setName(resultSet.getString("name"));
                cd.setSinger(resultSet.getString("singer"));
                cd.setNumbersongs(resultSet.getInt("numbersongs"));
                cd.setPrice(resultSet.getDouble("price"));
                listCD.add(cd);
            }
        }
        return listCD;
    }

    // excecute search CD
    public void runSearch() throws IOException, SQLException, ClassNotFoundException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("----Search CD----");
        System.out.print("Input name CD to search: ");
        String name = input.readLine();
        List<CD> listCD;
        try {
            listCD = this.searchCD(name);
            if (listCD.size() <= 0) {
                System.out.println("CD is not find!");
            } else {
                for (CD cd : listCD) {
                    cd.show();
                }
            }
        } catch (HeadlessException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

//     update CD with parameter cd
    public void updateCD(CD cd) throws ClassNotFoundException, SQLException {
        try (Connection conn = db.connect()) {
            String sql = "UPDATE cd SET price = '" + cd.getPrice()
                    + "', numbersongs = '" + cd.getNumbersongs()
                    + "' where id = '" + cd.getId() + "'";
            PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
            statement.execute();
        }
    }
    
    // delete CD with parameter id of CD
    public void deleteCD(int id) throws ClassNotFoundException, SQLException {
        try (Connection conn = db.connect()) {
            String sql = "DELETE FROM cd WHERE id = " + id + "";
            PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
            statement.execute();
            System.out.println("Delete CD completed!");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
        
    }

    // get all CD in db -> return list of CD
    public List<CD> getAllCD() throws ClassNotFoundException, SQLException {
        List<CD> listCD = new ArrayList<>();
        try (Connection conn = db.connect()) {

            Statement statement = (Statement) conn.createStatement();
            String sql = "SELECT * FROM cd";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                CD cd = new CD();
                cd.setId(resultSet.getInt("id"));
                cd.setName(resultSet.getString("name"));
                cd.setSinger(resultSet.getString("singer"));
                cd.setNumbersongs(resultSet.getInt("numbersongs"));
                cd.setPrice(resultSet.getDouble("price"));
                listCD.add(cd);
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
        return listCD;
    }
}
