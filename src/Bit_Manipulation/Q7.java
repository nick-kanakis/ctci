package Bit_Manipulation;

/**
 * Select the even position digits by using the mask 101010....101010 (0xAAAAA...AA)
 * Select the odd position digit by using the mast 010101......010101 (0X55555...55)
 *
 * Shift even 1 to the right and the odd one to the left. Finally OR the results
 */
public class Q7 {

    public static int pairwiseSwap(int num){
        int evenPositionDigits = num & 0xAAAAAAAA;
        int oddPositionDigits = num & (0xAAAAAAAA>>1);

        return (evenPositionDigits>>>1) | (oddPositionDigits<<1);
    }
}
