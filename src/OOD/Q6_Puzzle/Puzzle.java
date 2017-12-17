package OOD.Q6_Puzzle;

import java.util.LinkedList;
/**
 * Puzzle is the main object, it holds the solution as well as the unused pieces. Also adds a piece in solution.
 */
public class Puzzle {
    LinkedList<Piece> unusedPieces;
    private Piece[][] solution;

    public Puzzle(LinkedList<Piece> unusedPieces, int size) {
        this.unusedPieces = unusedPieces;
        solution = new Piece[size][size];
    }

    public void setEdgeInSolution(Edge edge, int row, int column, Orientation orientation){
        Piece piece = edge.getParentPiece();
        unusedPieces.remove(piece);
        solution[row][column] = piece;
    }
}
