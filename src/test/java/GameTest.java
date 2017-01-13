import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.mockito.Mockito.*;

/**
 * Created by ltran on 1/13/17.
 */
public class GameTest {
    private PrintStream printStream;
    private Board board;
    private Player playerOne;
    private Game game;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        playerOne = mock(Player.class);
        game = new Game(board, playerOne, printStream);
    }

    @Test
    public void shouldHaveBoardAfterGameStarts() {
        game.start();

        verify(board).draw();
    }

    @Test
    public void shouldAskPlayerToEnterAPositionNumber() {
        game.askPlayerWhereToMark();

        verify(printStream).println("\nTell me a number where you want to make a mark:\n");
    }

    @Test
    public void playShouldRedrawBoardWithPositionNumberGivenByPlayer() throws IOException {
        game.play();

        verify(playerOne).giveMove();
        verify(board).redraw("1");
    }
}