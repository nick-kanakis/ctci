package Moderate;

import java.util.Arrays;

/**
 * Sort the 2 arrays and in each step move the pointer of the smaller value. In each step update if needed the minimum
 * value of diff.
 */
public class Q6 {

    public static class Difference{
        public int a, b, difference;

        public Difference(int a, int b, int difference) {
            this.a = a;
            this.b = b;
            this.difference = difference;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Difference that = (Difference) o;

            if (a != that.a) return false;
            if (b != that.b) return false;
            return difference == that.difference;
        }

        @Override
        public int hashCode() {
            int result = a;
            result = 31 * result + b;
            result = 31 * result + difference;
            return result;
        }
    }

    public static Difference getMinDifference(int[] array1, int[] array2){
        int pointer1 = 0;
        int pointer2 = 0;
        Difference difference = new Difference(0,0,Integer.MAX_VALUE);

        Arrays.sort(array1);
        Arrays.sort(array2);

        while(pointer1 < array1.length  && pointer2 < array2.length ){
            int diff = Math.abs(array1[pointer1] - array2[pointer2]);

            if(diff< difference.difference){
                difference.a = array1[pointer1];
                difference.b = array2[pointer2];
                difference.difference = diff;
            }

            if(array1[pointer1] < array2[pointer2]){
                pointer1++;
            } else{
                pointer2++;
            }
        }
        return difference;
    }

}
