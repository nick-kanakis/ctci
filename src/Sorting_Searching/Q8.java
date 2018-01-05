package Sorting_Searching;

import java.util.BitSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Create a BitSet that holds 32000 bits = 32000/8 = 4000 bytes = 4kilobytes. Each number in the array
 * is represented by a position in the BitSet.
 */
public class Q8 {
    public static List<Integer> findDuplicates(int[] array){
        BitSet bs = new BitSet(32000);
        List<Integer> duplicates = new LinkedList<>();

        for (int num: array){
            if(bs.get(num) && !duplicates.contains(num))
                duplicates.add(num);
            bs.set(num, true);
        }
        return duplicates;
    }

}
