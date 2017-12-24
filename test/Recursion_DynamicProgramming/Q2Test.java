package Recursion_DynamicProgramming;

import Recursion_DynamicProgramming.Q2.Grid;
import Recursion_DynamicProgramming.Q2.Position;
import Recursion_DynamicProgramming.Q2.Q2;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 24/12/2017.
 */
public class Q2Test {

    @Test
    public void testFindPath() throws Exception {
        Grid grid = new Grid(5);
        grid.setPositionInValid(new Position(0,4));
        grid.setPositionInValid(new Position(1,4));
        grid.setPositionInValid(new Position(3,3));

        LinkedList<Position> correctPath = new LinkedList<>();
        correctPath.addFirst(new Position(0,0));
        correctPath.addFirst(new Position(0,1));
        correctPath.addFirst(new Position(0,2));
        correctPath.addFirst(new Position(0,3));
        correctPath.addFirst(new Position(1,3));
        correctPath.addFirst(new Position(2,3));
        correctPath.addFirst(new Position(2,4));
        correctPath.addFirst(new Position(3,4));
        correctPath.addFirst(new Position(4,4));

        List<Position> path = Q2.findPath(grid, 5);

        assertTrue(correctPath.equals(path));
    }
}
