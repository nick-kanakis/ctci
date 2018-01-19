package Moderate;

/**
 * Created by Nicolas on 18/1/2018.
 */
public class Q17 {

    public static int maxContiguousSequence(int[] input){
        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < input.length; i++) {
            currentSum += input[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            } else if(currentSum<0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
