package Moderate;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 15/1/2018.
 */
public class Q7Test {

    @Test
    public void testfindMax() throws Exception {
        assertEquals(10, Q7.findMax(3,10));
        assertEquals(10, Q7.findMax(10,7));
    }
}
