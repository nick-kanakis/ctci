package Sorting_Searching;

import Sorting_Searching.Q10.Q10;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 5/1/2018.
 */
public class Q10Test {

    @Test
    public void testRankFromStream() throws Exception {
        List<Integer> stream = new ArrayList<>();

        stream.add(5);
        stream.add(1);
        stream.add(4);
        stream.add(4);
        stream.add(5);
        stream.add(9);
        stream.add(7);
        stream.add(13);
        stream.add(3);
        stream.add(13);

        for (Integer integer : stream) {
            Q10.track(integer);
        }

        assertEquals(8, Q10.getRankOfNumber(9));
        assertEquals(10, Q10.getRankOfNumber(13));
        assertEquals(6, Q10.getRankOfNumber(5));
        assertEquals(4, Q10.getRankOfNumber(4));
        assertEquals(2, Q10.getRankOfNumber(3));

    }
}
