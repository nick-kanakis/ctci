package Hard;

/**
 * Created by Nicolas on 21/1/2018.
 */
public class Q1 {

    public static int add(int a, int b) {
       int sum = 0;
       int carry = 0;

       if(a == 0 )
           return b;
       if(b == 0)
           return a;
       /*
       * At this step we binary add a, b without caring about the carry.
       * This will be calculated in the next step.
       *
       * Why XOR?
       * a =   101
       * b =   111
       * sum = 010 (without carry)
       *
       * This is a XOR operation
       * */
       sum = a ^ b;

       /*
       * At this step we calculate the carry.
       *
       * a =      101
       * b =      111
       * carry = 1010
       *
       * This is like a&b but shifted by 1 to the left
       * */
       carry = (a&b) <<1;

       return add(sum, carry);
    }

}
