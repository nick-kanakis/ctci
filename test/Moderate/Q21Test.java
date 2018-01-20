package Moderate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 20/1/2018.
 */
public class Q21Test {

    @Test
    public void testSumAndSwap() throws Exception {
        int[] array1 = new int[]{4, 1, 2, 1, 1, 2};
        int[] array2 = new int[]{3, 6, 3, 3};

        int[] swappedValues = Q21.sumAndSwap(array1, array2);

        assertEquals(4, swappedValues[0]);
        assertEquals(6, swappedValues[1]);
    }
}
