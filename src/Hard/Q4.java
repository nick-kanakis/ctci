package Hard;

import java.util.LinkedList;
import java.util.List;

/**
 * First find the position of the missing integer.
 * Take the previous value, add 1 and return the result.
 */
public class Q4 {

    public static String findMissingNumber(String[] array){
        //We start from 0 so the last bit will be 0
        char previousLSB = '0';
        // previous & next value of the missing
        int previousPointer = 0;


        //If we start with LSB !=0 that means we start from 1 so the missing is 0
        if(getBit(0, array[0].length()-1, array) != previousLSB){
            return "0";
        }

        for (int i = 1; i < array.length; i++) {
            if(getBit(i, array[i].length()-1, array) == previousLSB){
                previousPointer = i-1;
                break;
            }
            previousLSB = previousLSB == '0' ? '1' : '0';
        }

        //todo: also check for the case that the missing value is the max digit (n)

        return findNextNumber(previousPointer, array);
    }

    private static char getBit(int arrayPosition, int bitPosition, String[] array) {
        return array[arrayPosition].charAt(bitPosition);
    }

    private static String findNextNumber(int ptr, String[] array) {
        List<Integer> result = new LinkedList<>();
        int carry = 1;
        for (int i = array[ptr].length() - 1; i >=0 ; i--) {
            int tmpResult = Character.getNumericValue(getBit(ptr, i, array)) + carry;

            if(tmpResult == 2){
                carry = 1;
                tmpResult = 0;
            } else {
                carry = 0;
            }

            result.add(0, tmpResult);
        }

        if(carry==1)
            result.add(0, 1);

        StringBuilder sb = new StringBuilder();
        for (Integer currentBit : result) {
            sb.append(currentBit);
        }

        return sb.toString();
    }
}
