package Arrays_Strings;

/**
 * Created by Nicolas on 6/11/2017.
 */
public class Q9 {

    /**
     *  If s1 is a rotation of s2 then s2+s2 must contain s1.
     *
     *  eg. s1: waterbottle s2: ttlewaterbo
     *
     *  s2+s2 = ttle[waterbottle]waterbo
     *
     */

    public static boolean isRotation(String s1, String s2){
        return isSubstring(s1, s2+s2);
    }

    private static boolean isSubstring(String subString, String original){
        return original.contains(subString);
    }
}
