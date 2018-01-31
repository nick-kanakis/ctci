package Hard;

/**
 * Created by Nicolas on 31/1/2018.
 */
public class Q23 {

    public static int maxSquare(String[][] matrix) {
        int maxSquareSize = 0;

        /*At each row find the max line of continues black*/
        for (int i = 0; i < matrix.length; i++) {

            int start = -1;
            int end = -1;
            boolean hasPreviousBlack = false;
            for (int j = 0; j <= matrix[0].length; j++) {
                if ((j != matrix[0].length) && (i != matrix.length) && matrix[i][j].equals("b")) {
                    //If cell is black and start = 0 initialize start
                    if (start == -1) {
                        start = j;
                        hasPreviousBlack = true;
                    }
                } else if (start != -1 && hasPreviousBlack) {

                    /*
                    * If current is white and previous was black this means, that the line of
                    * blacks has ended. For this line calculate the max square, if there is one in the first place.
                    * */
                    end = j - 1;
                    int currentSquareSize = calculateSquareSize(matrix, start, end, i);
                    if (currentSquareSize > maxSquareSize) {
                        maxSquareSize = currentSquareSize;
                    }

                    //clean up the start for marking a new line.
                    start = -1;
                    hasPreviousBlack = false;
                }
            }

        }

        return maxSquareSize;
    }

    /*We will make an assumption the square must start and end, at "start", "end. This is not the question
    * but helps to simplify the code. To solve the original problem we just iterate the whole length  instead of only
    * those 2 coordinates*/

    /*
    * Check the size of the square in these positions only
    * */
    private static int calculateSquareSize(String[][] matrix, int start, int end, int row) {
        int distance = distance(start, end);
        //Check right, and left borders
        for (int i = 0; i < distance; i++) {
            if (row + i >= matrix.length)
                break;
            if (!matrix[row + i][start].equals("b")) {
                return -1;
            }
            if (!matrix[row + i][end].equals("b")) {
                return -1;
            }
        }

        //Check bottom
        for (int i = start; i < start + distance; i++) {
            if (row + distance - 1 >= matrix.length)
                break;
            if (!matrix[row + distance - 1][i].equals("b")) {
                return -1;
            }
        }
        return distance * distance;
    }

    private static int distance(int start, int end) {
        return Math.abs(start - end) + 1;
    }
}
