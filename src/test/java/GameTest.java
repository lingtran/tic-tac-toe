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
    private InputParser inputParser;
    private Game game;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        inputParser = mock(InputParser.class);
        game = new Game(board, inputParser, printStream);
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
        when(inputParser.giveMove()).thenReturn("1");

        game.updateBoardWith();

        verify(printStream).println("X|2|3\n-----\n4|5|6\n-----\n7|8|9");
    }
}