package Sorting_Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * First create a buckets map that for each key holds multiple strings. 2 anagrams when sorted are equal so this fact
 * can be used as a key to our buckets. After create the buckets, simple retrieve (bucket by bucket) the strings and
 * add them to the array.
 */
public class Q2 {

    public static void groupAnagrams(String[] anagrams){

        //Buckets that hold multiple String for one Key
        HashMap<String,ArrayList<String>> buckets = new HashMap<>();

        //Add strings to buckets, key of a bucket is the sorted string (is always true in an anagram)
        for (String str: anagrams ) {
            String sortedString = sortString(str);
            if(buckets.containsKey(sortedString)){
                buckets.get(sortedString).add(str);
            } else {
                ArrayList<String> bucket = new ArrayList<>();
                bucket.add(str);
                buckets.put(sortedString, bucket);
            }
        }

        //Construct the result array.
        int counter = 0;
        for (ArrayList<String> bucket: buckets.values()) {
            for (String str : bucket) {
                anagrams[counter] = str;
                counter++;
            }
        }
    }

    private static String sortString(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
