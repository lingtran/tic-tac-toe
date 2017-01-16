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
        when(playerOne.makeMark()).thenReturn("X");
        when(playerOne.giveMove()).thenReturn("1");

        game.updateBoard();

        verify(board).redraw("1", "X");
    }

    @Test
    public void shouldRedrawBoardWithPositionNumberGivenByASecondPlayer() {
//        After the first player makes a move, tell a second player to make their move. Redraw the board with an ‘O’ in that location (and still draw player 1’s ‘X’). You don’t need to check if that location is already taken.

    }
}