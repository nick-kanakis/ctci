package Hard.Q15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nicolas on 27/1/2018.
 */
public class Q15 {

    public static String getLongestWord(String[] array){
        Arrays.sort(array, new LengthComparator());
        Set<String> set = new HashSet<>();

        for (String s : array) {
            set.add(s);
        }

        for (String s : array) {
            //The first one that can be build by other words is the longest since is sorted
            if(canBeBuildByOtherWords(s, set, true)){
                return s;
            }
        }
        return "";
    }

    /*
    * First check if the left side is a word, if not expand left side if it is,
    * do the same for the right side (recursively).
    *
    * Why we use the flag "isOriginal"
    *
    * eg: "dogwalker" iteration we will have
    *   left: dog
    *   right: walker
    *
    * We will call canBeBuildByOtherWords with walker as an argument we need to differentiate this walker, from the original
    * walker. This is done to avoid checking the original word with itshelf, while enabling to check if a substring is in the
    * dictionary.
    *
    * */
    private static boolean canBeBuildByOtherWords(String s, Set<String> set, boolean isOriginal) {

        if(!isOriginal && set.contains(s))
            return true;

        for (int i = 1; i <s.length(); i++) {
            String leftPart = s.substring(0, i);
            String rightPart = s.substring(i);

            if(set.contains(leftPart) && canBeBuildByOtherWords(rightPart,set, false))
                return true;
        }
        return false;
    }
}
