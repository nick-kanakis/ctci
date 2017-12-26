package Recursion_DynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 25/12/2017.
 */
public class Q7Test {

    @Test
    public void testFindEveryPermutation() throws Exception {
        assertEquals(24, Q7.findEveryPermutation("ABCD").size());
        assertEquals(120, Q7.findEveryPermutation("ABCDE").size());
    }
}
