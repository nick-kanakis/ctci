import Sorting_Searching.Q9.Coordinate;
import Sorting_Searching.Q9.Q9;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 4/1/2018.
 */
public class Q9Test {

    @Test
    public void testFindElement() throws Exception {

        int[][] input = new int[][]{
                {1, 10, 20, 30, 40},
                {5, 16, 22, 33, 42},
                {15, 18, 26, 34, 37},
                {25, 27, 31, 35, 56},
                {35, 36, 41, 48, 57},
                {45, 47, 50, 55, 58}
        };

        int[][] input2 = new int[][]{
                {15, 20, 70, 85},
                {20, 35, 80, 95},
                {30, 55, 95, 105},
                {40, 80, 100, 120}

        };

        Coordinate c1 = Q9.findElement(input2, 85);
        Coordinate c2 = Q9.findElement(input2, 55);


        assertTrue(c1.row == 0 && c1.column ==3);
        assertTrue(c2.row == 2 && c2.column ==1);

        Coordinate c3 = Q9.findElement(input, 34);
        Coordinate c4 = Q9.findElement(input, 47);
        Coordinate c5 = Q9.findElement(input, 16);

        assertTrue(c3.row == 2 && c3.column ==3);
        assertTrue(c4.row == 5 && c4.column == 1);
        assertTrue(c5.row == 1 && c5.column ==1);
    }
}
