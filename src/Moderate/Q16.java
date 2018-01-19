package Moderate;

/**
 * Created by Nicolas on 18/1/2018.
 */
public class Q16 {

    public static int[] subSort(int[] input){
        int[] middlePoints = getMiddlePoints(input);
        int[] extendedMiddlePoints = extendMiddle(input, middlePoints);

        return extendedMiddlePoints;
    }

    /*
       * Search at the same time the start and end pointers(inclusive) of the middle section of the array.
       * The middle section is characterized by 2 points: Ps (starting, Pe (ending)
       *   Ps: Before that point and until the start of the array the subarray is sorted
       *   Pe: After that point and until the end of the array the subarray is also sorted.
       * */
    private static int[] getMiddlePoints(int[] input) {
        //middlePoints[0] = Ps
        //middlePoints[1] = Pe
        int[] middlePoints = new int[]{-1, -1};

        for (int i = 0; i < input.length - 1; i++) {
            if(input[i] > input[i+1] && middlePoints[0] == -1){
                middlePoints[0] = i+1;
            }
            if(input[input.length - 1 - i] < input[input.length - 2 - i] && middlePoints[1] == -1){
                middlePoints[1] = input.length - 2 - i;
            }
        }
        return middlePoints;
    }

    /*
    * Starting from the edges of middle section expand the middle until the Min(middle subarray) is greater than all the elements in
    * the left subarray and Max(middle subarray) is less than all the elements in the right subarray
    *
    * */

    private static int[] extendMiddle(int[] input, int[] middlePoints) {
        int extendedPointerStart = middlePoints[0];
        int extendedPointerEnd = middlePoints[1];
        boolean middleHasBeenExtended = true;

        while( middleHasBeenExtended ){
            middleHasBeenExtended = false;
            int[] minMaxValues = computeMinMaxValues(input, middlePoints);
            int min = minMaxValues[0];
            int max = minMaxValues[1];

            if((extendedPointerStart == 0 ) && (extendedPointerEnd == input.length -1))
                break;

            if(min <= input[extendedPointerStart - 1] ){
                middleHasBeenExtended = true;
                extendedPointerStart -- ;
            }
            if(max >= input[extendedPointerEnd + 1]){
                middleHasBeenExtended = true;
                 extendedPointerEnd ++ ;
            }
        }

        return new int[]{extendedPointerStart, extendedPointerEnd};

    }

    /*
    * Given an array and 2 points in the array compute the Min & Max of this subarray.
    *  minMax[0] = min value of subarray
    *  minMax[1] = max value of subarray
    * */
    private static int[] computeMinMaxValues(int[] input, int[] middlePoints) {
        int[] minMax = new int[]{input[middlePoints[0]], input[middlePoints[1]]};

        for (int i = middlePoints[0]; i <= middlePoints[0] ; i++) {
            if(input[i] < minMax[0]){
                minMax[0] = input[i];
            }
            if(input[i] > minMax[1]){
                minMax[1] = input[i];
            }
        }
        return minMax;
    }
}
