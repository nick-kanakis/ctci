package Moderate;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 21/1/2018.
 */
public class Q26Test {

    @Test
    public void testExpression2List() throws Exception {
        assertEquals(23.5, Q26.calculate("2*3+5/6*3+15"));
        assertEquals(30.5, Q26.calculate("2*4*4-12/4/2"));
    }
}
