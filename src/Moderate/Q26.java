package Moderate;

import java.util.LinkedList;

/**
 * First create a list with the sequence we need to compute, each node will have either a operator, or a (complete)
 * number.
 *
 * Then update the list to only contain + and -, so every multiplication and division should be calculated and added to the
 * list. CAREFUL -> Because we are removing and updating elements while iterating the list be extra careful with what deleting
 * and where the pointer points!
 *
 * After having the list with + and - just iterate 2 steps at a time and add sum the result.
 */
public class Q26 {
    private static final String DIV = "/";
    private static final String MULTIPLY = "*";
    private static final String ADD = "+";
    private static final String MINUS = "-";

    private static final char DIV_CHAR = '/';
    private static final char MULTIPLY_CHAR = '*';
    private static final char ADD_CHAR = '+';
    private static final char MINUS_CHAR = '-';

    public static double calculate(String expression) {
        char[] charArrayExpr = expression.toCharArray();

        LinkedList<String> expressionList = expression2List(charArrayExpr);
        calculateMultDiv(expressionList);
        return calculateAddMinus(expressionList);

    }

    /*Each "node" of the list will represent either a complete number (with all the digits) or an operator*/
    private static LinkedList<String> expression2List(char[] charArrayExpr) {
        LinkedList<String> expression = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charArrayExpr.length; i++) {

            if (charArrayExpr[i] == DIV_CHAR) {
                expression.add(sb.toString());
                sb.setLength(0);
                expression.add(DIV);
            } else if (charArrayExpr[i] == MULTIPLY_CHAR) {
                expression.add(sb.toString());
                sb.setLength(0);
                expression.add(MULTIPLY);
            } else if (charArrayExpr[i] == ADD_CHAR) {
                expression.add(sb.toString());
                sb.setLength(0);
                expression.add(ADD);
            } else if (charArrayExpr[i] == MINUS_CHAR) {
                expression.add(sb.toString());
                sb.setLength(0);
                expression.add(MINUS);
            } else {
                sb.append(charArrayExpr[i]);
            }
        }
        expression.add(sb.toString());

        return expression;
    }

    private static void calculateMultDiv(LinkedList<String> charArrayExpr) {

        for (int i = 1; i < charArrayExpr.size(); i++) {
            String current = charArrayExpr.get(i);
            if (current.equals(DIV)) {
                double result = Double.valueOf(charArrayExpr.get(i - 1)) *1.0 / Double.valueOf(charArrayExpr.get(i + 1));
                charArrayExpr.set(i, String.valueOf(result));
                charArrayExpr.remove(i - 1);
                charArrayExpr.remove(i);

                //Set counter back 1 in order to avoid skipping elements since we removed 2 elements from the list
                i--;
            } else if (current.equals(MULTIPLY)) {
                double result = Double.valueOf(charArrayExpr.get(i - 1)) * Double.valueOf(charArrayExpr.get(i + 1));
                charArrayExpr.set(i,String.valueOf(result));
                charArrayExpr.remove(i - 1);
                charArrayExpr.remove(i);
                i--;
            }
        }
    }

    private static double calculateAddMinus(LinkedList<String> expressionList) {
        double result = Double.valueOf(expressionList.get(0));

        for (int i = 1; i < expressionList.size() ; i+=1) {
            String current = expressionList.get(i);
            if (current.equals(ADD)) {
                result += Double.valueOf(expressionList.get(i+1));
            } else if (current.equals(MINUS)) {
                result -= Double.valueOf(expressionList.get(i+1));
            }
        }
        return result;
    }
}
