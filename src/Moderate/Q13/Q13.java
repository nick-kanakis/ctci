package Moderate.Q13;

/**
 * Every line that passes throw the center of a square splits it into 2 equal halves. The line that connects the center of the
 * 2 squares splits both of them into 2 halves.
 */
public class Q13 {


    public static LineSegment getBisectLine(Square sq1, Square sq2){

        Point p1 = sq1.getCenter();
        Point p2 = sq2.getCenter();

        return  new LineSegment(p1, p2);
    }
}
