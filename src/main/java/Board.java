import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ltran on 1/13/17.
 */
public class Board {
    PrintStream printStream;
    HashMap<Integer, String> boardPositions = new HashMap<Integer, String>();

    public Board(PrintStream printStream) {
        this.printStream = printStream;
        createRow();
    }

    public void draw() {
        printStream.println("1|2|3\n-----\n4|5|6\n-----\n7|8|9\n");
    }

    public String drawRow() {
        String row = "";

        for (Integer integer : boardPositions.keySet()) {
            if (integer % 3 == 0) {
                row += boardPositions.get(integer);
            } else {
                row += boardPositions.get(integer) + "|";
            }
        }

        return row;
    }

    private void createRow() {
        for(int i=1; i<=3; i++) {
            boardPositions.put(i, Integer.toString(i));
        }
    }
}
