package Hard;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Sort, remove duplicates and select the kth element of array
 */
public class Q14 {

    public static int kthSmallest(int[] array, int k) {
        Arrays.sort(array);

        Integer[] uniqueElements = removeDups(array);

        return uniqueElements[k];
    }

    private static Integer[] removeDups(int[] array) {
        ArrayList<Integer> noDupsList = new ArrayList<>();
        noDupsList.add(array[0]);
        int previous = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] == previous)
                continue;
            else {
                previous = array[i];
                noDupsList.add(array[i]);
            }
        }

        return noDupsList.toArray(new Integer[noDupsList.size()]);
    }
}
