import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by ltran on 1/13/17.
 */
public class Player {

    private BufferedReader bufferedReader;

    public Player(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public String giveMove() throws IOException {
        return bufferedReader.readLine();
    }

}
