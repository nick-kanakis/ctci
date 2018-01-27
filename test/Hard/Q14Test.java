package Hard;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 27/1/2018.
 */
public class Q14Test {

    @Test
    public void testKthSmallest() throws Exception {
        int[] input = new int[]{3,2,1,5,6,7,8,9,0,4,10,11,12,2,2,2,3,3,3,3,3,1,1,1,1,1,1,1,1};

        assertEquals(4, Q14.kthSmallest(input, 4));
        assertEquals(12, Q14.kthSmallest(input, 12));
        assertEquals(1, Q14.kthSmallest(input, 1));
    }
}
