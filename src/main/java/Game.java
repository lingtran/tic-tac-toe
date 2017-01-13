import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by ltran on 1/13/17.
 */
public class Game {
    private Board board;
    private Player playerOne;
    private PrintStream printStream;

    public Game(Board board, Player playerOne, PrintStream printStream) {
        this.board = board;
        this.playerOne = playerOne;
        this.printStream = printStream;
    }

    public void start() {
        board.draw();
    }

    public void askPlayerWhereToMark() {
        printStream.println("\nTell me a number where you want to make a mark:\n");
    }

    public void play() throws IOException {
        askPlayerWhereToMark();
        String position = playerOne.giveMove();
        updateBoardWith(position);
    }

    public void updateBoardWith(String markPosition) {
        board.redraw(markPosition);
    }
}
