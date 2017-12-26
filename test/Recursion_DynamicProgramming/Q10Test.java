package Recursion_DynamicProgramming;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 26/12/2017.
 */
public class Q10Test {

    @Test
    public void testPaintFill() throws Exception {
        int[][] screen = new int[][]{
                        {1,1,1,1,1,1,1,1},
                        {1,2,2,2,2,2,1,1},
                        {1,2,2,2,2,2,1,1},
                        {1,2,2,2,2,2,1,1},
                        {1,2,2,2,2,2,1,1},
                        {1,2,2,2,2,2,1,1},
                        {1,2,2,2,2,2,1,1},
                        {1,1,1,1,1,1,1,1},
                        {1,1,1,1,1,1,1,1}};

        int[][] screenResult = new int[][]{
                {1,1,1,1,1,1,1,1},
                {1,3,3,3,3,3,1,1},
                {1,3,3,3,3,3,1,1},
                {1,3,3,3,3,3,1,1},
                {1,3,3,3,3,3,1,1},
                {1,3,3,3,3,3,1,1},
                {1,3,3,3,3,3,1,1},
                {1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1}};

        Q10.paintFill(screen, 4,4, 3);
        assertTrue(Arrays.deepEquals(screenResult, screen));
    }
}
