package Math_Logic_Puzzles;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 10/12/2017.
 */
public class Q7Test {


    @Test
    public void testPostApocalypticGenderRatio() throws Exception {
        double girlsRatio = Q7.postApocalypticGenderRatio(10000);
        assertTrue( girlsRatio < 0.51);
        assertTrue( girlsRatio > 0.49);
    }
}


