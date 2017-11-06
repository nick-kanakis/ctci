package Arrays_Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nicolas on 6/11/2017.
 */
public class Q2 {

    /*
    * Sort both strings if they are not equal they are permutation of each other
    * */
    public static boolean isPermutation(String input1, String input2) {
        //TODO: check input for null
        if (input1.length() != input2.length())
            return false;

        char[] input1Chars = input1.toCharArray();
        char[] input2Chars = input2.toCharArray();

        Arrays.sort(input1Chars);
        Arrays.sort(input2Chars);

       for(int i = 0; i< input1Chars.length; i++){
           if(input1Chars[i]!= input2Chars[i])
               return false;
       }

       return true;
    }

    /*
    * Insert all chars of first string in a hashmap, remove all strings of second string
    * from the hashmap, if an element does not exist or at the end the hashmap is not empty return false
    * */
    public static boolean isPermutationWithExtraDS(String input1, String input2) {
        //TODO: check input for null
        if (input1.length() != input2.length())
            return false;

        char[] input1Chars = input1.toCharArray();
        char[] input2Chars = input2.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : input1Chars) {
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : input2Chars) {
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) - 1);
            } else {
                return false;
            }
        }

        for(int count: map.values()){
            if(count!=0)
                return false;
        }
        return true;
    }
}
