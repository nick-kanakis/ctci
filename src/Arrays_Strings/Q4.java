package Arrays_Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nicolas on 6/11/2017.
 */
public class Q4 {

    /*
    * Insert each letter to a Hashmap. If the letter exists increase the occurrences number.
    * Iterate the map. If you find more than 1 character with odd number of occurrences return false,
    * else true
    * */
    public static boolean isPalindrome(String input) {
        //TODO: check input for null
        char[] chars = input.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : chars) {
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        return hasMoreThanOneUniqueChars(map);

    }

    private static boolean hasMoreThanOneUniqueChars(Map<Character, Integer> map) {
        int unique = 0;
        for(int value : map.values()){
            if(value%2 != 0){
                unique++;
                if(unique>1)
                    return false;
            }
        }
        return true;
    }

    /*
    * To do this in place. Sort the string. And iterate throw, if a series of same chars is odd increase a counter.
    * If the counter is more than one return false else true.
    * Avoid it too complicated
    * */
    public static boolean isPalindromeWithoutExtraDS(String input) {
        //TODO: check input for null
        int countOfCurrentChar = 1;
        int uniqueOccurrencesCount = 0;
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        char previousChar = chars[0];


        for(int i = 1 ; i< chars.length ; i++){
            if (chars[i] == previousChar){
                countOfCurrentChar++;
                previousChar = chars[i];
            } else {
                 if(countOfCurrentChar%2 !=0){
                     uniqueOccurrencesCount++;
                     if( uniqueOccurrencesCount >1){
                         return false;
                     }
                 }
                countOfCurrentChar = 1;
                previousChar = chars[i];
            }
        }
        return true;
    }
}
