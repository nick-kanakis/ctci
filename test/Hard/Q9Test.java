package Hard;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 24/1/2018.
 */
public class Q9Test {

    @Test
    public void testGetKthMagicNumber() throws Exception {
        assertEquals(35, Q9.getKthMagicNumber(9));
        assertEquals(45, Q9.getKthMagicNumber(10));
        assertEquals(49, Q9.getKthMagicNumber(11));
    }
}
