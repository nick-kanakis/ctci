package Moderate;

/**
 * Created by Nicolas on 15/1/2018.
 */
public class Q9 {

    //Be careful when a<0 && b<0
    public static int multiply(int a, int b) {
        int result = 0;
        if(b<a)
            return multiply(b,a);

        if(a<0 && b<0){
            a = Math.abs(a);
        }

        for (int i = 0; i < Math.abs(b); i++) {
            result += a;
        }
        return result;
    }

    public static int subtract(int a, int b) {

        return a+negate(b);
    }

    //Be careful when only one of a, b is <0
    public static int divide(int a, int b) {
        boolean shouldBeReversed = false;
        if((a>0 && b<0 ) || (b>0 && a<0 ))
            shouldBeReversed = true;
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0)
            return -1;

        int result = 0;

        for (int i = 1; i < a; i++) {
            if (multiply(i, b) == a)
                result =  i;
            if (multiply(i, b) > a)
                break;
            result = i;
        }
        if(shouldBeReversed)
            return negate(result);
        return result;
    }

    private static int negate(int number) {

        return multiply(-1, number);
    }
}
