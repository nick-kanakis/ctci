package Recursion_DynamicProgramming.Q2;

import java.util.LinkedList;
import java.util.List;

/**
 * We use a Stack to backtrack when we hit a wall and we cannot go right or down.
 */
public class Q2 {

    public static List<Position> findPath(Grid grid, int size){
        Position current = new Position(0,0);
        Position target = new Position(size - 1, size - 1);

        LinkedList<Position> stack = new LinkedList<>();
        stack.addFirst(current);
        while (!current.equals(target)){

            if(grid.isValidPosition(grid.goRight(current))){
                grid.setPositionInValid(current);
                current = grid.goRight(current);
                stack.addFirst(current);
            } else if (grid.isValidPosition(grid.goDown(current))){
                grid.setPositionInValid(current);
                current = grid.goDown(current);
                stack.addFirst(current);
            } else{
                stack.removeFirst();
                current = stack.peek();
            }
        }

        return stack;
    }
}
