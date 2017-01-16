import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ltran on 1/13/17.
 */

public class BoardTest {
    private PrintStream printStream;
    private Board board;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
    }

    @Test
    public void shouldDrawBoard() {
        board.draw();

        verify(printStream).println("1|2|3\n-----\n4|5|6\n-----\n7|8|9");
    }

    @Test
    public void shouldDrawThreeRowsWithThreePositionsInEachRow(){
        String result = board.drawRows();

        assertThat(result, is("1|2|3\n4|5|6\n7|8|9"));
    }

    @Test
    public void shouldRedrawBoardWithAnX() {
        board.redraw("1", "X");

        verify(printStream).println("X|2|3\n-----\n4|5|6\n-----\n7|8|9");
    }

}