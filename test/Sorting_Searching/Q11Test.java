package Sorting_Searching;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nicolas on 5/1/2018.
 */
public class Q11Test {


    @Test
    public void testSortPeakAndValleys() throws Exception {
        Integer[] input1 = new Integer[]{5,8,6,2,3,4,6};
        Integer[] input2 = new Integer[]{5,3,1,2,3};

        Q11.sortPeaksAndValleys(input1);
        Q11.sortPeaksAndValleys(input2);

        for (int i = 0; i < input1.length - 1; i++) {
            if(i%2 == 0){
                assertTrue(input1[i]>= input1[i+1]);
            } else {
                assertTrue(input1[i]< input1[i+1]);
            }
        }

        for (int i = 0; i < input2.length - 1; i++) {
            if(i%2 == 0){
                assertTrue(input2[i]>= input2[i+1]);
            } else {
                assertTrue(input2[i]< input2[i+1]);
            }
        }
    }

    @Test
    public void testSortPeakAndValleysBooksSolution() throws Exception {
        Integer[] input = new Integer[]{5,3,1,2,3};

        Q11.sortPeaksAndValleysBookSolution(input);

        for (int i = 0; i < input.length - 1; i++) {
            if(i%2 == 0){
                assertTrue(input[i]>= input[i+1]);
            } else {
                assertTrue(input[i]< input[i+1]);
            }
        }
    }
}
