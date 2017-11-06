package Arrays_Strings;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nicolas on 6/11/2017.
 */
public class Q1 {

    /*
    * Add each element in a hashtable, if the char already exists it contains duplicates
    * */
    public static boolean isUnique(String input){
        char []inputChars = input.toCharArray();
        Set<Character> set = new HashSet<>();

        for(char currentChar : inputChars){
            if(set.contains(currentChar))
                return false;
            set.add(currentChar);
        }
        return true;
    }

    /*
    * Sort the string and check if there are 2 same chars (there will be one after the other)
    * */
    public static boolean isUniqueWithoutExtraDS(String input){
        char []inputChars = input.toCharArray();
        Arrays.sort(inputChars);
        for(int i =0; i<inputChars.length -1; i++){
            if ( inputChars[i] == inputChars[i+1]){
                return false;
            }
        }
        return true;
    }
}
