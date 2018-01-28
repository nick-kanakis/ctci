package Hard;

/**
 * For each appointment we have to option accept or reject it, if we accept it we cannot accept the immediate next,
 * If we reject it we can select the next one (this does not mean that we will, in the next call we will make a new decision)
 */
public class Q16 {

    public static int maxMinutesRecursively(int[] array){

        //Memo will hold the best results for index ( comparing start with or without the result)
        int[] memo = new int[array.length];

       return maxMinutesRecursively(array, 0, memo);
    }

    private static int maxMinutesRecursively(int[] array, int index, int[] memo) {
        if(index >=array.length)
            return 0;

        int max = 0;
        if(memo[index] == 0) {
            int bestWith = array[index] + maxMinutesRecursively(array, index + 2, memo);
            int bestWithout = maxMinutesRecursively(array, index + 1, memo);
            max =  Math.max(bestWith, bestWithout);
        }
        return max;
    }
}
