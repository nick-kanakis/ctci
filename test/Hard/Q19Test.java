package Hard;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 28/1/2018.
 */
public class Q19Test {

    @Test
    public void testMissingNumber() throws Exception {
        int[] input = new int[]{1,8,3,5,7,6,2,9};

        assertEquals(4, Q19.missingNumber(input, 9));
    }
}
