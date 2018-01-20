package Moderate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * We first map all words of the dictionary with a sequence of digits, in a sequence may correspond many words
 * so we use a Map<String, ArrayList<String>>.
 *
 * After initializing the map the discovery time is O(1). The initialization takes O(KM) where K is the number of words
 * and M is the size of max word.
 */
public class Q20 {
    /*Maps a series of digits with a set of possible words*/
    private Map<String, ArrayList<String>> map = new HashMap<>();
    private Map<Character, String> char2digitMap = characters2Digits();

    public Q20(ArrayList<String> dictionary) {
        /*
        * Build up the map of digit sequences and corresponding valid words.
        * */
        for (String word : dictionary) {
            //Create the digit sequence for each character
            StringBuilder sb = new StringBuilder();
            for (char character : word.toCharArray()) {
                sb.append(char2digitMap.get(character));
            }
            String digitSequence = sb.toString();
            if (map.containsKey(digitSequence)) {
                map.get(digitSequence).add(word);
            } else {
                ArrayList<String> possibleWords = new ArrayList<>();
                possibleWords.add(word);
                map.put(digitSequence, possibleWords);
            }
        }
    }

    /*
    * Input should be a series of digits 2-9
    * */
    public ArrayList<String> t9Suggestion(String digitSequence){
        if (map.containsKey(digitSequence))
            return map.get(digitSequence);
        else
            return new ArrayList<>();
    }


    private Map<Character, String> characters2Digits() {
        Map<Character, String> char2digitMap = new HashMap<>();
        char2digitMap.put('a', "2");
        char2digitMap.put('b', "2");
        char2digitMap.put('c', "2");
        char2digitMap.put('d', "3");
        char2digitMap.put('e', "3");
        char2digitMap.put('f', "3");
        char2digitMap.put('g', "4");
        char2digitMap.put('h', "4");
        char2digitMap.put('i', "4");
        char2digitMap.put('j', "5");
        char2digitMap.put('k', "5");
        char2digitMap.put('l', "5");
        char2digitMap.put('m', "6");
        char2digitMap.put('n', "6");
        char2digitMap.put('o', "6");
        char2digitMap.put('p', "7");
        char2digitMap.put('q', "7");
        char2digitMap.put('r', "7");
        char2digitMap.put('s', "7");
        char2digitMap.put('t', "8");
        char2digitMap.put('u', "8");
        char2digitMap.put('v', "8");
        char2digitMap.put('w', "9");
        char2digitMap.put('x', "9");
        char2digitMap.put('y', "9");
        char2digitMap.put('z', "9");

        return char2digitMap;
    }
}
