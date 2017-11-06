package Arrays_Strings;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nicolas on 7/11/2017.
 */
public class Q8Test {

    @Test
    public void testZeroMatrix() throws Exception {
        int[][] matrix ={{1,2,0,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,0,3,4,5},{1,2,3,4,0}};
        int[][] expected ={{0,0,0,0,0},{1,0,0,4,0},{1,0,0,4,0},{0,0,0,0,0},{0,0,0,0,0}};

        int[][] result = Q8.zeroMatrix(matrix);

        assertTrue(Arrays.deepEquals(result, expected));
    }

    @Test
    public void testZeroMatrixWithoutExtraDS() throws Exception {
        int[][] matrix ={{1,2,0,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,0,3,4,5},{1,2,3,4,0}};
        int[][] expected ={{0,0,0,0,0},{1,0,0,4,0},{1,0,0,4,0},{0,0,0,0,0},{0,0,0,0,0}};

        int[][] result = Q8.zeroMatrixWithoutExtraDS(matrix);

        assertTrue(Arrays.deepEquals(result, expected));
    }
}
