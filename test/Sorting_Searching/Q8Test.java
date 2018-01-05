package Sorting_Searching;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 3/1/2018.
 */
public class Q8Test {

    @Test
    public void testFindDuplicates() throws Exception {
        int[] input = new int[]{1,2,3,4,5,6,7,8,8,8,9,9,0,1,2,23,23,24,25,26,27,260};

        List<Integer> duplicates = Q8.findDuplicates(input);

        assertTrue(duplicates.contains(8));
        assertTrue(duplicates.contains(9));
        assertTrue(duplicates.contains(1));
        assertTrue(duplicates.contains(2));
        assertTrue(duplicates.contains(23));
        assertEquals(5, duplicates.size());
    }
}
