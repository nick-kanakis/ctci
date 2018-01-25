package Hard;

import Hard.Q11.LocationPair;
import Hard.Q11.MinDistance;
import Hard.Q11.Q11;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 25/1/2018.
 */
public class Q11Test {

    @Test
    public void testOneTimeUse() throws Exception {
        String[] text = new String[]{"a", "b", "c", "d", "f", "a", "f", "b", "n", "g" };

        LocationPair locationPair1 = Q11.minDistanceRunOnce(text, "b", "f");

        assertEquals(6, locationPair1.position2);
        assertEquals(7, locationPair1.position1);

        MinDistance minDistance = new MinDistance(text);

        LocationPair locationPair2 = minDistance.getMinDistance("b", "f");
        assertEquals(6, locationPair2.position2);
        assertEquals(7, locationPair2.position1);

    }
}
