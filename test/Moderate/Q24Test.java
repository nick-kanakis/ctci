package Moderate;

import Moderate.Q24.Pair;
import Moderate.Q24.Q24;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nicolas on 20/1/2018.
 */
public class Q24Test {

    @Test
    public void testFindPairs() throws Exception {
        int[] input = new int[]{1, 2, 3, 8, 2, 4};

        ArrayList<Pair> pairs1 = Q24.findPairs(input, 3);
        assertEquals(1, pairs1.size());
        assertTrue(pairs1.contains(new Pair(1,2)));
        ArrayList<Pair> pairs2 = Q24.findPairs(input, 4);
        assertEquals(2, pairs2.size());
        assertTrue(pairs2.contains(new Pair(1,3)));
        assertTrue(pairs2.contains(new Pair(2,2)));
    }
}
