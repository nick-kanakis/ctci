package Hard;

import java.util.*;

/**
 * First create a map with key every value of the small array, and value every position the key is appearing in the big array
 *
 * Then take the lists of appearance and find the min distance between them. This is done in the following steps:
 * 1) find the min distance between the heads of the lists
 * 2) remove the minimum head from the corresponding list
 * 3) repeat
 */
public class Q18 {

    public static int minDistance(int[] big, int[] small) {
        /*
        * For each integer in the small array create a list of all positions it is appearing
        * in the big array
        * */
        HashMap<Integer, List<Integer>> map = initializeSmallMap(small);
        populateSmallMap(map, big);

        return findMinDistance(map);

    }

    /*Initialize the map with the keys (all values af small array)*/
    private static HashMap<Integer, List<Integer>> initializeSmallMap(int[] small) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i : small) {
            map.put(i, new ArrayList<>());
        }

        return map;
    }

    /*Populate the map with the positions of each key in the big array*/
    private static void populateSmallMap(HashMap<Integer, List<Integer>> map, int[] big) {
        for (int i = 0; i < big.length; i++) {
            if (map.containsKey(big[i]))
                map.get(big[i]).add(i);
        }
    }

    /*
    * Create a list of all the lists that have appearances of the small array in the big array.
    * Take the heads of the lists and find the min distance as well as the list with the min head.
    * Remove the head from that list and repeat. If needed update the minDistance.
    *
    * When a list is empty break the while loop, because this means that every element in the other lists is further
    * than the ones we have already checked.
    * */
    private static int findMinDistance(HashMap<Integer, List<Integer>> map) {

        /*Create a list of all the lists with the positions of the small array*/
        ArrayList<List<Integer>> lists = new ArrayList<>();
        for (Integer key : map.keySet()) {
            lists.add(new ArrayList<>(map.get(key)));
        }
        ArrayList<Integer> heads;
        int minDistance = Integer.MAX_VALUE;

        /*Should you break the outer loop ?
        * When a list is empty that means that from this list the last element has been checked, and every element in the
        * other lists is always further away, so we do not need to keep looking
        */
        boolean shouldBreak = false;

        while (true) {
            heads = new ArrayList<>();
            for (List<Integer> list : lists) {

                if (list.size() == 0){
                    shouldBreak = true;
                    break;
                }

                heads.add(list.get(0));
            }
            if(shouldBreak)
                break;


            minCombination minCombination = minDistance(heads);

            if (minDistance > minCombination.minDistance)
                minDistance = minCombination.minDistance;

            //Remove the min head.
            lists.get(minCombination.minListIndex).remove(0);
        }

        return minDistance + 1;
    }

    private static minCombination minDistance(List<Integer> heads) {
        Integer maxValue = Collections.max(heads);
        Integer minValue = Collections.min(heads);
        int minIndex = heads.indexOf(minValue);

        return new minCombination(Math.abs(maxValue - minValue), minIndex);
    }

    private static class minCombination {
        public int minDistance;
        public int minListIndex;

        public minCombination(int minDistance, int minListIndex) {
            this.minDistance = minDistance;
            this.minListIndex = minListIndex;
        }
    }
}
