package OOD.Q6_Puzzle;

import java.util.HashMap;
/**
 * Each piece is a map of edges and orientation, there is also a methods to inform if the piece is in the corner or
 * is in the border.
 */
public class Piece {
    HashMap<Orientation, Edge>  edges = new HashMap<>();

    public Piece(HashMap<Orientation, Edge> edges) {
        this.edges = edges;
    }

    public boolean isCorner(){
        return false;
    }

    public boolean isBorder(){
        return false;
    }

}
