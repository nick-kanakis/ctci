package Sorting_Searching;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 2/1/2018.
 */
public class Q3Test {
    @Test
    public void testSearch() throws Exception {
        int[] input = new int[]{10,11,12,13,14,15,16,1,2,3,4,5};
        int[] inputDup = new int[]{10,11,12,13, 13, 13, 13, 14,15,16,1,2,3,4,5,5,5,5};

        assertEquals(9,Q3.search(input,3));
        assertEquals(2,Q3.search(input,12));
        assertEquals(12,Q3.search(inputDup,3));
        assertEquals(2,Q3.search(inputDup,12));
    }
}
