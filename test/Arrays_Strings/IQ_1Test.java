package Arrays_Strings;


import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertFalse;

/**
 * Created by Nicolas on 6/11/2017.
 */
public class IQ_1Test {

    @Test
    public void testIsUnique(){
        assertTrue(IQ_1.isUnique("abctefghi"));
        assertFalse(IQ_1.isUnique("abcteffghit"));
    }

    @Test
    public void testIsUniqueWithoutExtraDS(){
        assertTrue(IQ_1.isUniqueWithoutExtraDS("abctefghi"));
        assertFalse(IQ_1.isUniqueWithoutExtraDS("abcteffghit"));
    }

}
