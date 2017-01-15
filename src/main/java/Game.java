import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by ltran on 1/13/17.
 */
public class Game {
    private Board board;
    private InputParser inputParserOne;
    private PrintStream printStream;

    public Game(Board board, InputParser inputParserOne, PrintStream printStream) {
        this.board = board;
        this.inputParserOne = inputParserOne;
        this.printStream = printStream;
    }

    public void start() throws IOException {
        board.draw();
        askPlayerWhereToMark();
        updateBoardWith();
    }

    public void askPlayerWhereToMark() {
        printStream.println("\nTell me a number where you want to make a mark:\n");
    }

    public void updateBoardWith() throws IOException {
        String markPosition = inputParserOne.giveMove();
        board.redraw(markPosition);
    }
}
