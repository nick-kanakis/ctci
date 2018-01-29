package Hard;

public class Q21 {

    public static int calculateHistogramVolume(int[] histogram) {
        //Starting from left to right find the max values
        int[] leftToRight = calculateMaxFromLeftToRight(histogram);
        //Starting from right to left find the max values
        int[] rightToLeft = calculateMaxFromRightToLeft(histogram);
        //min of 2 arrays above
        int[] min = calculateMin(rightToLeft, leftToRight);
        //Difference of histogram and min
        int[] delta = getDelta(histogram, min);

        return sumOfArray(delta);
    }

    private static int[] calculateMaxFromLeftToRight(int[] histogram) {
        int[] leftToRight = new int[histogram.length];
        int currentMax = 0;
        for (int i = 0; i < histogram.length; i++) {
            if (histogram[i] > currentMax) {
                currentMax = histogram[i];
            }
            leftToRight[i] = currentMax;
        }
        return leftToRight;
    }

    private static int[] calculateMaxFromRightToLeft(int[] histogram) {
        int[] rightToLeft = new int[histogram.length];
        int currentMax = 0;
        for (int i = histogram.length - 1; i >= 0; i--) {
            if (histogram[i] > currentMax) {
                currentMax = histogram[i];
            }
            rightToLeft[i] = currentMax;
        }
        return rightToLeft;
    }

    private static int[] calculateMin(int[] leftToRight, int[] rightToLeft) {
        int[] min = new int[leftToRight.length];

        for (int i = 0; i < leftToRight.length; i++) {
            if (leftToRight[i] < rightToLeft[i])
                min[i] = leftToRight[i];
            else
                min[i] = rightToLeft[i];
        }
        return min;
    }

    private static int[] getDelta(int[] histogram, int[] min) {
        int[] delta = new int[histogram.length];

        for (int i = 0; i < histogram.length; i++) {
            delta[i] = min[i] - histogram[i];
        }
        return delta;
    }

    private static int sumOfArray(int[] delta) {
        int sum = 0;

        for (int i : delta) {
            sum +=i;
        }
        return sum;
    }

}
