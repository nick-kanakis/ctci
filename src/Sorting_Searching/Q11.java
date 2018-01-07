package Sorting_Searching;

import java.util.Arrays;
import java.util.Comparator;

/**
 * sortPeaksAndValleys first sorts the array in an descending order. Then swap last element withn 2nd element, and move
 * 2 steps and so again ... until the middle is reached. (O(nlogn))
 *
 * sortPeakAndValleysBookSolution, we move from start to finish in 2 steps starting from 1. We compare the current, left and right
 * element and find the the max. then swap the current element with the max, and move on. (O(n))
 *
 */
public class Q11 {

    public static void sortPeaksAndValleys(Integer[] array){
        Arrays.sort(array, new DescendingOrderComparator());

        for (int i = 1; i <= (array.length-1)/2; i+=2) {
            swap(array, array.length - i, i);
        }
    }

    private static class DescendingOrderComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

    private static void swap(Integer[] array, int position1, int position2){
        if(position1 == position2)
            return;
        int tmp = array[position1];
        array[position1] = array[position2];
        array[position2] = tmp;
    }

    public static void sortPeaksAndValleysBookSolution(Integer[] array){

        for (int i = 1; i < array.length; i+=2) {
            int maxIndex = findMaxIndex(array, i-1, i, i+1);
            swap(array, i, maxIndex);
        }
    }

    private static int findMaxIndex(Integer[] array, int left, int current, int right) {
        if(left<0 || left>=array.length)
            left = Integer.MIN_VALUE;
        if(current<0 || current>=array.length)
            current = Integer.MIN_VALUE;
        if(right<0 || right>=array.length)
            right = Integer.MIN_VALUE;

        int maxIndex = Math.max(array[left], Math.max(array[current], array[right]));

        if(maxIndex == left)
            return left;
        else if (maxIndex == current)
            return current;
        else
            return right;
    }
}
