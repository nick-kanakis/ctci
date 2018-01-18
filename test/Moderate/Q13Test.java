package Moderate;

import Moderate.Q13.LineSegment;
import Moderate.Q13.Point;
import Moderate.Q13.Q13;
import Moderate.Q13.Square;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 17/1/2018.
 */
public class Q13Test {

    @Test
    public void testGetBisectLine() throws Exception {
        Square sq1 = new Square(new Point(6,0), new Point(0, 0) , new Point(6,6), new Point(0,6));
        Square sq2 = new Square(new Point(-1,-1), new Point(-7, -1) , new Point(-1,-7), new Point(-7,-7));

        LineSegment bisectLineSegment = Q13.getBisectLine(sq1, sq2);

        Point start = new Point(3,3);
        Point end = new Point(-4,-4);

        assertEquals(start, bisectLineSegment.start);
        assertEquals(end, bisectLineSegment.end);
    }
}
