package Sorting_Searching;

/**
 * The search will be a Binary Search with the modification in case the value is empty.
 * In that case we need to traverse both sides until we find a non empty string and use it as a new middle.
 */
public class Q5 {

    public static int searchSparseArray(String[] array, String target) {
        return searchSparseArray(array, target, 0, array.length - 1);
    }

    private static int searchSparseArray(String[] array, String target, int first, int last) {
        // !!!SOS!!! the value does not exist <- DO NOT FORGET IT
        if(first>last)
            return -1;

        int midPointer = (first + last) / 2;


        if (array[midPointer].isEmpty()) {

            int leftPointer = midPointer - 1;
            int rightPointer = midPointer + 1;

            while (leftPointer>=first && rightPointer<=last){
                if(!array[leftPointer].isEmpty()){
                    /*The value in lefPointer is not empty we can use it as a new middle to compare for the BS * */
                    midPointer = leftPointer;
                    break;
                } else if(!array[rightPointer].isEmpty()){
                    /*The value in rightPointer is not empty we can use it as a new middle to compare for the BS * */
                    midPointer = rightPointer;
                    break;
                }
                leftPointer--;
                rightPointer++;
            }


        }
        if(target.equals(array[midPointer]))
            return midPointer;
        else if (target.compareTo(array[midPointer]) < 0) {
            // target < array[midPointer]
            return searchSparseArray(array, target, first, midPointer -1);
        } else {
            //target > array[midPointer]
            return searchSparseArray(array, target, midPointer+1, last);
        }
    }
}
