import java.io.PrintStream;

/**
 * Created by ltran on 1/13/17.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game(new Board(System.out), new Player(), System.out);
        game.start();
    }
}
