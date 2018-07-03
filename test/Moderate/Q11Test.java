package Moderate;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nicolas on 16/1/2018.
 */
public class Q11Test {

    @Test
    public void testDivingBoardsCombinations() throws Exception {
        List<Integer> sizes = Q11.divingBoardsCombinations(5, 5, 10);
        HashSet<Integer> set = new HashSet<>(sizes);

        assertEquals(sizes.size(), set.size());

        for (int size: sizes ) {
            assertTrue(size>=30 && size<=50 && size%5==0);
        }
    }
}
