import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ltran on 1/13/17.
 */
public class Player {
    private String mark;

    private BufferedReader bufferedReader;

    public Player(BufferedReader bufferedReader, String mark) {
        this.bufferedReader = bufferedReader;
        this.mark = mark;
    }

    public String giveMove() throws IOException {
        return bufferedReader.readLine();
    }

    public String makeMark() {
        return mark;
    }
}
