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


    public void redraw(String markPosition, String mark) {
      updateBoardPositions(markPosition, mark);
      draw();
    }


    public boolean determineIfPositionIsFreeAt(String markPosition) {
        Integer targetPosition = getIndexFor(markPosition);
        String currentMarkAtPosition = boardPositions.get(targetPosition);
        return  currentMarkAtPosition.matches(markPosition);
    }

    private void createBoardPositions() {
        for(int i=0; i<9; i++) {
            boardPositions.add(Integer.toString(i+1));
        }
    }

    private void updateBoardPositions(String markPosition, String mark) {
        Integer targetPosition = getIndexFor(markPosition);
        boardPositions.set(targetPosition, mark);
    }

    private Integer getIndexFor(String markPosition) {
        return Integer.parseInt(markPosition) - 1;
    }
}
