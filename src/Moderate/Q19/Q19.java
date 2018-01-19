package Moderate.Q19;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Iterate all cells. When a cell is water, search all nearby cells for water, this can be done recursively or by
 * using a stack and backtracking when there is no where to move to.
 */
public class Q19 {
    private static final int WATER = 0;
    public static ArrayList<Integer> pondSizes(int[][] map){

        ArrayList<Integer> pondSizes = new ArrayList<>();

        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[0].length; column++) {
                if(map[row][column] == WATER){
                    pondSizes.add(explorePond(new Coordinate(row, column), map));
                }
            }
        }
        return pondSizes;
    }

    private static Integer explorePond(Coordinate coordinate, int[][] map) {
        LinkedList<Coordinate> stack = new LinkedList<>();
        int size = 0;
        stack.addFirst(coordinate);

        while(stack.size() != 0){
            Coordinate top = stack.get(0);
            /*
            * Mark the cell as land as to not visit it again
            * */
            map[top.row][top.column] = 1;
            LinkedList<Coordinate> nearbyCoordinates = findNearbyCoordinates(top, map);

            /*If there is no nearby water remove it from stack and increase the pond size*/
            if(nearbyCoordinates.size() == 0){
                stack.remove(0);
                size++;
            } else {
                /*
                * Take all nearby waters and add them to the stack
                * also map them as "land" as to not be visited again.
                * */
                for (Coordinate nearbyCoordinate: nearbyCoordinates ) {
                    stack.add(nearbyCoordinate);
                    map[nearbyCoordinate.row][nearbyCoordinate.column] = 1;
                }
                nearbyCoordinates.clear();
            }
        }
        return size;
    }

    private static LinkedList<Coordinate> findNearbyCoordinates(Coordinate current, int[][] map) {
        LinkedList<Coordinate> coordinates = new LinkedList<>();
        /*
        * Check all 8 neighbor cells
        * */
        if(checkPosition(current.row -1, current.column -1, map)){
            coordinates.add(new Coordinate(current.row -1, current.column -1));
        }
        if(checkPosition(current.row -1, current.column, map)){
            coordinates.add(new Coordinate(current.row -1, current.column));
        }
        if(checkPosition(current.row , current.column-1, map)){
            coordinates.add(new Coordinate(current.row, current.column -1));
        }
        if(checkPosition(current.row , current.column+1, map)){
            coordinates.add(new Coordinate(current.row , current.column+1));
        }
        if(checkPosition(current.row+1 , current.column, map)){
            coordinates.add(new Coordinate(current.row+1 , current.column));
        }
        if(checkPosition(current.row+1 , current.column+1, map)){
            coordinates.add(new Coordinate(current.row+1 , current.column+1));
        }
        if(checkPosition(current.row+1 , current.column-1, map)){
            coordinates.add(new Coordinate(current.row+1 , current.column-1));
        }
        if(checkPosition(current.row-1 , current.column+1, map)){
            coordinates.add(new Coordinate(current.row-1 , current.column+1));
        }
        return coordinates;
    }

    private static boolean checkPosition(int row, int column, int[][] map) {
        /*Check if valid position and if there is water*/
        if(row<0 || row >= map.length)
            return false;
        if(column<0 || column >= map[0].length)
            return false;
        if(map[row][column] != WATER)
            return false;
        return true;
    }

}
