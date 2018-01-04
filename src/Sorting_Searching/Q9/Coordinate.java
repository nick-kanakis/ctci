package Sorting_Searching.Q9;

/**
 * POJO to hold coordinates.
 */
public class Coordinate implements Cloneable{
    public int row, column;

    public Coordinate(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public boolean checkValidity(int[][] matrix){
        if(row<0 || row >= matrix.length)
            return false;
        if(column<0 || column >= matrix[0].length)
            return false;
        return true;
    }

    public boolean isBefore(Coordinate lowerCoordinate) {
        if(row<=lowerCoordinate.row && column<=lowerCoordinate.column)
            return true;
        return false;
    }
    public Object clone(){
        return new Coordinate(row, column);
    }
}
