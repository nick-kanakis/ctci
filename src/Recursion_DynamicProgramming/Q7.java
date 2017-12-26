package Recursion_DynamicProgramming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * If you know the permutations of {a,b} we can find the permutations of {a,b,c}  just by adding c in
 * every possible position in the permutations of {a,b}
 */
public class Q7 {

    public static ArrayList<String> findEveryPermutation(String input){
        ArrayList<String> permutations = new ArrayList<>();
        if(input.length()==0){
            permutations.add("");
            return permutations;
        }
        //Get first char
        char first = input.charAt(0);
        //Remaining string without the first char
        String remainingSubstring = input.substring(1);

        //Find permutations of remaining String from above
        ArrayList<String> previousPermutations = findEveryPermutation(remainingSubstring);

        //For each permutation from previous call add the first char that
        //was removed before in every position
        for (String word: previousPermutations) {
            for (int i = 0; i <= word.length(); i++) {
                String s = insertCharAt(word, first, i);
                permutations.add(s);
            }
        }
        return permutations;
    }

    private static String insertCharAt(String word, char newChar, int positionToInser) {
        String start = word.substring(0, positionToInser);
        String end = word.substring(positionToInser);
        return start + newChar +end;
    }

}
