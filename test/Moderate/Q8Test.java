package Moderate;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nicolas on 15/1/2018.
 */
public class Q8Test {

    @Test
    public void testIntToEnglish() throws Exception {
        int input1 = 1123;
        String output1 = " One Thousand One Hundred Twenty Three  ";
        int input2 = 302000;
        String output2 = "Three Hundred Two Thousand   ";

        assertTrue(output1.equals(Q8.intToEnglish(input1)));
        assertTrue(output2.equals(Q8.intToEnglish(input2)));    }
}
