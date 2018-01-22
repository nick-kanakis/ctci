package Hard;

import java.util.Random;

/**
 * In order to pick m random values from the original array.
 * First create a m array and insert the first m values of the original to the picked.
 * This will verify that we will not return an array with empty values.
 *
 * After that iterate the rest of the original array.
 * select a random number from o to i and if the result is less than m update the corresponding value in the randomPicks array.
 *
 */
public class Q3 {

    public static int[] randomPick(int[] original, int m){
        int[] randomPicks = new int[m];

        for (int i = 0; i < m; i++) {
            randomPicks[i] = original[i];
        }
        Random rand = new Random();
        for (int i = m; i < original.length; i++) {
            int k = rand.nextInt(i + 1);
            if(k<m){
                randomPicks[k] = original[i];
            }
        }
        return randomPicks;
    }
}
