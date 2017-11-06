package Arrays_Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicolas on 7/11/2017.
 */
public class Q8 {

    /*
    * Iterate the array and mark every column/row that has 0.
    *
    * Then insert 0s in every column/row is marked in the previous step.
    * */
    public static int[][] zeroMatrix(int[][] input) {
        //TODO: check input for null
        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();

        //SOS how to iterate a 2D array
        for (int i = 0; i < input.length; i++) {

            for (int j = 0; j < input[0].length; j++) {
                if (input[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for (int row : rows) {
            nullifyRow(input, row);
        }

        for (int column : columns) {
            nullifyColumn(input, column);
        }

        return input;
    }

    private static void nullifyRow(int[][] input, int row) {
        for (int i = 0; i < input.length; i++) {
            input[row][i] = 0;
        }
    }

    private static void nullifyColumn(int[][] input, int column) {
        for (int i = 0; i < input[0].length; i++) {
            input[i][column] = 0;
        }
    }

    /*
    * In order to avoid using extra DS (the 2 lists) we can same the 0s of columns in the first row. and the 0s in rows
    * in the first column.
    *
    * We will first have to check if first row/column have any 0 in order to clear them afterwords.
    * Then iterate the matrix, if you find a 0 put mark the first row/column accordingly.
    * Then we will insert the zeros in all columns and rows (except the first column/row) according to the 0s in the previous step.
    *
    * */
    public static int[][] zeroMatrixWithoutExtraDS(int[][] input) {
        boolean firstColumnContainsZero = false;
        boolean firstRowContainsZero = false;

        //Check first row if it contains zero
        for (int i = 0; i < input[0].length; i++) {
            if (input[0][i] == 0){
                firstRowContainsZero = true;
                break;
            }
        }

        //Check first column if it contains zero
        for (int i = 0; i < input.length; i++) {
            if (input[i][0] == 0) {
                firstColumnContainsZero = true;
                break;
            }
        }

        for (int i = 1; i < input.length; i++) {
            for (int j = 1; j < input[0].length; j++) {
                if (input[i][j] == 0) {
                    input[i][0] = 0;
                    input[0][j] = 0;
                }
            }
        }

        //nullify rows
        for (int i = 1; i < input.length; i++) {
            if (input[i][0] == 0)
                nullifyRow(input, i);
        }
        //nullify column
        for (int i = 1; i < input[0].length; i++) {
            if (input[0][i] == 0)
                nullifyColumn(input, i);
        }

        if (firstColumnContainsZero)
            nullifyColumn(input, 0);

        if (firstRowContainsZero)
            nullifyRow(input, 0);
        return input;
    }
}
