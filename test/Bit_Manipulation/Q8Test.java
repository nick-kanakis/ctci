package Bit_Manipulation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 7/12/2017.
 */
public class Q8Test {

    @Test
    public void testDrawLine() throws Exception {
        byte[] screen = new byte[30];

        for (int i = 0; i < 30; i++) {
            screen[i] = new Byte("0");
        }
        byte[] updatedScreen = Q8.drawLine(screen, 16, 3, 14, 2);
        assertEquals(31,updatedScreen[4]);
        assertEquals(-2,updatedScreen[5]);
    }
}
