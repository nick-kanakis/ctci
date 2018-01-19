package Moderate;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nicolas on 18/1/2018.
 */
public class Q18Test {

    @Test
    public void testPatternMatching() throws Exception {
        assertTrue(Q18.patternMatching("a", "CATCATGOCATGO"));
        assertTrue(Q18.patternMatching("b", "CATCATGOCATGO"));
        assertTrue(Q18.patternMatching("ab", "CATCATGOCATGO"));
        assertTrue(Q18.patternMatching("aabab", "CATCATGOCATGO"));
        assertFalse(Q18.patternMatching("aabab", "CATCATGOICATGO"));
        assertFalse(Q18.patternMatching("aabab", "CATTCATTGOCATGO"));
    }
}
