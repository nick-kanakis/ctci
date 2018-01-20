package Moderate;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;

/**
 * Created by Nicolas on 20/1/2018.
 */
public class Q21 {

    public static int[] sumAndSwap(int[] arrayA, int[] arrayB){
        int sumA = computeSum(arrayA);
        int sumB = computeSum(arrayB);
        int[] result = new int[2];

        //Values that should be swapped from their corresponding array
        int vA = 0;
        int vB = 0;

        /*
        * sumA + vB - vA  should be equal to sumB + vA - vB
        * so vB - vA = (sumA + sumB)/2
        * search for every vA possible so
        * vB = (sumB - sumA)/2 + vA
        * if vB exists in arrayB return result.
        *
        * In order to search the arrayB efficiently sort it and use binary search. total time: O(nlogn)
        * */
        int equationResult = (sumB - sumA)/2;
        Arrays.sort(arrayB);

        for (int i = 0; i < arrayA.length; i++) {
            vA = arrayA[i];
            vB = equationResult + vA;
            if(valueExists(vB, arrayB, 0, arrayB.length -1)){
                result[0]= vA;
                result[1]= vB;
                return result;
            }
        }
        return result;
    }

    private static int computeSum(int[] arrayA) {
        int result = 0;
        for (int i = 0; i < arrayA.length; i++) {
            result+=arrayA[i];
        }
        return result;
    }

    private static boolean valueExists(int vB, int[] arrayB, int start, int end) {
        //!SOOOS!!!!
        if(start>end)
            return false;
        int middle = (start+end)/2;
        if(arrayB[middle]== vB)
            return true;
        else if(vB < arrayB[middle]){
            return valueExists(vB, arrayB, 0, middle - 1);
        } else {
            return valueExists(vB, arrayB, middle + 1, end);
        }
    }
}
