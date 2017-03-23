import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Андрей on 23.03.2017.
 */
public class GameHelper {

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + "  ");

        try {
            BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ));
            inputLine = reader.readLine();
            if (inputLine.length() == 0) {
                return null;
            }

        }catch (IOException e) {
            System.out.println("IOException:" + e);
        }

        return inputLine;
    }
}
