package Hard;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 27/1/2018.
 */
public class Q16Test {

    @Test
    public void testMaxMinutesRecursively() throws Exception {
        int[] appointments = new int[]{30, 15, 60, 75,45, 15, 15, 45};
        assertEquals(180, Q16.maxMinutesRecursively(appointments));
    }
}
