package Hard;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 28/1/2018.
 */
public class Q18Test {

    @Test
    public void testShortestSupersequence() throws Exception {
        int[] small = new int[]{1,5,9};
        int[] big = new int[]{7, 5, 9, 0, 2, 1, 3, 5, 7, 9, 1, 1, 5, 8, 8, 9, 7};

        assertEquals(4, Q18.minDistance(big, small));

    }
}
