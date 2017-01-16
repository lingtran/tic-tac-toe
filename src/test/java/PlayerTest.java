import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ltran on 1/13/17.
 */
public class PlayerTest {
    private BufferedReader bufferedReader;
    private Player player;

    @Before
    public void setUp() {
        bufferedReader = mock(BufferedReader.class);
        player = new Player(bufferedReader, "X");
    }

    @Test
    public void playerCanGivePositionNumber() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");

        String resultInput = player.giveMove();

        assertThat(resultInput, is("1"));
    }

    @Test
    public void playerCanMakeTheirMarkX() {
        String resultMark = player.makeMark();

        assertThat(resultMark, is("X"));
    }

}