package Sorting_Searching;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 3/1/2018.
 */
public class Q5Test {

    @Test
    public void testSearchSparseArray() throws Exception {
        String[] input = new String[]{"at","","","","ball","","","car","","","dad","",""};

        assertEquals(4, Q5.searchSparseArray(input, "ball"));
        assertEquals(0, Q5.searchSparseArray(input, "at"));
        assertEquals(-1, Q5.searchSparseArray(input, "daddy"));
    }
}
