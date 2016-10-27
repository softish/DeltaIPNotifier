import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by softish on 2016-10-27.
 */
public class Checker {

    private static final String webService = "http://checkip.amazonaws.com";

    public String getIP() {
        String ip = null;
        URL myIP = null;

        try {
            myIP = new URL(webService);
        } catch (MalformedURLException e) {
            throw new UnobtainableIPException("URL formatting");
        }

        try (BufferedReader in = new BufferedReader(new InputStreamReader(myIP.openStream()))){
            ip =  in.readLine();
        } catch (IOException e) {
            throw new UnobtainableIPException("Connection failed");
        }

        return ip;
    }
}
