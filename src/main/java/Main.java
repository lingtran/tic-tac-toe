import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by ltran on 1/13/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        PrintStream printStream = System.out;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Board board = new Board(printStream);
        Player player = new Player(bufferedReader);
        Game game = new Game(board, player, printStream);

        game.start();
    }
}
