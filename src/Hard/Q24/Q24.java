package Hard.Q24;

/**
 * For every combination of 2 rows, find create a array with the sum of all columns withing the 2 rows.
 * <p>
 * eg:
 * 1, 2, 3, 4
 * 0, 1, 1, 1
 * -1,-2, 1, 2
 * 5, 3, 2, 1
 * <p>
 * For rowA = 1 & rowB =2 create the sum of all columns in a array
 * So:
 * 0, 1, 1, 1
 * + -1,-2, 1, 2
 * --------------
 * -1, 3, 1, 3
 * <p>
 * <p>
 * From the following array find the max continues sum (Q16.17 for more)
 * in this case {3,1,3}
 * <p>
 * This means that for rows 1,2 the max sub-matrix is within columns 1,3.
 */
public class Q24 {

    public static SubMatrix getMaxSubArray(int[][] matrix) {

        SubMatrix maxSubMatrix = new SubMatrix(0, 0, 0, 0, 0);

        //iterate every possible combination of rows
        for (int rowA = 0; rowA < matrix.length; rowA++) {
            for (int rowB = 0; rowB < matrix.length; rowB++) {
                //Calculate sum of all columns within rowA, rowB
                int[] sumOfColumns = calculateSumOfColumnsBetweenRows(rowA, rowB, matrix);
                //Calculate the max sequence in above array
                RunningMaxHelper runningMaxHelper = calculateRunningMax(sumOfColumns);
                //Setup the tmp matrix
                SubMatrix tmpSubMatrix = new SubMatrix(runningMaxHelper.columnA, runningMaxHelper.columnB, rowA, rowB, runningMaxHelper.sum);
                if(maxSubMatrix.lessThan(tmpSubMatrix)){
                    maxSubMatrix = tmpSubMatrix;
                }
            }
        }

        return maxSubMatrix;
    }

    private static int[] calculateSumOfColumnsBetweenRows(int rowA, int rowB, int[][] matrix) {
        int[] sumOfColumns = new int[matrix[0].length];

        for (int column = 0; column < matrix[0].length; column++) {
            int currentColumnSum = 0;
            for (int row = rowA; row <= rowB; row++) {
                currentColumnSum += matrix[row][column];
            }
            sumOfColumns[column] = currentColumnSum;
        }
        return sumOfColumns;
    }

    private static RunningMaxHelper calculateRunningMax(int[] sumOfColumns) {
        int maxSum = -1;
        int maxStart = -1;
        int maxEnd = -1;
        int currentStart = -1;
        int currentSum = 0;

        for (int i = 0; i < sumOfColumns.length; i++) {
            if (currentStart == -1) {
                currentStart = i;
            }
            currentSum += sumOfColumns[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxStart = currentStart;
                maxEnd = i;
            } else if (currentSum < 0) {
                currentStart = -1;
                currentSum = 0;
            }
        }

        return new RunningMaxHelper(maxStart, maxEnd, maxSum);
    }
}
