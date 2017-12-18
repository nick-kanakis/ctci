package OOD.Q8_Othello;

/*
* Board is responsible for keeping and updating the score since it is also responsible for placing a piece and flipping
* the necessary pieces
* */
public class Board {
    private static final int BoardSize = 10;
    private int blackCount = 2;
    private int whiteCount = 2;
    private Piece[][] board;

    public Board() {
        board = new Piece[BoardSize][BoardSize];
        initialize();
    }

    private void initialize() {
        //initialize first 2 pieces on the board;
    }

    public boolean placePiece(Piece piece, int x, int y){
        //attempt to place piece at position x,y return true if valid move else return false]
        return false;
    }

    public void flipSection(int rowStart, int rowEnd, int columnStart, int columnEnd){
        //flip the line of pieces, and update score.
    }

    public int getBlackCount() {
        return blackCount;
    }

    public int getWhiteCount() {
        return whiteCount;
    }
}
