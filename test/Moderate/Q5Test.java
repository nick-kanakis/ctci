package Moderate;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 14/1/2018.
 */
public class Q5Test {

    @Test
    public void testFactorialZeros() throws Exception {

        assertEquals(0, Q5.factorialZeros(4));
        assertEquals(1, Q5.factorialZeros(9));
        assertEquals(2, Q5.factorialZeros(11));
        assertEquals(3, Q5.factorialZeros(16));
    }
}
