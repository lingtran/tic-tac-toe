import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by ltran on 1/13/17.
 */
public class PlayerTest {
    @Test
    public void playerCanGivePositionNumberAsNextMove() throws IOException {
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Player player = new Player(bufferedReader);
        when(bufferedReader.readLine()).thenReturn("1");

        String resultInput = player.giveMove();

        assertThat(resultInput, is("1"));
    }

}