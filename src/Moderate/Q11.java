package Moderate;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;

/**
 * We do not care about the order of the different planks. We care only about the different sizes. We start from with the largest
 * possible set of planks (K large planks) one by one we replace a large plank with a small and add the new size to the
 * list. There is no way to have duplicate ways in that way
 */
public class Q11 {

    public static List<Integer> divingBoardsCombinations(int k, int small, int large){
        List<Integer> lengths = new ArrayList<>();
        //Create the largest possible board
        lengths.add(k*large);

        //With each iteration replace a new large plank with a new small one.
        for (int i = 1; i < k; i++) {
            int previousLength = lengths.get(i - 1);
            int newLength = previousLength - large + small;
            lengths.add(newLength);
        }
        return lengths;
    }


}
