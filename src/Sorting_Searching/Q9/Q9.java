package Sorting_Searching.Q9;

/**
 * 1) Find the FIRST element in the diagonal that is greater than X that is called a pivot. Everything in the 4th quadrant is greater
 *    than the X. This means that we do not need to search this quadrant, also everything in the 1st quadrant is also
 *    smaller than X, so we do not have to search this one either.
 * 2) Recursively we search the 2 other quadrants (2nd and 3rd) in the same way.
 *
 * The key point here is to understand that the first diagonal element that is greater tha X means 2 things:
 * 1) All elements in the upper left quadrant (marked by the pivot element) are smaller than X.
 * 2) All elements in the lower right quadrant (marked by the pivot element) are greater than X.
 *
 *  (1) + (2) = X is not in the upper left or lower right quadrant!! search the other 2.
 *
 */
public class Q9 {

    public static Coordinate partitionAndSearch(int[][] matrix, Coordinate origin, Coordinate dest, Coordinate pivot, int x) {
        Coordinate lowerLeftOrigin = new Coordinate(pivot.row, origin.column);
        Coordinate lowerLeftDest = new Coordinate(dest.row, pivot.column - 1);
        Coordinate upperRightOrigin = new Coordinate(origin.row, pivot.column);
        Coordinate upperRightDest = new Coordinate(pivot.row - 1, dest.column);

        Coordinate lowerLeft = findElement(matrix, lowerLeftOrigin, lowerLeftDest, x);
        if (lowerLeft == null) {
            return findElement(matrix, upperRightOrigin, upperRightDest, x);
        }
        return lowerLeft;
    }

    public static Coordinate findElement(int[][] matrix, Coordinate origin, Coordinate dest, int x) {
        if (!origin.inbounds(matrix) || !dest.inbounds(matrix)) {
            return null;
        }
        if (matrix[origin.row][origin.column] == x) {
            return origin;
        } else if (!origin.isBefore(dest)) {
            return null;
        }

		/* Set start to start of diagonal and end to the end of the diagonal. Since
		 * the grid may not be square, the end of the diagonal may not equal dest.
		 */
        Coordinate start = (Coordinate) origin.clone();
        int diagDist = Math.min(dest.row - origin.row, dest.column - origin.column);
        Coordinate end = new Coordinate(start.row + diagDist, start.column + diagDist);
        Coordinate p = new Coordinate(0, 0);

		/* Do binary search on the diagonal, looking for the first element greater than x */
        while (start.isBefore(end)) {
            p.setToAverage(start, end);
            if (x > matrix[p.row][p.column]) {
                start.row = p.row + 1;
                start.column = p.column + 1;
            } else {
                end.row = p.row - 1;
                end.column = p.column - 1;
            }
        }

		/* Split the grid into quadrants. Search the bottom left and the top right. */
        return partitionAndSearch(matrix, origin, dest, start, x);
    }

    public static Coordinate findElement(int[][] matrix, int x) {
        Coordinate origin = new Coordinate(0, 0);
        Coordinate dest = new Coordinate(matrix.length - 1, matrix[0].length - 1);
        return findElement(matrix, origin, dest, x);
    }

}
