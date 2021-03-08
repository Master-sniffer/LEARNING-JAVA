package sample;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

// THESE ARE NEEDED TO PARSE

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class Main{

    public static void main(String[] args) throws IOException {
        // First Method tries out JUST GET RESPONSE
//        String url = "https://db.chgk.info/xml/search/questions/types1/%D0%9F%D1%83%D1%88%D0%BA%D0%B8%D0%BD/A";
//
//        URL obj = new URL(url);
//        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
//
//        connection.setRequestMethod("GET");
//
//        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//        String inputLine;
//        StringBuffer response = new StringBuffer();
//
//        while ((inputLine = in.readLine()) != null) {
//            response.append(inputLine);
//        }
//        in.close();
//
//        System.out.println(response.toString());


        // Second downloads "GET" Request from the site
        URL website = new URL("https://db.chgk.info/xml/random");
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream("information.xml");
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);

        // Now let's parse the file

        try {

            File fXmlFile = new File("information.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("question");

            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    // System.out.println("Staff id : " + eElement.getAttribute("QuestionId")); // WE USE THIS ONE IF WE HAVE SMTH LIKE <staff id="1001">
                    System.out.println("Question : " + eElement.getElementsByTagName("Question").item(0).getTextContent());
                    System.out.println("Answer : " + eElement.getElementsByTagName("Answer").item(0).getTextContent());


                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
