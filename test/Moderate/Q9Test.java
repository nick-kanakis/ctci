package Moderate;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 15/1/2018.
 */
public class Q9Test {

    @Test
    public void testMultiply() throws Exception {
        assertEquals(15, Q9.multiply(3,5));
        assertEquals(-6, Q9.multiply(-3,2));
        assertEquals(-6, Q9.multiply(2,-3));
        assertEquals(6, Q9.multiply(-2,-3));
        assertEquals(24, Q9.multiply(12,2));
    }

    @Test
    public void testDivide() throws Exception{
        assertEquals(5, Q9.divide(15,3));
        assertEquals(6, Q9.divide(13,2));
        assertEquals(3, Q9.divide(-15,-5));
        assertEquals(-3, Q9.divide(-15,5));
    }

    @Test
    public void testSubtract() throws Exception{
        assertEquals(12, Q9.subtract(15,3));
        assertEquals(-11, Q9.subtract(2,13));
    }
}
