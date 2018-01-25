package Hard.Q11;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Create a hash table with the positions of each word.
 *
 * Given 2 words retrieve the lists of the positions, find the min distance between the 2 lists.
 * How?
 *
 * Have 1 pointer at the start of each list,
 * At each step move the pointer of the smaller value of the 2 pointers.
 * At each step also compare the min distance and update it if needed.
 */
public class MinDistance {
    HashMap<String, LinkedList<Integer>> map = new HashMap<>();

    public MinDistance(String[] text) {

        //Construct map of words to be used
        for (int i = 0; i < text.length; i++) {
            if(map.containsKey(text[i])){
                map.get(text[i]).add(i);
            } else {
                LinkedList<Integer> ll = new LinkedList<>();
                ll.add(i);
                map.put(text[i], ll);
            }
        }
    }

    public LocationPair getMinDistance(String word1, String word2){
        LinkedList<Integer> list1 = map.get(word1);
        LinkedList<Integer> list2 = map.get(word2);

        int ptrList1 = 0;
        int ptrList2 = 0;
        LocationPair best = new LocationPair(list1.get(0), list2.get(0));
        LocationPair current = new LocationPair(list1.get(0), list2.get(0));

        while(ptrList1 < list1.size() && ptrList2 < list2.size()){
            current.setLocations(list1.get(ptrList1), list2.get(ptrList2));
            best.updateMin(current);

            //Move only index that points to smaller value
            if(current.position1 < current.position2){
                ptrList1++;
            } else {
                ptrList2++;
            }
        }

        return best;
    }

}
