package Recursion_DynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 24/12/2017.
 */
public class Q3Test {

    @Test
    public void testFindMagicIndex() throws Exception {
        int[]array1 = new int[]{-1, 1, 3, 4, 5, 6, 7, 10};
        int[]array2 = new int[]{-1, 0, 1, 2, 3, 5, 8};
        int[]arrayDuplicates = new int[]{-1,0,0,2,5,5,5,5};

        assertEquals(1, Q3.findMagicIndex(array1));
        assertEquals(5, Q3.findMagicIndex(array2));
        assertEquals(5, Q3.findMagicIndexWithDuplicates(arrayDuplicates));
    }
}
