package Recursion_DynamicProgramming;

import java.util.ArrayList;

/**
 * Created by Nicolas on 28/12/2017.
 */
public class Q12 {

    private static final int GRID_SIZE = 8;

    public static void placeQueens(int row, Integer[] columns, ArrayList<Integer[]> results){
            if(row == GRID_SIZE){
                //found valid placement
                results.add(columns.clone());
            } else {
                for (int col = 0; col < GRID_SIZE; col++) {
                    if(checkValid(columns, row, col)){
                        columns[row] = col;
                        placeQueens(row+1, columns, results);
                    }
                }
            }
    }

    private static boolean checkValid(Integer[] columns, int row1, int column1) {
        for (int row2 = 0; row2 < row1; row2++) {
            int column2 = columns[row2];
			/* Check if (row2, column2) invalidates (row1, column1) as a queen spot. */

			/* Check if rows have a queen in the same column */
            if (column1 == column2) {
                return false;
            }

			/* Check diagonals: if the distance between the columns equals the distance
			 * between the rows, then they’re in the same diagonal. */
            int columnDistance = Math.abs(column2 - column1);
            int rowDistance = row1 - row2; // row1 > row2, so no need to use absolute value
            if (columnDistance == rowDistance) {
                return false;
            }
        }
        return true;
    }
}
