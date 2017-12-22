package OOD.Q10_Minesweeper;

/*
* Board is responsible for the lifecycle of the game as it initializes and provides the playGame method.
*
* */
public class Game {
    private Player player;
    private Board board;

    public Game(String playerName, int numOfBombs, int rows, int columns) {
        this.player = new Player(playerName);
        this.board = new Board(rows, columns, numOfBombs);
    }

    public void playGame() {
    }
}
