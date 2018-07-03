package Hard;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nicolas on 21/1/2018.
 */
public class Q3Test {

    @Test
    public void testRandomPick() throws Exception {
        int[] input = new int[]{1,2,3,4,5,6,7,8};

        /*Not really a test just validating that the execution will not fail*/
        int[] randomPicks = Q3.randomPick(input, 2);

        for (int randomPick : randomPicks ) {
            assertTrue(randomPick>0 && randomPick<9);
        }


    }
}
