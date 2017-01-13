import java.io.PrintStream;
import java.util.HashMap;

/**
 * Created by ltran on 1/13/17.
 */
public class Board {
    PrintStream printStream;
    HashMap<Integer, String> boardPositions = new HashMap<Integer, String>();

    public Board(PrintStream printStream) {
        this.printStream = printStream;
        createBoardPositions();
    }

    public void draw() {
        String rows = drawRows().replaceAll("\n", "\n-----\n");
        printStream.println(rows);
    }

    public String drawRows() {
        String row = "";

        for (Integer integer : boardPositions.keySet()) {
            if (integer % 3 == 0) {
                row += boardPositions.get(integer) + "\n";
            } else {
                row += boardPositions.get(integer) + "|";
            }
        }

        return row.trim();
    }

    private void createBoardPositions() {
        for(int i=1; i<=9; i++) {
            boardPositions.put(i, Integer.toString(i));
        }
    }

}
