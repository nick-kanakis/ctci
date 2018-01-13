package Moderate;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 13/1/2018.
 */
public class Q1Test {

    @Test
    public void testSwapInPlace() throws Exception {

        Q1.Pair pair1 = new Q1.Pair(3, 7);
        Q1.Pair pair2 = new Q1.Pair(6, 2);
        Q1.Pair pair3 = new Q1.Pair(-3, -7);
        Q1.Pair pair4 = new Q1.Pair(-6, -2);
        Q1.Pair pair5 = new Q1.Pair(3, -2);
        Q1.Pair pair6 = new Q1.Pair(-3, 2);

        Q1.Pair result = Q1.swapInPlace(pair1);
        assertTrue(pair1.a == result.b && pair1.b == result.a);
        result = Q1.swapInPlace(pair2);
        assertTrue(pair2.a == result.b && pair2.b == result.a);
        result = Q1.swapInPlace(pair3);
        assertTrue(pair3.a == result.b && pair3.b == result.a);
        result = Q1.swapInPlace(pair4);
        assertTrue(pair4.a == result.b && pair4.b == result.a);
        result = Q1.swapInPlace(pair5);
        assertTrue(pair5.a == result.b && pair5.b == result.a);
        result = Q1.swapInPlace(pair6);
        assertTrue(pair6.a == result.b && pair6.b == result.a);

    }
}
