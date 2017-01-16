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

    public void start() throws IOException {
        board.draw();
        askPlayerWhereToMark();
        updateBoard();
    }

    public void askPlayerWhereToMark() {
        printStream.println("\nTell me a number where you want to make a mark:\n");
    }

    public void updateBoard() throws IOException {
        String markPosition = playerOne.giveMove();
        String mark = playerOne.makeMark();
        board.redraw(markPosition, mark);
    }
}
