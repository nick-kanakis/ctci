package Bit_Manipulation;

/**
 * XOR the 2 number this will give you a map of the different bits.
 * After that count the 1s in the above result.
 */
public class Q6 {

    public static int conversion(int num1, int num2) {
        int onesMap = num1 ^ num2;
        int bitsToSwitchCounter = 0;
        //SOS: Loop while map is greater than 0 (there is at least one more 1)
        while(onesMap>0){
            if ((onesMap & 1) == 1)
                bitsToSwitchCounter++;
            onesMap >>=1;
        }
        return bitsToSwitchCounter;
    }
}
