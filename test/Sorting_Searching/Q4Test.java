package Sorting_Searching;

import Sorting_Searching.Q4.Listy;
import Sorting_Searching.Q4.Q4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 3/1/2018.
 */
public class Q4Test {
    @Test
    public void testSearch() throws Exception {
        Listy list = new Listy(200);
        assertEquals(123, Q4.search(list, 246));
    }
}
