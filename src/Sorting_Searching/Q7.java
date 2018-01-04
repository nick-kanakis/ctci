package Sorting_Searching;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Mine: break the 4 billion in pieces of 1 billion and in each find the max.
 * compare them and retrieve the maximum solution. Then print max+1.
 *
 * Book: Create a bit vector (an array of bytes), there are 1 billion bytes available in the memory and 8 billion bits
 * more than enough to store the bit vector. Each position represents an integer and is marked with 1 when this number is
 * found.
 * In the second pass the first position not marked with 1 is a missing integer.
 *
 * How bit vector works?
 *
 * We want n positions in the vector.
 *
 * Create: Use a byte array with n/8 positions. Since each integer is represented by 8 bits.
 *
 * Insert:
 * Let's say we want to update position X from 0 to 1.
 * array[X/8] |= 1 <<(X%8)
 */
public class Q7 {

    public static void findMissingInteger(String filename) throws FileNotFoundException {
        long numOfIntegers = ((long)Integer.MAX_VALUE)+1;
        byte[] bitField = new byte[(int) (numOfIntegers/8)];

        Scanner in = new Scanner(new FileReader(filename));
        while(in.hasNext()){
            int number = in.nextInt();
            bitField[number/8] |= 1 <<(number%8);
        }

        for (int i = 0; i < bitField.length; i++) {
            for (int j = 0; j < 8; j++) {
                if((bitField[i] & (1<<j))==0){
                    System.out.println(i*8+j);
                    return;
                }
            }
        }
    }

}
