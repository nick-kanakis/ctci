package Hard;

import Hard.Q15.Q15;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 27/1/2018.
 */
public class Q15Test {
    @Test
    public void testLongestWord() throws Exception {
        String[] input = new String[]{
                "cat",
                "nana",
                "banana",
                "mama",
                "dog",
                "walker",
                "walk",
                "dogwalker",
        };

        assertEquals("dogwalker", Q15.getLongestWord(input));
    }
}
