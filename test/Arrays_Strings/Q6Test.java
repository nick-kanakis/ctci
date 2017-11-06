package Arrays_Strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 6/11/2017.
 */
public class Q6Test {

    @Test
    public void testCompress() throws Exception {
        String result = Q6.compress("aabccccaaa");
        assertEquals("a2b1c4a3",result);

        result = Q6.compress("abcde");
        assertEquals("abcde",result);

    }
}
