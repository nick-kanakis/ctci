package Recursion_DynamicProgramming;

import java.util.Objects;

/**
 * Iterate each operator and for each split the string into 2 parts left and right.
 *
 * Recursively calculate all possible results for each part:
 *  side - result
 *  #############
 *  left - true
 *  left - false
 *  right - true
 *  left - false
 *
 *  From this we can calculate alla possible ways for every result:
 *  (LeftTrue + LeftFalse) * (RightTrue + RightFalse)
 *
 *  Then depending on the type of operator (*, |, &) we calculate all possible ways to have a true result.
 */
public class Q14 {

    public static int countParenthesesOfBoolean(String input, boolean expectedResult){
        if(input.length() == 0)
            return 0;

        //Base case of 1 letter
        if(input.length() == 1)
            return stringToBool(input) == expectedResult ? 1 : 0;

        int result = 0;
        /*
        * The i points only to operators and not boolean values
        * */
        for (int i = 1; i < input.length(); i+=2) {
            char c = input.charAt(i);
            //Split the string into 2 strings the left & right portion
            String left = input.substring(0, i);
            String right = input.substring(i+1);

            // evaluate all possibilities
            int leftTrue = countParenthesesOfBoolean(left, true);
            int leftFalse = countParenthesesOfBoolean(left, false);
            int rightTrue = countParenthesesOfBoolean(right, true);
            int rightFalse = countParenthesesOfBoolean(right, false);

            /* Total ways to return results*/
            int total = (leftFalse+ leftTrue) * (rightFalse + rightTrue);
            //All ways to return true
            int totalTrue = 0;
            if (c == '^') {
                totalTrue = leftTrue*rightFalse  + leftFalse*rightTrue;
            }
            else if (c == '&'){
                totalTrue = leftTrue*rightTrue;
            }
            else if (c == '|'){
                totalTrue = leftTrue*rightTrue + leftFalse*rightTrue + leftTrue * rightFalse;
            }

            int subways  = expectedResult ? totalTrue : total - totalTrue;
            result+=subways;
        }
        return result;
    }

    private static boolean stringToBool(String input) {
        if("1".equals(input))
            return true;
        else
            return false;
    }
}
