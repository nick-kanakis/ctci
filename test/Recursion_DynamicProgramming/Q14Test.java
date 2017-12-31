package Recursion_DynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 30/12/2017.
 */
public class Q14Test {

    @Test
    public void testCountParenthesesOfBoolean() throws Exception {
        assertEquals(10, Q14.countParenthesesOfBoolean("0&0&0&1^1|0", true));
        assertEquals(2, Q14.countParenthesesOfBoolean("1^0|0|1", false));
    }
}
