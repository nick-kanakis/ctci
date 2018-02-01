package Hard;

import Hard.Q24.Q24;
import Hard.Q24.SubMatrix;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 31/1/2018.
 */
public class Q24Test {

    @Test
    public void testGetMaxSubArray() throws Exception {

        int[][] matrix = new int[][]{
                {1,2,-30,4,5,-6},
                {7,-50,2,-10,30,50},
                {3,-142,-110,50,60,-20}
        };

        SubMatrix expectedSubMatrix = new SubMatrix(3,5, 0, 2, 163);
        assertEquals(expectedSubMatrix, Q24.getMaxSubArray(matrix));
    }


}


