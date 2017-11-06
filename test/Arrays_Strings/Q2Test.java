package Arrays_Strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 6/11/2017.
 */
public class Q2Test {

    @Test
    public void testIsPermutation(){
        assertTrue(Q2.isPermutation("abcdddefg", "gfeabcddd"));
        assertFalse(Q2.isPermutation("abcdddefg", "gfeabcdd"));
    }

    @Test
    public void testIsPermutationWithExtraDS(){
        assertTrue(Q2.isPermutationWithExtraDS("abcdddefg", "gfeabcddd"));
        assertFalse(Q2.isPermutationWithExtraDS("abcdddefg", "gfeabcdd"));
    }
}
