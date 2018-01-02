package Sorting_Searching;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 2/1/2018.
 */
public class Q1Test {

    @Test
    public void testSortedMerge() throws Exception {
        int[] arr1 = new int[]{3,8,15,0,0,0,0};
        int[] arr2 = new int[]{2,5,7,18};
        Q1.sortedMerge(arr1,arr2);
        int[] result = new int[]{2,3,5,7,8,15,18};
        assertTrue(Arrays.equals(result,arr1));
    }

    @Test
    public void testSortedMergeBookSolution() throws Exception {
        int[] arr1 = new int[]{3,8,15,0,0,0,0};
        int[] arr2 = new int[]{2,5,7,18};
        Q1.sortedMergeBookSolution(arr1,arr2,2, arr2.length -1);
        int[] result = new int[]{2,3,5,7,8,15,18};
        assertTrue(Arrays.equals(result,arr1));
    }
}
