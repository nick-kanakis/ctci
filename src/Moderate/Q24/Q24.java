package Moderate.Q24;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * First create a map of all array numbers :
 * [KEY    | VALUE    ]
 * [number | # of occurrences]
 *
 * Then iterate the array again and for each value search the if sum - value exists (complement)
 * If it exists first check that you have not chosen  yourself.
 * Then create the pair and add it to the result
 * SOS -> The pair that is used should be removed from the map to avoid double counting
 */
public class Q24 {

    public static ArrayList<Pair> findPairs(int[] array, int sum){
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Pair> result = new ArrayList<>();
        //initialize the map
        for (Integer i: array) {
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }

        for (Integer i: array ) {
            int complement = sum - i;
            if (map.containsKey(complement) && map.get(complement)>0){
                /*
                * We may have chosen the same value as i. We need to verify that is not the case
                * */
                Integer numOfOccurrencesOfComplement = map.get(complement);
                if(i == complement && numOfOccurrencesOfComplement<1)
                    continue;

                /* !!!SOOOS!!!
                * The pair that has been already used should be removed (by decreasing the value of the map by 1).
                * This is being done for avoiding double-counting.
                * */
                map.put(complement, map.get(complement)-1);
                map.put(i, map.get(i)-1);

                //Add pair to result
                result.add(new Pair(i, complement));
            }
        }
        return result;
    }
}
