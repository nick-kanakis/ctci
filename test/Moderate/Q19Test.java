package Moderate;

import Moderate.Q19.Q19;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nicolas on 19/1/2018.
 */
public class Q19Test {

    @Test
    public void testExplorePond() throws Exception {
        int[][] map = new int[][]{
                {0, 2, 1, 0},
                {0, 1, 0, 1},
                {1, 1, 0, 1},
                {0, 1, 0, 1}
        };

        ArrayList<Integer> pondSizes = Q19.pondSizes(map);

        assertTrue(pondSizes.contains(2));
        assertTrue(pondSizes.contains(4));
        assertTrue(pondSizes.contains(1));
    }
}
