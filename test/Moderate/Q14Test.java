package Moderate;

import Moderate.Q14.Line;
import Moderate.Q14.Point;
import Moderate.Q14.Q14;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 17/1/2018.
 */
public class Q14Test {

    @Test
    public void testGetBestLine() throws Exception {
        Point point1 = new Point(0,0);
        Point point2 = new Point(1,1);
        Point point3 = new Point(2,2);
        Point point4 = new Point(3,3);
        Point point5 = new Point(0,3);
        Point point6 = new Point(0,8);
        Point point7 = new Point(1,8);
        Point point8 = new Point(1,2);
        Point point9 = new Point(6,5);

        List<Point> points  = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
        points.add(point5);
        points.add(point6);
        points.add(point7);
        points.add(point8);
        points.add(point9);

        Line result = Q14.getBestLine(points);
        Line bestLine = new Line(point1, point3);
        assertEquals(result, bestLine);
    }
}
