package Recursion_DynamicProgramming;

/**
 * Created by Nicolas on 24/12/2017.
 */
public class Q3 {

    public static int findMagicIndex(int []array){
        return  findMagicIndexRecursive(0, array.length-1, array);
    }

    private static int findMagicIndexRecursive(int start, int end, int[] array) {
        int middle = (start + end)/2 ;

        if(array[middle] <middle)
            return findMagicIndexRecursive(middle+1, end, array);
        else if(array[middle] > middle)
            return findMagicIndexRecursive(start, middle+1, array);
        else
            return middle;
    }

    public static int findMagicIndexWithDuplicates(int []array){
        return  findMagicIndexWithDuplicatesRecursive(0, array.length-1, array);
    }

    private static int findMagicIndexWithDuplicatesRecursive(int start, int end, int[] array) {
        if(end<start)
            return -1;

        int middle = (start + end)/2 ;

        if(array[middle] == middle)
            return middle;

        int leftIndex = Math.min(middle - 1, array[middle]);
        int left = findMagicIndexWithDuplicatesRecursive(start, leftIndex, array);
        if(left>=0)
            return left;

        int rightIndex = Math.max(middle + 1, array[middle]);
        int right = findMagicIndexWithDuplicatesRecursive(rightIndex, end, array);
        return right;
    }
}
