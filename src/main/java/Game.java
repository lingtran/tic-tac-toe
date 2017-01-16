import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by ltran on 1/13/17.
 */
public class Game {
    private Board board;
    private Player playerOne;
    private Player playerTwo;
    private PrintStream printStream;

    public Game(Board board, Player playerOne, Player playerTwo, PrintStream printStream) {
        this.board = board;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.printStream = printStream;
    }

    public void start() throws IOException {
        board.draw();
        askPlayerWhereToMark();
        firstPlayerMakesMove();
        askPlayerWhereToMark();
        secondPlayerMakesMove();
    }

    public void askPlayerWhereToMark() {
        printStream.println("\nTell me a number where you want to make a mark:\n");
    }

    public void firstPlayerMakesMove() throws IOException {
        updateBoardWith(playerOne.giveMove(), playerOne.makeMark());
    }

    public void secondPlayerMakesMove() throws IOException {
        playerTakesTurn(playerTwo.giveMove(), playerTwo.makeMark());
    }

    private void playerTakesTurn(String playerMove, String playerMark) throws IOException {
        if (!board.determineIfPositionIsFreeAt(playerMove)) {
                printStream.println("\nLocation already taken");
                askPlayerWhereToMark();
                playerTakesTurn(playerMove, playerMark);

        } else {
            updateBoardWith(playerMove, playerMark);
        }
    }

    private void updateBoardWith(String playerMove, String playerMark) throws IOException {
        board.redraw(playerMove, playerMark);
    }

}
