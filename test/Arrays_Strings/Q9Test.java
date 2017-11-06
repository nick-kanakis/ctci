package Arrays_Strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by Nicolas on 6/11/2017.
 */
public class Q9Test {

    @Test
    public void testIsRotation() throws Exception {
        assertTrue(Q9.isRotation("mynameisnick","nameisnickmy"));
        assertFalse(Q9.isRotation("mynameisnick","nameisnick"));
    }
}
