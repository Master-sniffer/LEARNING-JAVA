package sample;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

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
        URL website = new URL("https://db.chgk.info/xml/search/questions/types1/%D0%9F%D1%83%D1%88%D0%BA%D0%B8%D0%BD/A");
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream("information.xml");
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);

        // Now let's parse the file
        
    }
}
