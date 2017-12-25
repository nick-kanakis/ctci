package Recursion_DynamicProgramming;

/**
 * It takes O(s) where s is the smaller of a,b values. We can do better the book solution runs at O(log s)
 * We calculate half of the value and double it if the smaller number is even,
 * if it is odd we double it and add the bigger number.
 *
 * eg. 5, 6
 * smaller: 5, bigger 6
 *
 * smallerDividedBy2 = 2
 *      recursive call (2, 6) = 12
 * since smaller % 2 != 0 (odd)
 *  re return 12 + 12 + 6 = 30 (5*6)
 */
public class Q5 {

    public static int multiplyRecursively(int a, int b){
        //In order to minimize the number of recursive calls the times argument is set as the smallest.
        if(a >=b)
            return multiplyRecursivelyHelper(a, b);
         else
            return multiplyRecursivelyHelper(a, b);
    }

    private static int multiplyRecursivelyHelper(int value, int times) {
        if(times == 1)
            return value;
        return multiplyRecursivelyHelper(value, times-1) + value;
    }

    public static int multiplyRecursivelyBookSolution(int a, int b){
        //In order to minimize the number of recursive calls the times argument is set as the smallest.
        if(a >=b)
            return multiplyRecursivelyHelperBookSolution(a, b);
        else
            return multiplyRecursivelyHelperBookSolution(a, b);
    }

    private static int multiplyRecursivelyHelperBookSolution(int bigger, int smaller) {

        if(smaller == 0)
            return 0;
        else if(smaller == 1)
            return bigger;

        int smallerDividedBy2 = smaller>>1;
        int half = multiplyRecursivelyHelperBookSolution(bigger, smallerDividedBy2);

        if(smaller%2 == 0)
            return half+half;
        else
            return half+half+bigger;
    }
}
