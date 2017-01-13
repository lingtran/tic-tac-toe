/**
 * Created by ltran on 1/13/17.
 */
public class Game {
    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    public void start() {
        board.draw();
    }
}
