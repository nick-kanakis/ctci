package Recursion_DynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 26/12/2017.
 */
public class Q8Test {

    @Test
    public void testFindEveryPermutation() throws Exception {
        assertEquals(1, Q8.findEveryPermutation("aaaaaa").size());
        assertEquals(3, Q8.findEveryPermutation("aab").size());
    }
}
