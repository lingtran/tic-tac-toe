import org.junit.Test;
import org.mockito.stubbing.OngoingStubbing;

import static org.mockito.Mockito.*;

/**
 * Created by ltran on 1/13/17.
 */
public class GameTest {
    @Test
    public void shouldHaveBoardAfterGameStarts() {
        Board board = mock(Board.class);
        Game game = new Game(board);

        game.start();

        verify(board).draw();
    }


}