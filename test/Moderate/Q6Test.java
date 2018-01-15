package Moderate;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 14/1/2018.
 */
public class Q6Test {

    @Test
    public void testGetMinDifference() throws Exception {
        int[] array1 = new int[]{1,2,11,15};
        int[] array2 = new int[]{4,12,19,23,127,235};

        int[] array3 = new int[]{1,3,15,11, 2};
        int[] array4 = new int[]{23,127,235,19,8};

        Q6.Difference correctDiff = new Q6.Difference(11, 12, 1);
        Q6.Difference correctDiff2 = new Q6.Difference(11, 8, 3);

        assertEquals(correctDiff, Q6.getMinDifference(array1, array2));
        assertEquals(correctDiff2, Q6.getMinDifference(array3, array4));
    }
}
