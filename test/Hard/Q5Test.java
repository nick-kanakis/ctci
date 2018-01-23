package Hard;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 22/1/2018.
 */
public class Q5Test {

    @Test
    public void testMaxSubset() throws Exception {
        char[] input = new char[]{
                'A','B','A','A','A','A','B','B','B','A','B','B','B','B','A','A','B'
        };

        char[] result = Q5.maxSubset(input);

        assertEquals(6, result.length);

        for (int i = 0; i < result.length / 2; i++) {
            assertEquals('A', result[i]);
        }

        for (int i = 3; i < result.length ; i++) {
            assertEquals('B', result[i]);
        }
    }
}
