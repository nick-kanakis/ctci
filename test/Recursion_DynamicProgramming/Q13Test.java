package Recursion_DynamicProgramming;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 30/12/2017.
 */
public class Q13Test {

    @Test
    public void testComputeMaxHeightOfBoxes() throws Exception {
        Q13.Box box1 = new Q13.Box(15, 12, 17);
        Q13.Box box2 = new Q13.Box(14, 15, 15);
        Q13.Box box3 = new Q13.Box(13, 11, 14);
        Q13.Box box4 = new Q13.Box(12, 10, 18);
        Q13.Box box5 = new Q13.Box(16, 12, 20);

        ArrayList<Q13.Box> boxes = new ArrayList<>();
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        boxes.add(box4);
        boxes.add(box5);

        assertEquals(44, Q13.computeMaxHeightOfBoxes(boxes));
        assertEquals(44, Q13.computeMaxHeightOfBoxesMemoization(boxes));
    }
}
