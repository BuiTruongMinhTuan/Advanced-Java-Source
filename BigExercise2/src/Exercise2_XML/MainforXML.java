package Exercise2_XML;

import static Exercise2_TXT.MainforTXT.print;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * @author Bui Truong Minh Tuan
 * Date : 19/9/2016
 * Version : 1.0
 * 
 */
public class MainforXML {

    static DatabaseConnection db = new DatabaseConnection();

    public static void main(String[] args) throws ClassNotFoundException,
            SQLException, FileNotFoundException, ParserConfigurationException,
            SAXException, IOException, TransformerException, org.xml.sax.SAXException {

        List<CD> listCD = new ArrayList<CD>();
        //load CD from date to list
        loadDatabase(listCD);

        String path = "src/Exercise2_XML/cd.xml";
        //write CD to XML flie
        writeToXML(path, listCD);
        //read CD from XML file
        readFromXML(path, listCD);
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

    //read from XML file
    public static void readFromXML(String path, List<CD> listCD)
            throws ParserConfigurationException, SAXException, IOException, org.xml.sax.SAXException {
        listCD.clear();
        File xmlFile = new File(path);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xmlFile);
        doc.getDocumentElement().normalize();
        NodeList nodeList = doc.getElementsByTagName("CD");
        if (nodeList != null) {
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String id = element.getElementsByTagName("id").item(0)
                            .getTextContent();
                    String name = element.getElementsByTagName("name").item(0)
                            .getTextContent();
                    String singer = element.getElementsByTagName("singer").item(0)
                            .getTextContent();
                    String numberSongs = element.getElementsByTagName("numberSongs")
                            .item(0).getTextContent();
                    String price = element.getElementsByTagName("price").item(0)
                            .getTextContent();

                    listCD.add(new CD(Integer.parseInt(id), name, singer,
                            Integer.parseInt(numberSongs), Double
                            .parseDouble(price)));

                }
            }
        }
    }

    //write to XML file
    public static void writeToXML(String path, List<CD> listCD)
            throws ParserConfigurationException, FileNotFoundException,
            SAXException, IOException, TransformerException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory
                .newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();

        Element rootElement = doc.createElement("CDs");
        doc.appendChild(rootElement);

        for (CD cd : listCD) {
            Element elementCD = doc.createElement("CD");
            rootElement.appendChild(elementCD);

            Element elementId = doc.createElement("id");
            elementId.appendChild(doc.createTextNode(cd.getId() + ""));
            elementCD.appendChild(elementId);

            Element elementName = doc.createElement("name");
            elementName.appendChild(doc.createTextNode(cd.getName()));
            elementCD.appendChild(elementName);

            Element elementSinger = doc.createElement("singer");
            elementSinger.appendChild(doc.createTextNode(cd.getSinger()));
            elementCD.appendChild(elementSinger);

            Element elementNumberSongs = doc.createElement("numberSongs");
            elementNumberSongs.appendChild(doc.createTextNode(cd
                    .getNumbersongs() + ""));
            elementCD.appendChild(elementNumberSongs);

            Element elementPrice = doc.createElement("price");
            elementPrice.appendChild(doc.createTextNode(cd.getPrice() + ""));
            elementCD.appendChild(elementPrice);
        }

        TransformerFactory transformerFactory = TransformerFactory
                .newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(path));

        transformer.transform(source, result);
    }
    //check list empty and show
    private static void print(List<CD> listCD) {
        System.out.println("----LIST CD From XML----\n");
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
