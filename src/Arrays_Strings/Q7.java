package Arrays_Strings;

/**
 * Created by Nicolas on 7/11/2017.
 */
public class Q7 {

    /*
    * We will iterate the matrix in layers (from outer one to the most inner one). A NxN matrix has N/2 layers.
    *
    *
    * */
    public static int[][] rotate90InPlace(int[][] matrix) {
        int matrixSize = matrix.length;

        //iterate each layer
        for (int layer = 0; layer < matrixSize/2; layer++) {
            // first column/row of each layer (main diagonal)
            int first = layer;
            // last column/row of each layer (first half of anti-diagonal)
            int last = matrixSize - 1 - first;

            /*iterate from the starting column of this layer to the last column - 1 and swap the elements as shown below:
            *
            * temp = top
            * top = left
            * left = bottom
            * bottom = right
            * right = tmp
            *
            *
            */
            for (int i = first; i < last ; i++) {
                //offset from first column of each layer
                int offset = i - first;
                //Save top in tmp
                int tmp = matrix[first][i];

                //top = left
                matrix[first][i] = matrix[last - offset][first];

                // left = bottom
                matrix[last - offset][first] = matrix[last][last - offset];

                //bottom = right
                matrix[last][last - offset] = matrix[i][last];

                //right = tmp
                matrix[i][last] = tmp;
            }
        }
        return matrix;
    }

}
