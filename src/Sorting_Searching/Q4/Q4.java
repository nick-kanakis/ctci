package Sorting_Searching.Q4;

/**
 * The first thing is to calculate the size of the array so that we can implement binary search (BS). We do not need the exact
 * size just an estimation. So we search exponentially the array (1,2,4,8,16,32,....) until we reach an end. This end is not
 * the actual end but is a good estimation.
 *
 * Then we do a BS in the array. If the midpoint value is -1 this means that we have to search the right side since we have react
 * the end of the array (and probably surpass it)
 */
public class Q4 {

    public static int search(Listy list, int target){
        int size = estimateSize(list);
        return binarySearch(list, target, 0, size);
    }

    private static int binarySearch(Listy list, int target, int startPointer, int estimatedEndPointer) {
        int midPoint = (startPointer+estimatedEndPointer)/2;

        if(list.getCharAt(midPoint) == -1)
            return binarySearch(list, target, startPointer, estimatedEndPointer -1);
        if(list.getCharAt(midPoint) == target)
            return midPoint;

        if(target>list.getCharAt(midPoint))
            return binarySearch(list, target, midPoint + 1, estimatedEndPointer);
        else
            return binarySearch(list, target, startPointer, midPoint - 1);
    }

    private static int estimateSize(Listy list) {
        int pointer = 1;
        while (list.getCharAt(pointer)!= -1){
            pointer*=2;
        }
        return pointer;
    }
}
