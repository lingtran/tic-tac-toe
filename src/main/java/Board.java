import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ltran on 1/13/17.
 */
public class Board {
    PrintStream printStream;
    List<String> boardPositions = new ArrayList();

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

        for (String position : boardPositions) {
            if ((boardPositions.indexOf(position) + 1) % 3 == 0) {
                row += position + "\n";
            } else {
                row += position + "|";
            }
        }

        return row.trim();
    }

    private void createBoardPositions() {
        for(int i=0; i<9; i++) {
            boardPositions.add(Integer.toString(i+1));
        }
    }

    public void redraw(String markPosition) {
    }
}
