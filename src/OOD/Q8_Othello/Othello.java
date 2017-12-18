package OOD.Q8_Othello;

/*
* Initialize the board and sets the player.
* */
public class Othello {

    private Player player1;
    private Player player2;
    private Board board;

    public Othello(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
    }

    public Board getBoard() {
        return board;
    }
}
