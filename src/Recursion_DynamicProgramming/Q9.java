package Recursion_DynamicProgramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The slow solution is obvious. You generate all possible combinations by recursively adding () at the front,
 * at the end, or ( + WORD +) around. To avoid duplicates a hashset is used.
 *
 * The second solution in more elegant. The String is created as it goes, and there is a count of how many paren left & right
 * still remain. There a index that points to the position that is being modified at the current call.
 *
 * The recursive call will generate the following sequence for n =3 :
 * 1] ((()))
 * 2] (()())
 * 3] (())()
 * 4] ()(())
 * 5] ()()()
 */
public class Q9 {

    public static Set<String> generateParenthesesSlowSolution(int n){
        //In order to avoid duplicates we insert the results in a set.
        Set<String> currentLevelParentheses = new HashSet<>();

        if(n == 1){
            String initialParenthesis = "()";
            currentLevelParentheses.add(initialParenthesis);
            return currentLevelParentheses;
        }
        Set<String> previousParentheses = generateParenthesesSlowSolution(n-1);

        for (String previousParenthesis: previousParentheses) {
            currentLevelParentheses.add("()"+previousParenthesis);
            currentLevelParentheses.add(previousParenthesis+"()");
            currentLevelParentheses.add("("+previousParenthesis+")");
        }

        return currentLevelParentheses;
    }

    public static List<String> generateParentheses(int n){
        List<String> results = new ArrayList<>();
        int countTotalParentheses = n * 2;
        char[] str = new char[countTotalParentheses];
        generateParenthesesHelper(results, n, n, str,  0);
        return results;
    }

    private static void generateParenthesesHelper(List<String> list, int leftParenRemaining, int rightParenRemaining, char[] str, int index) {
        //invalid state
        if(leftParenRemaining<0 || rightParenRemaining<leftParenRemaining)
            return;
        //No more parenthesis remaining (left or right) add the string to the result list
        if(leftParenRemaining == 0 && rightParenRemaining==0)
            list.add(String.copyValueOf(str));
        else {
            str[index] = '(';
            generateParenthesesHelper(list, leftParenRemaining - 1, rightParenRemaining, str, index+1);
            str[index] = ')';
            generateParenthesesHelper(list, leftParenRemaining , rightParenRemaining- 1, str, index+1);

        }
    }

}
