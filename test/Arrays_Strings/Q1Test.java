package Arrays_Strings;


import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertFalse;

/**
 * Created by Nicolas on 6/11/2017.
 */
public class Q1Test {

    @Test
    public void testIsUnique(){
        assertTrue(Q1.isUnique("abctefghi"));
        assertFalse(Q1.isUnique("abcteffghit"));
    }

    @Test
    public void testIsUniqueWithoutExtraDS(){
        assertTrue(Q1.isUniqueWithoutExtraDS("abctefghi"));
        assertFalse(Q1.isUniqueWithoutExtraDS("abcteffghit"));
    }

}
