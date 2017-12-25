package Recursion_DynamicProgramming;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Q4Test {

    @Test
    public void testGetPowerSet(){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        LinkedList<LinkedList<Integer>> powerSet = Q4.getPowerSet(input);
        assertEquals(8, powerSet.size());
        //todo add a better test
    }
}
