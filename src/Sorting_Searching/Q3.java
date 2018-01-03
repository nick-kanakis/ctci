package Sorting_Searching;

/**
 * The array is split in 2 subarrays that are sorted. Lets search for X.
 * First compare the middle element (M) with the first element (F) if F < M then the normally order side is first half.
 *      If X is between F and M search first half
 *      Else search the second half
 *If F > M then the normally order side is the second half.
 *      If X is between F and E (Final - end- element) search second half
 *      Else search the first half
 *IF F == M  (this case is when we have duplicate values)
 *      If M != E search second half
 *      else search first half and then second half
 */
public class Q3 {

    public static int search (int[] array, int target){
       return search(array, target, 0, array.length -1);
    }

    private static int search(int[] array, int target, int leftPointer, int rightPointer) {
        int midPointer = (leftPointer+rightPointer)/2;

        if(target == array[midPointer])
            return midPointer;

        //invalid case
        if(rightPointer < leftPointer)
            return -1;

        if(array[leftPointer] < array[midPointer]){
            /*The normally ordered part of the array is the left (first) part*/
            if(target<array[midPointer] && target >= array[leftPointer]){
                //If target is < middle it is in the first part
                return search(array, target, leftPointer, midPointer -1);
            } else {
                //If target is > middle it is in the second part
                return search(array, target, midPointer +1, rightPointer);
            }
        } else if(array[leftPointer] > array[midPointer]){
            /*If middle is less than the left most element this means that the normally ordered part is the second (right) part*/
            if(target>array[midPointer] && target <= array[rightPointer]){
                //If target is > middle it is in the second part
                return search(array, target,midPointer +1, rightPointer);
            } else {
                //If target is < middle it is in the second part
                return search(array, target, leftPointer, midPointer -1);
            }
        } else if(array[leftPointer] == array[midPointer]){
            /*
            * If left == middle this means that we have duplicates. In this case we can
            * see if the right value is different from the middle if it is we search this part
            * if not we have to search both parts!
            * */

            if(array[midPointer] != array[rightPointer])
                return search(array, target,midPointer +1, rightPointer);
            else{
                /*First search the left part and if not found search the right part*/
                int result = search(array, target, leftPointer, midPointer -1);
                if(result == -1)
                    return search(array, target,midPointer +1, rightPointer);
                return result;
            }
        }
        return -1;
    }
}
