package Arrays_Strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 6/11/2017.
 */
public class Q5Test {

    @Test
    public void testIsEditedAtLeastOneTime(){
        assertTrue(Q5.isEditedAtLeastOneTime("pole", "pale"));
        assertTrue(Q5.isEditedAtLeastOneTime("pale","ple"));
        assertTrue(Q5.isEditedAtLeastOneTime("pale","paile"));
        assertFalse(Q5.isEditedAtLeastOneTime("pale","piles"));
        assertFalse(Q5.isEditedAtLeastOneTime("pale","bile"));
    }
}
