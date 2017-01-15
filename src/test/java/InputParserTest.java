import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by ltran on 1/13/17.
 */
public class InputParserTest {
    @Test
    public void parserCanReadPositionNumber() throws IOException {
        BufferedReader bufferedReader = mock(BufferedReader.class);
        InputParser inputParser = new InputParser(bufferedReader);
        when(bufferedReader.readLine()).thenReturn("1");

        String resultInput = inputParser.giveMove();

        assertThat(resultInput, is("1"));
    }

}