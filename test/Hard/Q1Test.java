package Hard;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 21/1/2018.
 */
public class Q1Test {

    @Test
    public void testAdd() throws Exception {
        assertEquals(5, Q1.add(2, 3));
        assertEquals(15, Q1.add(12, 3));
        assertEquals(41, Q1.add(20, 21));
    }
}
