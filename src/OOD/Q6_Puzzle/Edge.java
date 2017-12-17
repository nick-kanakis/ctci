package OOD.Q6_Puzzle;


public class Edge {

    private Shape shape;
    private Piece parentPiece;

    public Edge(Shape shape, Piece parentPiece) {
        this.shape = shape;
        this.parentPiece = parentPiece;
    }

    public Piece getParentPiece() {
        return parentPiece;
    }

    public Shape getShape() {
        return shape;
    }
}
