package Moderate;

/**
 * The MSB (most significant bit) will be 1 if b>a or 0 if a>b. This can be used in
 * b*mostSignificantBit + a*(1-mostSignificantBit) in order to return the max result.
 */
public class Q7 {

    public static int findMax(int a, int b){
        int diff = a - b;
        int mostSignificantBit = findMostSignificantBit(diff);

        return b*mostSignificantBit + a*(1-mostSignificantBit);
    }

    private static int findMostSignificantBit(int diff) {
        //Find the Most Significant bit
        int shiftedResult = (diff>>63) & 0x1;
        return shiftedResult;
    }
}
