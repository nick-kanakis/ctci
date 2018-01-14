package Moderate;

import Moderate.Q4.Cell;
import Moderate.Q4.Point;
import Moderate.Q4.Q4;
import Moderate.Q4.TickTackToeValue;
import org.junit.Test;

import java.time.temporal.ValueRange;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 14/1/2018.
 */
public class Q4Test {

    @Test
    public void testHasWon() throws Exception {
        Cell[][] grid = new Cell[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid[i][j] = new Cell(i,j, TickTackToeValue.EMPTY);
            }
        }

        grid[1][1].value = TickTackToeValue.X;
        grid[2][2].value = TickTackToeValue.X;
        grid[3][3].value = TickTackToeValue.X;
        grid[0][0].value = TickTackToeValue.O;

        assertTrue(Q4.hasWon(grid, new Point(3,3)));
        assertTrue(Q4.hasWon(grid, new Point(2,2)));
        assertTrue(Q4.hasWon(grid, new Point(1,1)));
        assertFalse(Q4.hasWon(grid, new Point(0,0)));
    }
}
