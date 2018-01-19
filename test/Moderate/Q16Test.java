package Moderate;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 18/1/2018.
 */
public class Q16Test {

    @Test
    public void testSubSort() throws Exception {
        int[] input = new int[]{1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
        int[] startEndPoints = Q16.subSort(input);

        assertEquals(3, startEndPoints[0]);
        assertEquals(9, startEndPoints[1]);
    }
}
