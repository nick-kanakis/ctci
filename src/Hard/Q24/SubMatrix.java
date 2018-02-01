package Hard.Q24;

/**
 * Created by Nicolas on 31/1/2018.
 */
public class SubMatrix {
    public int col1, col2, row1, row2;
    public int sum;

    public SubMatrix(int col1, int col2, int row1, int row2, int sum) {
        this.col1 = col1;
        this.col2 = col2;
        this.row1 = row1;
        this.row2 = row2;
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubMatrix subMatrix = (SubMatrix) o;

        if (col1 != subMatrix.col1) return false;
        if (col2 != subMatrix.col2) return false;
        if (row1 != subMatrix.row1) return false;
        if (row2 != subMatrix.row2) return false;
        return sum == subMatrix.sum;
    }

    @Override
    public int hashCode() {
        int result = col1;
        result = 31 * result + col2;
        result = 31 * result + row1;
        result = 31 * result + row2;
        result = 31 * result + sum;
        return result;
    }

    public boolean lessThan(SubMatrix tmpSubMatrix) {
        if(this.sum < tmpSubMatrix.sum)
            return true;
        return false;
    }
}
