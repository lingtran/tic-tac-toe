import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

/**
 * Created by ltran on 1/13/17.
 */
public class GameTest {
    @Test
    public void shouldHaveBoardAfterGameStarts() {
        PrintStream printStream = mock(PrintStream.class);
        Board board = mock(Board.class);
        Player playerOne = mock(Player.class);
        Game game = new Game(board, playerOne, printStream);

        game.start();

        verify(board).draw();
    }

    @Test
    public void shouldAskPlayerToEnterAPositionNumber() {
        PrintStream printStream = mock(PrintStream.class);
        Board board = mock(Board.class);
        Player playerOne = mock(Player.class);
        Game game = new Game(board, playerOne, printStream);

        game.askPlayerWhereToMark();

        verify(printStream).println("\nTell me a number where you want to make a mark:");
    }

}