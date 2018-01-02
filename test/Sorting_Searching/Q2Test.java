package Sorting_Searching;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 2/1/2018.
 */
public class Q2Test {

    @Test
    public void testGroupAnagrams() throws Exception {
        String[] anagrams = new String[]{"abc", "ert", "kill", "rte", "llik", "etr", "mon", "likl", "nom", "bca"};
        String[] results = new String[]{"abc", "bca","kill", "llik", "likl", "ert", "rte", "etr",  "mon", "nom"};

        Q2.groupAnagrams(anagrams);

        assertTrue(Arrays.equals(anagrams, results));
    }
}
