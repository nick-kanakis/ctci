package Sorting_Searching.Q9;

/**
 * 1) Find the first element in the diagonal that is greater than target. Everything in the 4th quadrant is greater than the target
 *    This means that we do not need to search this quadrant.
 * 2) Recursively we search the 3 other quadrants in the same way.
 */
public class Q9 {

    public static Coordinate findElement(int[][] matrix, int target) {
        Coordinate upperDiagonal = new Coordinate(0, 0);
        Coordinate lowerDiagonal = new Coordinate(matrix.length - 1, matrix[0].length - 1);
        return findElement(matrix, target, upperDiagonal, lowerDiagonal);
    }

    private static Coordinate findElement(int[][] matrix, int target, Coordinate upperDiagonal, Coordinate lowerDiagonal) {
        /*Check if coordinates are valid*/
        if (!upperDiagonal.checkValidity(matrix) || !lowerDiagonal.checkValidity(matrix))
            return null;

        /*Check if the 2 Coordinates hit the target value*/
        if (target == matrix[upperDiagonal.row][upperDiagonal.column])
            return upperDiagonal;


        /*Check that upperDiagonal < lowerDiagonal !!THIS SHOULD BE DONE IN EVERY BINARY SEARCH!!!*/
        if (!upperDiagonal.isBefore(lowerDiagonal))
            return null;

        /* Create the start and end Coordinates for the binary search.
        Since the array is not square you need to calculate the diagonal dinstance.*/
        Coordinate start = (Coordinate) upperDiagonal.clone();
        int diagonalDistance = Math.min(lowerDiagonal.row - upperDiagonal.row, lowerDiagonal.column - upperDiagonal.column);
        Coordinate end = new Coordinate(start.row + diagonalDistance, start.column + diagonalDistance);

        /*Binary Search on the diagonal looking for the first Coordinate that is > target, this Coordinate is called pivot*/
        Coordinate pivot = new Coordinate(0,0);
        while (start.isBefore(end)) {
            pivot = calculateAverageCoordinate(start, end);
            if (matrix[pivot.row][pivot.column] < target) {
                //If pivot is less than the target move start to next diagonal Coordinate of pivot
                start.row = pivot.row + 1;
                start.column = pivot.column + 1;
            } else {
                //If pivot is greater that the target move the end to the previous diagonal Coordinate of pivot
                end.row = pivot.row - 1;
                end.column = pivot.column - 1;
            }
        }

        return partitionAndSearch(matrix, target, upperDiagonal, lowerDiagonal, pivot);

    }

    private static Coordinate calculateAverageCoordinate(Coordinate start, Coordinate end) {
        int row = (start.row + end.row) / 2;
        int column = (start.column + end.column) / 2;

        return new Coordinate(row, column);
    }

    private static Coordinate partitionAndSearch(int[][] matrix, int target, Coordinate upperDiagonal, Coordinate lowerDiagonal, Coordinate pivot) {

        Coordinate lowerLeftUpperDiagonal = new Coordinate(pivot.row, upperDiagonal.column);
        Coordinate lowerLeftLowerDiagonal = new Coordinate(lowerDiagonal.row, pivot.column - 1);
        Coordinate upperRightUpperDiagonal = new Coordinate(upperDiagonal.row, pivot.column);
        Coordinate upperRightLowerDiagonal = new Coordinate(pivot.row - 1, lowerDiagonal.column);
        Coordinate upperLeftUpperDiagonal = new Coordinate(0,0);
        Coordinate upperLeftLowerDiagonal = new Coordinate(pivot.row - 1, pivot.column - 1);

        Coordinate result = findElement(matrix, target, lowerLeftUpperDiagonal, lowerLeftLowerDiagonal);
        if (result == null)
            result =  findElement(matrix, target, upperRightUpperDiagonal, upperRightLowerDiagonal);
        else if(result == null)
            result =  findElement(matrix, target, upperLeftUpperDiagonal, upperLeftLowerDiagonal);
        return result;
    }


}
