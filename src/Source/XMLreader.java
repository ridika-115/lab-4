package Source;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class XMLreader extends BankAnalyzer{
    public static void main(String[] args) {

        try{
            File xmlFile = new File("C:\\Users\\nazni\\Downloads\\3rd sem\\oop 2\\lab tasks\\lab 4\\lab 4\\src\\Source\\xmlFile.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();

            System.out.println("Root element :" + document.getDocumentElement().getNodeName());
            NodeList nList = document.getElementsByTagName("transactions");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("Current Element :" + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("date : "
                            + eElement.getElementsByTagName("date")
                            .item(0).getTextContent());
                    System.out.println("transaction : "
                            + eElement.getAttribute("transaction"));
                    System.out.println("amount : "
                            + eElement.getElementsByTagName("amount")
                            .item(0).getTextContent());
                    System.out.println("description : "
                            + eElement.getElementsByTagName("description")
                            .item(0).getTextContent());
                }
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
