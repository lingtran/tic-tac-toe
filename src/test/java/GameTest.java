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
    private Player playerTwo;
    private Game game;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        playerOne = mock(Player.class);
        playerTwo = mock(Player.class);
        game = new Game(board, playerOne, playerTwo, printStream);
    }

    public void setUpFirstPlayer() throws IOException {
        when(playerOne.makeMark()).thenReturn("X");
        when(playerOne.giveMove()).thenReturn("1");
    }

    public void setUpSecondPlayer() throws IOException {
        when(playerTwo.giveMove()).thenReturn("1");
        when(playerTwo.makeMark()).thenReturn("0");
    }

    @Test
    public void shouldHaveBoardAfterGameStarts() throws IOException {
        game.start();

        verify(board).draw();
    }

    @Test
    public void shouldAskPlayerToEnterAPositionNumber() {
        game.askPlayerWhereToMark();

        verify(printStream).println("\nTell me a number where you want to make a mark:\n");
    }

    @Test
    public void shouldRedrawBoardWithPositionNumberGivenByPlayer() throws IOException {
        setUpFirstPlayer();

        game.firstPlayerMakesMove();

        verify(board).redraw("1", "X");
    }

    @Test
    public void shouldRedrawBoardWithPositionNumberGivenByASecondPlayer() throws IOException {
        setUpFirstPlayer();
        setUpSecondPlayer();

        game.secondPlayerMakesMove();

        verify(board).redraw("1", "0");
    }
}