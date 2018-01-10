package Java;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 8/1/2018.
 */
public class Q8Test {

    @Test
    public void testGetRandomSubset() throws Exception {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(15);
        input.add(3);
        input.add(2);
        input.add(12);
        input.add(8);
        input.add(9);

        List<Integer> randomSubset = Q8.getRandomSubset(input);
        for(Integer tmp: randomSubset)
            assertTrue(input.contains(tmp));
    }
}
