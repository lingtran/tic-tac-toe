import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ltran on 1/13/17.
 */
public class GameTest {
    @Test
    public void shouldHaveBoardAfterGameStarts() {
        Board board = mock(Board.class);
        Game game = new Game();

        game.start();

        verify(board);
    }

}