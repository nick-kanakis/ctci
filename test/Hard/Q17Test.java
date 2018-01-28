package Hard;

import org.junit.Test;

import java.util.HashMap;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nicolas on 28/1/2018.
 */
public class Q17Test

{
    @Test
    public void testSearchAll() throws Exception {
        String big = "mississippi";
        String[] small = {
                "mis",
                "ss",
                "pp",
                "pi",
                "ab",
                "ppid",
                "i",
        };

        HashMap<String, Boolean> result = Q17.searchAll(big, small);

        assertTrue(result.get("mis"));
        assertTrue(result.get("ss"));
        assertTrue(result.get("pp"));
        assertTrue(result.get("pi"));
        assertTrue(result.get("i"));
        assertFalse(result.get("ab"));
        assertFalse(result.get("ppid"));
    }
}
