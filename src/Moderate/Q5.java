package Moderate;

/**
 * The number of zeros in the end of the factor is linked to the number of elements that are divided by 5.
 *
 * In the following code we first find if a number is divided by 5. Then we count how many times it can be divided by 5.
 *
 * eg 5 can be divided only 1 5/5 = 0
 *    15 can be divided only 1 15/5 = 3 , 3/5 = 0.6
 *    25 can be divided 2 times 25/5 = 5, 5/5 = 0
 */
public class Q5 {

    public static int factorialZeros(int n){
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if(i%5==0){
                int contribution = i;
                while(contribution%5==0 && contribution !=0){
                    count++;
                    contribution = contribution/5;
                }
            }
        }
        return count;
    }
}
