package Recursion_DynamicProgramming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q4 {

    public static LinkedList<LinkedList<Integer>> getPowerSet(List<Integer> set){
        LinkedList<LinkedList<Integer>> result = new LinkedList<>();
        result.add(new LinkedList<>());// add initial empty set
        for (int i = 0; i < set.size(); i++) {

            //Deep clone the result list
            LinkedList<LinkedList<Integer>> clone = new LinkedList<>();
            for (int j = 0; j <result.size(); j++) {
                LinkedList<Integer> clonedList = new LinkedList<>();
                for (int k = 0; k <result.get(j).size(); k++) {
                    clonedList.add(result.get(j).get(k));
                }
                clone.add(clonedList);
            }
            //add new next element to the clone
            for(LinkedList<Integer> list : clone){
                list.add(set.get(i));
            }

            //Add clone to the original result
            result.addAll(clone);
        }
        return result;
    }
}
