package Bit_Manipulation;

/**
 * The idea here is to clear (set 0s) to all the number from j to i in the N.
 * To do that you create a mask like this: 11..1100...0011..11 and AND this to the N.
 *      In order to create the mask you shift left and right the -1, this is done in 2 parts:
 *      1) shift -1 left j times so that there are j zeros from the right side.
 *      2) shift -1 right (32 - i) times so that the first i (from the right side) have only 1 and all else are zeros.
 *      3) OR both of them to merge the results in one mask
 * Then in order to actual clear the N : N & mask
 * Bring M to the right position (shift left by i) to match the cleared part.
 * OR the last 2 and return the result.
 */
public class Q1 {
    private final static int BIT_NUMBER = 32;

    public static int insert2Nums(int numN, int numM, int i, int j){
        int mask = createMask(i, j);
        int numNZeroItoJ = numN & mask;
        int shiftedM = numM << i;

        return numNZeroItoJ|shiftedM;
    }

    private static int createMask(int i, int j) {
        int tmp1 = -1 << j;
        int tmp2 = -1 >> BIT_NUMBER - i;

        return tmp1|tmp2;
    }
}
