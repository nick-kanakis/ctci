package Hard;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 31/1/2018.
 */
public class Q23Test {

    @Test
    public void testMaxSquare() throws Exception {

        String[][] matrix = new String[][]{
                {"w","w","w","w","b","b",},
                {"w","w","w","w","b","b",},
                {"w","b","b","b","b","w",},
                {"w","b","w","w","b","w",},
                {"w","b","w","w","b","w",},
                {"w","b","b","b","b","w",}
        };


        assertEquals(16, Q23.maxSquare(matrix));
    }
}
