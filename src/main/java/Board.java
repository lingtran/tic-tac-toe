import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ltran on 1/13/17.
 */
public class Board {
    PrintStream printStream;

    public Board(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void draw() {
        printStream.println("1|2|3\n-----\n4|5|6\n-----\n7|8|9\n");
    }

    public String drawRow() {
        return "1|2|3";
    }
}
