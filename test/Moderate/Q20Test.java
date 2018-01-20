package Moderate;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nicolas on 20/1/2018.
 */
public class Q20Test {

    @Test
    public void testQ20() throws Exception {
        ArrayList<String> dictionary = new ArrayList<>();
        dictionary.add("tree");
        dictionary.add("used");
        dictionary.add("hello");
        dictionary.add("mam");
        dictionary.add("no");

        Q20 q20 = new Q20(dictionary);

        assertEquals(2, q20.t9Suggestion("8733").size());
        assertTrue( q20.t9Suggestion("8733").contains("tree"));
        assertTrue( q20.t9Suggestion("8733").contains("used"));
        assertTrue( q20.t9Suggestion("43556").contains("hello"));
        assertTrue( q20.t9Suggestion("626").contains("mam"));
        assertTrue( q20.t9Suggestion("66").contains("no"));

    }
}