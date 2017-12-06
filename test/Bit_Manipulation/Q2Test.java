package Bit_Manipulation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 5/12/2017.
 */
public class Q2Test {

    @Test
    public void testPrintBinary() throws Exception {
        assertEquals("0.1010001", Q2.printBinary(0.6328125));
        assertEquals("ERROR", Q2.printBinary(0.7232323211));
    }
}
