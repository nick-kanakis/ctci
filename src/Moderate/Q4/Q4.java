package Moderate.Q4;

/**
 * It is relatively easy to check if 3x3 grid has a winning combination you need to check the row, column, diagonal and antidiagonal
 * for the last played position. In order to solve an NxN grid we can split the grid into 5 3x3 subgrids.
 *
 * Taking as a point of reference the last played cell we create an upper left, upper right, lower left, lower right and center
 * 3x3 subgrid and check if there is a winning combination in each.
 */
public class Q4 {

    public static boolean hasWon(Cell[][] grid, Point lastPlayedCell) {
        //Check the surround cells (first the above then the below and if not a win check the next of the above etc...)

        if (!inBound(lastPlayedCell, grid))
            return false;

        TickTackToeValue playerValue = grid[lastPlayedCell.getRow()][lastPlayedCell.getColumn()].value;

        //Check Upper Left 3 x 3 Subgrid
        if (check3x3subgrid(grid, lastPlayedCell, new Point(lastPlayedCell.getRow() - 2, lastPlayedCell.getColumn() - 2), playerValue))
            return true;

        //Check middle 3 x 3 Subgrid
        if (check3x3subgrid(grid, lastPlayedCell, new Point(lastPlayedCell.getRow() - 1, lastPlayedCell.getColumn() - 1), playerValue))
            return true;

        //Check Upper Right 3 x 3 Subgrid
        if (check3x3subgrid(grid, lastPlayedCell, new Point(lastPlayedCell.getRow() - 2, lastPlayedCell.getColumn()), playerValue))
            return true;

        //Check lower left 3 x 3 Subgrid
        if (check3x3subgrid(grid, lastPlayedCell, new Point(lastPlayedCell.getRow(), lastPlayedCell.getColumn() - 2), playerValue))
            return true;

        //Check lower right 3 x 3 Subgrid
        if (check3x3subgrid(grid, lastPlayedCell, new Point(lastPlayedCell.getRow(), lastPlayedCell.getColumn()), playerValue))
            return true;

        return false;
    }

    /*Given the upper right point of the 3x3 subgrid the functions returns if there is a winning combination for given playerValue*/
    private static boolean check3x3subgrid(Cell[][] grid, Point lastPlayedCell, Point upperLeftPoint, TickTackToeValue playerValue) {

        //check if upperLeftPoint is withing the grid
        if (!inBound(upperLeftPoint, grid))
            return false;

        if (checkRow(grid, upperLeftPoint, playerValue, lastPlayedCell.getRow()))
            return true;

        if (checkColumn(grid, upperLeftPoint, playerValue, lastPlayedCell.getColumn()))
            return true;

        if (checkDiagonal(grid, upperLeftPoint, playerValue))
            return true;

        if (checkAntidiagonal(grid, upperLeftPoint, playerValue))
            return true;


        return false;
    }


    private static boolean inBound(Point upperRightPoint, Cell[][] grid) {
        if (upperRightPoint.getColumn() < 0 || upperRightPoint.getRow() < 0)
            return false;

        if (upperRightPoint.getRow() >= grid.length)
            return false;

        if (upperRightPoint.getColumn() >= grid[0].length)
            return false;

        return true;
    }

    private static boolean checkRow(Cell[][] grid, Point upperLeftPoint, TickTackToeValue playerValue, int row) {

        for (int tmpColumn = upperLeftPoint.getColumn(); tmpColumn <= upperLeftPoint.getColumn() + 2; tmpColumn++) {
            if (grid[row][tmpColumn].value != playerValue)
                return false;
        }

        return true;
    }

    private static boolean checkColumn(Cell[][] grid, Point upperLeftPoint, TickTackToeValue playerValue, int column) {
        for (int tmpRow = upperLeftPoint.getRow(); tmpRow <= upperLeftPoint.getRow() + 2; tmpRow++) {
            if (grid[tmpRow][column].value != playerValue)
                return false;
        }
        return false;
    }

    private static boolean checkDiagonal(Cell[][] grid, Point upperLeftPoint, TickTackToeValue playerValue) {
        for (int i = 0; i < 3; i++) {
            if (grid[upperLeftPoint.getRow() + i][upperLeftPoint.getColumn() + i].value != playerValue)
                return false;
        }
        return true;
    }

    private static boolean checkAntidiagonal(Cell[][] grid, Point upperLeftPoint, TickTackToeValue playerValue) {

        if (grid[upperLeftPoint.getRow() + 1][upperLeftPoint.getColumn() + 1].value != playerValue)
            return false;
        if (grid[upperLeftPoint.getRow()][upperLeftPoint.getColumn() + 2].value != playerValue)
            return false;
        if (grid[upperLeftPoint.getRow()+ 2][upperLeftPoint.getColumn() ].value != playerValue)
            return false;

        return true;
    }


}
