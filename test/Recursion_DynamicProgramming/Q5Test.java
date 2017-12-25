package Recursion_DynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 25/12/2017.
 */
public class Q5Test {

    @Test
    public void testMultiplyRecursively() throws Exception {
        assertEquals(24, Q5.multiplyRecursively(3,8));
        assertEquals(35, Q5.multiplyRecursively(7,5));

        assertEquals(24, Q5.multiplyRecursivelyBookSolution(3,8));
        assertEquals(35, Q5.multiplyRecursivelyBookSolution(7,5));
    }
}
