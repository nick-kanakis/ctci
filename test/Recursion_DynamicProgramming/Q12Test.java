package Recursion_DynamicProgramming;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 28/12/2017.
 */
public class Q12Test {

    @Test
    public void testCountQueensPossiblePositions() throws Exception {
        ArrayList<Integer[]> results = new ArrayList<>();
       Q12.placeQueens(0, new Integer[8], results);
       assertEquals(92, results.size());
    }
}
