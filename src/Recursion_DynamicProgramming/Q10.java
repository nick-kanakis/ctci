package Recursion_DynamicProgramming;

/**
 * Created by Nicolas on 26/12/2017.
 */
public class Q10 {

        public static boolean paintFill(int[][] screen, int row, int column, int newColor){
            return paintFill(screen, row, column, newColor, screen[row][column]);
        }

    private static boolean paintFill(int[][] screen, int row, int column, int newColor, int originalColumn) {
        if(!validateCoordinates(row, column, screen.length, screen[0].length))
            return false;

        if(screen[row][column] == originalColumn){
            screen[row][column] = newColor;
            paintFill(screen, row-1, column-1, newColor, originalColumn);
            paintFill(screen, row+1, column+1, newColor, originalColumn);
            paintFill(screen, row-1, column+1, newColor, originalColumn);
            paintFill(screen, row+1, column-1, newColor, originalColumn);
            paintFill(screen, row-1, column, newColor, originalColumn);
            paintFill(screen, row, column+1, newColor, originalColumn);
            paintFill(screen, row+1, column, newColor, originalColumn);
            paintFill(screen, row, column-1, newColor, originalColumn);
        }
        return true;
    }

    private static boolean validateCoordinates(int row, int column, int maxRows, int maxColumns) {
        if(row <0 || column <0)
            return false;
        if(row>maxRows || column> maxColumns)
            return false;
        return true;
    }

}
