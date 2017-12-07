package Bit_Manipulation;

import java.util.ArrayList;

/**
 * First create a "map" of how many 1s and 0s exist in sequence, always starting from 0
 * eg. 11000011100 = 02432 = 0(zeros)2(ones)4(zeros)3(ones)2(zeros)
 * <p>
 * Having that map we pass to to a function to check what is the maximum sequence of ones it is able to have.
 */
public class Q3 {
    private static final int BITS_OF_INTEGER = Integer.BYTES * 8;

    public static int flipToWin(int num) {
        if (num == -1) {
            return BITS_OF_INTEGER;
        }

        ArrayList<Integer> sequences = getAlternativeSequence(num);
        return findMaxSequenceOfOnes(sequences);
    }

    /**
     * Create a list of the number of occurrences of 1s and 0s
     * eg: [3,1,4] = 00010000
     */
    private static ArrayList<Integer> getAlternativeSequence(int num) {
        int searchingFor = 0;
        int count = 0;
        ArrayList<Integer> sequence = new ArrayList<>();

        //from 0 to number of bits in a integer loop
        for (int i = 0; i < BITS_OF_INTEGER; i++) {
            //Right most digit not the same as the one we are looking for.
            if ((num & 1) != searchingFor) {
                sequence.add(count);
                count = 0;
                //flip the 0 -> 1 & 1 -> 0
                searchingFor = num & 1;
            }
            count++;
            num >>= 1;

        }
        sequence.add(count);
        return sequence;
    }

    private static int findMaxSequenceOfOnes(ArrayList<Integer> sequences) {
        int maxSeq = 0;

        /*Iterate with a step of 2 in order to always land in a 0 counter*/
        for (int i = 0; i < sequences.size(); i += 2) {
            int onesOnTheRight = 0;
            int onesOnTheLeft = 0;
            //This always points to zeros
            int currentPosition = sequences.get(i);
            int thisSeq = 0;

            if (i - 1 >= 0)
                onesOnTheRight = sequences.get(i - 1);
            if (i + 1 < sequences.size())
                onesOnTheLeft = sequences.get(i + 1);

            if (currentPosition == 1) {
                // this means that the number of zeros = 1 so we can flip it and check the size
                thisSeq = onesOnTheLeft + 1 + onesOnTheRight;
            } else if (currentPosition > 1) {
                //if there are more than one zeros flip a zero next to the biggest sequence (left or right)
                thisSeq = 1 + Math.max(onesOnTheLeft, onesOnTheRight);
            } else {
                //There is no zero so take the max of the sequences
                thisSeq = Math.max(onesOnTheLeft, onesOnTheRight);
            }
            maxSeq = Math.max(thisSeq, maxSeq);
        }
        return maxSeq;
    }
}
