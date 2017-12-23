package Recursion_DynamicProgramming;

import java.util.Arrays;

/**
 * The time complexity for countPossibleSteps & countPossibleStepsSecondSolution is O(3^n) we can do better
 * if we use functional programming and memoization.
 */
public class Q1 {

    public static int countPossibleSteps(int totalSteps) {
        return countPossibleStepsRecursive(0, totalSteps);
    }

    private static int countPossibleStepsRecursive(int stepsSoFar, int totalSteps) {
        if (stepsSoFar == totalSteps)
            return 1;
        if (stepsSoFar > totalSteps)
            return 0;

        return countPossibleStepsRecursive(stepsSoFar + 1, totalSteps) +
                countPossibleStepsRecursive(stepsSoFar + 2, totalSteps) +
                countPossibleStepsRecursive(stepsSoFar + 3, totalSteps);
    }

    public static int countPossibleStepsSecondSolution(int totalSteps) {
        if (totalSteps < 0)
            return 0;
        else if (totalSteps == 0)
            return 1;
        else
            return countPossibleStepsSecondSolution(totalSteps - 1) +
                    countPossibleStepsSecondSolution(totalSteps - 2) +
                    countPossibleStepsSecondSolution(totalSteps - 3);
    }

    public static int countPossibleStepsMemoization(int totalSteps) {
        int[] cache = new int[totalSteps + 1];
        Arrays.fill(cache, -1);
        return countPossibleStepsRecursiveMemoization(0, totalSteps, cache);
    }

    private static int countPossibleStepsRecursiveMemoization(int stepsSoFar, int totalSteps, int[] cache) {
        if (stepsSoFar == totalSteps)
            return 1;
        if (stepsSoFar > totalSteps)
            return 0;

        if(cache[stepsSoFar]==-1){
            cache[stepsSoFar] = countPossibleStepsRecursiveMemoization(stepsSoFar + 1, totalSteps, cache) +
                    countPossibleStepsRecursiveMemoization(stepsSoFar + 2, totalSteps, cache) +
                    countPossibleStepsRecursiveMemoization(stepsSoFar + 3, totalSteps, cache);
        }

        return cache[stepsSoFar];

    }
}
