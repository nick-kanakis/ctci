package Hard;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 29/1/2018.
 */
public class Q21Test {

    @Test
    public void testCalculateHistogramVolume() throws Exception {
        int[] histogram = new int[]{0, 0, 4, 0, 0, 6, 0, 0, 3, 0, 8, 0, 2, 0, 5, 2, 0,3, 0, 0};
        assertEquals(46, Q21.calculateHistogramVolume(histogram));
    }
}
