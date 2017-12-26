package Recursion_DynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 26/12/2017.
 */
public class Q9Test {

    @Test
    public void testGenerateParenthesesSlowSolution() throws Exception {
        assertEquals(5, Q9.generateParenthesesSlowSolution(3).size());
        assertEquals(5, Q9.generateParentheses(3).size());
    }
}
