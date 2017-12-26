package Recursion_DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * The key here is to create a HashMap of unique char occurrences and based on that create the permutation.
 */
public class Q8 {

    public static ArrayList<String> findEveryPermutation(String input) {
        Map<Character, Integer> map = buildFreqTable(input);
        ArrayList<String> result = new ArrayList<>();
        getPermutations(map, "", input.length(), result);
        return result;
    }

    private static Map<Character, Integer> buildFreqTable(String input) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character currentChar : input.toCharArray()) {
            if (map.containsKey(currentChar))
                map.put(currentChar, map.get(currentChar) + 1);
            else
                map.put(currentChar, 1);
        }
        return map;
    }

    private static void getPermutations(Map<Character, Integer> map, String prefix, int remaining, ArrayList<String> result) {
        /*
        * If remaining == 0 this means that in this branch the prefix holds a complete permutation and there is no
        * more chars to branch
        * */
        if (remaining == 0) {
            result.add(prefix);
            return;
        }

        for (Character currentChar : map.keySet()) {
            int charFrequency = map.get(currentChar);

            if (charFrequency > 0) {
                /*
                * We add this char to the prefix (as part of the permutation) so decrease it from the map.
                * */
                map.put(currentChar, charFrequency - 1);
                /*
                * decrease remaining the character is added to the prefix
                * */
                getPermutations(map, prefix + currentChar, remaining - 1, result);
                //restore map frequency for use in next character.
                map.put(currentChar, charFrequency);
            }
        }

    }

}
