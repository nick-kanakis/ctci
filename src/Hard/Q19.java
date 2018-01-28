package Hard;

/**
 * Created by Nicolas on 28/1/2018.
 */
public class Q19 {

    /*
    * The sum of a sequence of unique number can be calculated by n*(n+1))/2
    * By removing one by one the elements in the array the remaining will be the missing number;
    * */
    public static int missingNumber(int[] input, int n){
        int sum = (n*(n+1))/2;

        for (int i : input) {
            sum -= i;
        }
        return sum;
    }
}
