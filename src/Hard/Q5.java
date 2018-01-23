package Hard;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * First create a map of continues same letter map.
 *
 * Then iterate the newly created list and compare with the previous element and find the min this the number of this subset.
 * Also keep track of the last index of the sequence (by aggregating the values of the list).
 *
 * The final result is a subset from position [lastMaxIndex - 2*MaxDelta , lastMaxIndex]
 */
public class Q5 {
    // Instead of letter and numbers we will have  A, B

    public static char[] maxSubset(char[] input){
        /*
        * First create a list of number based on the continues A and B
        *
        * eg.
        *  AAA BBB A B AA BB
        *   3   3  1 1  2  2
        * */
        LinkedList<Integer> map = new LinkedList<>();
        char previous = input[0];
        int count = 1;
        for (int i = 1; i < input.length; i++) {
            if(input[i] == previous){
                count++;
            } else {
                map.add(count);
                count = 1;
                previous = input[i];
            }
        }
        map.add(count);

        //Find the max delta between 2 neighbor nodes
        int maxDelta = 0;
        int lastMaxIndex = 0;
        /*Points to the position we are currently iterating in the original (input) array*/
        int currentPointer = map.get(0);

        for (int i = 1; i < map.size(); i++) {
            int tmpDelta = Math.min(map.get(i), map.get(i-1)) ;

            currentPointer += map.get(i);
            if(maxDelta< tmpDelta){
                maxDelta = tmpDelta;
                lastMaxIndex = currentPointer;
            }
        }

        return Arrays.copyOfRange(input, lastMaxIndex - 2*maxDelta  , lastMaxIndex );
    }
}
