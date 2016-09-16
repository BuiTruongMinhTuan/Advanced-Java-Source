package chapter7_1;

/*
 * @author Bui Truong Minh Tuan
 * Date : 16/9/2016
 * Version : 1.0
 * 
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author Tran Ngoc Dan
 * @version 1.0
 * @since 08/09/2016
 */
public class TelephoneDirectory {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    //HashMap<numPhone, nameOfContact>
    private ArrayList<Contact> list;

    public TelephoneDirectory() {
        this.list = new ArrayList<Contact>();
    }

    //add new contact
    public void addContact(String numberPhone, String name) {
        boolean numFlag = false;
        boolean nameFlag = false;
        for (int i = 0; i < this.list.size(); i++) {
            numFlag = false;
            nameFlag = false;
            //check null
            if (this.list.get(i).getNumberPhone().compareTo(numberPhone) == 0) {
                numFlag = true;
            }
            if (this.list.get(i).getName().compareToIgnoreCase(name) == 0) {
                nameFlag = true;
            }

            if (numFlag == true && nameFlag == true) {
                break;
            }
        }

        //check exist or add
        if (numFlag == true && nameFlag == true && this.list.size() > 0) {
            System.out.println("The contact existed in list");
        } else {
            this.list.add(new Contact(numberPhone, name));
            System.out.println("Add contact successfully!");
        }
    }

    //list of contact use name
    private ArrayList<Integer> searchContactRegardingName(String name) {
        ArrayList<Integer> index = new ArrayList<Integer>();
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getName().compareToIgnoreCase(name) == 0) {
                index.add(i);
            }
        }
        return index;
    }

    //search by name
    public void searchName(String name) {
        ArrayList<Integer> index = searchContactRegardingName(name);
        for (int i = 0; i < index.size(); i++) {
            System.out.println("[NumberPhone] " + this.list.get(index.get(i)).getNumberPhone());
            System.out.println("");
        }
    }

    //list contact use phone number
    private ArrayList<Integer> searchContactRegardingNumPhone(String numberPhone) {
        ArrayList<Integer> index = new ArrayList<Integer>();
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getNumberPhone().compareTo(numberPhone) == 0) {
                index.add(i);
            }
        }
        return index;
    }

    //search by numberphone
    public void searchNumberPhone(String numberPhone) {
        ArrayList<Integer> index = searchContactRegardingNumPhone(numberPhone);
        for (int i = 0; i < index.size(); i++) {
            System.out.println("[Name] " + this.list.get(index.get(i)).getName());
            System.out.println("");
        }
    }

    //remove contactby  phonenumber
    public void removeContactRegardingNumPhone(String numberPhone) throws IOException {
        ArrayList<Integer> index = searchContactRegardingNumPhone(numberPhone);
        if (index.size() > 0) {
            //Show list results
            int ans = 0;
            while (true) {
                for (int i = 0; i < index.size(); i++) {
                    System.out.println((i + 1) + ". " + this.list.get(index.get(i)).getNumberPhone() + " - " + this.list.get(index.get(i)).getName());
                }
                if (index.size() > 1) {
                    //Choose the item which wanna remove
                    System.out.print("Choose the contact want remove 1 to : " + index.size());
                    ans = Integer.parseInt(input.readLine());
                    if (ans >= 1 && ans <= index.size()) {
                        break;
                    }
                } else {
                    ans = 1;
                    break;
                }
            }
            //remove
            this.list.remove(index.get(ans - 1).intValue());
            System.out.println("Remove contact successfully");
        } else {
            System.out.println(numberPhone + " doesn't exist in list");
        }
    }

//remove contact by name
    public void removeContactRegardingName(String name) throws IOException {
        ArrayList<Integer> index = searchContactRegardingName(name);
        if (index.size() > 0) {
            //Show list results
            int ans = 0;
            while (true) {
                for (int i = 0; i < index.size(); i++) {
                    System.out.println((i + 1) + ". " + this.list.get(index.get(i)).getName() + " - " + this.list.get(index.get(i)).getNumberPhone());
                }
                if (index.size() > 1) {
                    //Choose the item which wanna remove
                    System.out.print("Choose the contact want remove 1 to : " + index.size());
                    ans = Integer.parseInt(input.readLine());
                    if (ans >= 1 && ans <= index.size()) {
                        break;
                    }
                } else {
                    ans = 1;
                    break;
                }

            }
            //remove
            this.list.remove(index.get(ans - 1).intValue());
            System.out.println("Remove contact successfully");
        } else {
            System.out.println(name + " doesn't exist in list");
        }
    }

    //update the numberphone regarding to name
    public void updateContact(String name) throws IOException {
        System.out.println("== Update information of contact ==");
        ArrayList<Integer> index = searchContactRegardingName(name);
        if (index.size() > 0) {
            //Show list results
            int ans = 0;
            while (true) {
                for (int i = 0; i < index.size(); i++) {
                    System.out.println((i + 1) + ". " + this.list.get(index.get(i)).getName() + " - " + this.list.get(index.get(i)).getNumberPhone());
                }

                if (index.size() > 1) {
                    //Choose the item which wanna update
                    System.out.print("Choose the contact want remove 1 to : " + index.size());
                    ans = Integer.parseInt(input.readLine());
                    if (ans >= 1 && ans <= index.size()) {
                        break;
                    }
                } else {
                    ans = 1;
                    break;
                }
            }
            //update information
            System.out.print("Fill new numberphone: ");
            String newNumberPhone = input.readLine();
            this.list.set(index.get(ans - 1), new Contact(newNumberPhone, this.list.get(index.get(ans - 1)).getName()));
            System.out.println("Update successfully");
        } else {
            System.out.println(name + " doesn't exist in list");
        }
    }

    // show all contact
    public void showAllContact() {
        System.out.println("Number of contacts: " + this.list.size());
        if (this.list.size() > 0) {
            for (int i = 0; i < this.list.size(); i++) {
                System.out.println(i + 1);
                System.out.println("\t[Name] " + this.list.get(i).getName());
                System.out.println("\t[NumberPhone] " + this.list.get(i).getNumberPhone());
                System.out.println("");
            }
        }
    }

    //read node from file XML
    private NodeList readListNode(String path, String name) throws org.xml.sax.SAXException {

        File fXmlFile = new File(path);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        NodeList nList = null;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            //normalize tree
            doc.getDocumentElement().normalize();
            nList = doc.getElementsByTagName(name);
        } catch (ParserConfigurationException | IOException e) {
            System.out.println(e.getMessage());
        }
        return nList;
    }

    //Read file XML and add contact into list contact
    public void loadContact() throws org.xml.sax.SAXException {
        NodeList nList = readListNode("src/chapter7_1/contact.xml", "contact");
        if (nList != null) {
            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                Element element = (Element) node;
                String name = element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue();
                String phone = element.getElementsByTagName("phone").item(0).getChildNodes().item(0).getNodeValue();
                Contact contact = new Contact(phone, name);
                list.add(contact);
            }
        }
    }

    //Search contact by name
    public void searchContact(String name) {
        list.stream().filter(e -> e.getName().equalsIgnoreCase(name)).collect(Collectors.toList()).forEach(e -> e.showInfo());
    }

    //update to XML
    public void updateFileContact() throws TransformerConfigurationException, TransformerException {

        Path path = Paths.get("src/chapter7_1/contact.xml");
        if (!Files.exists(path)) {
            File file = new File("src/chapter7_1/contact.xml");
        }

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();

            //create root elements
            Document doc = builder.newDocument();
            Element rootElement = doc.createElement("contacts");
            doc.appendChild(rootElement);

            for (int i = 0; i < list.size(); i++) {
                Contact c = list.get(i);
                //contact element
                Element contact = doc.createElement("contact");
                rootElement.appendChild(contact);

                //name element
                Element name = doc.createElement("name");
                name.appendChild(doc.createTextNode(c.getName()));
                contact.appendChild(name);

                //phone element
                Element phone = doc.createElement("phone");
                phone.appendChild(doc.createTextNode(c.getNumberPhone()));
                contact.appendChild(phone);
            }
            //Write the content into file contact.xml
            TransformerFactory tranformer = TransformerFactory.newInstance();
            Transformer tf = tranformer.newTransformer();
            tf.setOutputProperty(OutputKeys.INDENT, "yes");
            tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/chapter7_1/contact.xml"));
            tf.transform(source, result);

        } catch (ParserConfigurationException | TransformerException e) {
            System.out.println(e.getMessage());
        }
    }
}
