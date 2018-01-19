package Moderate;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 18/1/2018.
 */
public class Q17Test {

    @Test
    public void testMaxContiguousSequence() throws Exception {
        int[] input = new int[]{2, -8, 3, -2, 4, -10};
        assertEquals(5, Q17.maxContiguousSequence(input));
    }
}
