package Sorting_Searching;

/**
 * In the sortedMerge we compare from the start the elements of the 2 arrays, if array2 has the next smaller we swap
 * the element with the one in the array1 and resort the array2 if needed.
 *
 * In the sortedMergeBookSolution, we start by comparing the last elements and placing them in the end of the array1.
 * In each comparison we put at the end the biggest value.
 */
public class Q1 {

    public static void sortedMerge(int[] arr1, int[] arr2){
        int ptr1=0;
        while (arr1[ptr1] != 0){
            if(arr1[ptr1] > arr2[0]){
                //swap smallest values
                int tmp = arr1[ptr1];
                arr1[ptr1] = arr2[0];
                arr2[0] = tmp;

                //sort (using bubbleSort) arr2
                bubbleSort(arr2);
            }
            ptr1++;
        }
        //copy remaining elements
        for (int i = 0; i < arr2.length; i++) {
            arr1[ptr1+i] = arr2[i];
        }
    }

    private static void bubbleSort(int[] arr2) {
        int currentPtr = 0;
        while (currentPtr < arr2.length - 1){
            if(arr2[currentPtr] > arr2[currentPtr+1]){
                //swap  values
                int tmp = arr2[currentPtr];
                arr2[currentPtr] = arr2[currentPtr + 1];
                arr2[currentPtr + 1] = tmp;
            }
            currentPtr++;
        }
    }


    public static void sortedMergeBookSolution(int[] arr1, int[] arr2, int lastIndex1, int lastIndex2){
        int mergedIndex = arr1.length - 1;

        while(lastIndex2>=0){
            if(lastIndex1>=0 && arr1[lastIndex1] > arr2[lastIndex2]){
                arr1[mergedIndex] = arr1[lastIndex1];
                lastIndex1 --;
            } else {
                arr1[mergedIndex] = arr2[lastIndex2];
                lastIndex2--;
            }
            mergedIndex--;
        }
    }
}
