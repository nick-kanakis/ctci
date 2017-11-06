package Arrays_Strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 6/11/2017.
 */
public class Q4Test {
    @Test
    public void testIsPalindrome() {
        assertTrue(Q4.isPalindrome("tacocat"));
        assertTrue(Q4.isPalindrome("tacocato"));
        assertFalse(Q4.isPalindrome("tacocati"));
    }

    @Test
    public void testIsPalindromeWithoutExtraDS() {
        assertTrue(Q4.isPalindromeWithoutExtraDS("tacocat"));
        assertTrue(Q4.isPalindromeWithoutExtraDS("tacocato"));
        assertFalse(Q4.isPalindromeWithoutExtraDS("tacocati"));
    }
}
