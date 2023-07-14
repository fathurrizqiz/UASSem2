import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ConnectURI {
    private final String user_argent = "mozila/5.0";
    public static URL buildURL(String urlQuery){
        URL url=null;
        try{
            url=new URL(urlQuery.toString());

        } catch (MalformedURLException e ){
            e.fillInStackTrace();
        }
        return url;
    }

    public static String getresponsefromhttpUrl(URL url) throws IOException{
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            InputStream in = urlConnection.getInputStream();
            Scanner Scanner = new Scanner(in);
            Scanner.useDelimiter("\\A");
            boolean hasInput = Scanner.hasNext();
            if (hasInput){
                return Scanner.next();

            } else {
                return null;
            }
        } finally {
            urlConnection.disconnect();

        }
    }
}
