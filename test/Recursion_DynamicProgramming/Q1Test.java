package Recursion_DynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 23/12/2017.
 */

public class Q1Test {

    @Test
    public void testCountPossibleSteps() throws Exception {
        assertEquals(4, Q1.countPossibleSteps(3));
        assertEquals(13, Q1.countPossibleSteps(5));

        assertEquals(4, Q1.countPossibleStepsSecondSolution(3));
        assertEquals(13, Q1.countPossibleStepsSecondSolution(5));

        assertEquals(4, Q1.countPossibleStepsMemoization(3));
        assertEquals(13, Q1.countPossibleStepsMemoization(5));
    }
}
