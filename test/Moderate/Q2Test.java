package Moderate;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 14/1/2018.
 */
public class Q2Test {

    @Test
    public void testFrequencyOfWord() throws Exception {
        Q2 q2 = new Q2();

        String[] input = {"Here", "you", "are", "how", "are", "you", "Nick", "today"};

        q2.scanDocument(input);


        assertEquals(0.0, q2.frequencyOfWord("George"));
        assertEquals(0.125, q2.frequencyOfWord("Here"));
        assertEquals(0.25, q2.frequencyOfWord("you"));
    }
}
