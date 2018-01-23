package Hard;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 22/1/2018.
 */
public class Q4Test {

    @Test
    public void testFindMissingNumber() throws Exception {
        String[] input = new String[]{
                "0",
                "1",
                "10",
                "11",
                "100",
                "101",
                "111"
        };

        assertEquals("110", Q4.findMissingNumber(input));
    }
}
