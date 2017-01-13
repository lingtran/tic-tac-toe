import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by ltran on 1/13/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        PrintStream printStream = System.out;
        Board board = new Board(printStream);
        Player player = new Player(System.in);
        Game game = new Game(board, player, printStream);

        game.start();
        game.play();
    }
}
