package IO.exercise;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class YahooAgent {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("C:\\Users\\Mirza\\Desktop\\gg.html");

        URL url = new URL("https://www.google.com/");
        URLConnection urlConnection=url.openConnection();
        urlConnection.connect();
        InputStream is=urlConnection.getInputStream();




        int c=0;
        while (is.read()!=-1)
        {
            os.write(is.read());
        }

    }

}
