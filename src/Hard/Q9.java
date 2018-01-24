package Hard;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Create future values ahead of step, this is the main point.
 * First add initial values 3, 5, 7
 * Repeat K times:
 *      Find minimum value, remove ALL OCCURRENCES, and return the min
 *      Based on that min value add to the queue the new products (min*3, min*5, min*7)
 *Return min value
 */
public class Q9 {

    public static int getKthMagicNumber(int k) {
        Queue<Integer> queue = new LinkedList<>();
        addProducts(queue, 1);

        int min = 0;
        for (int i = 0; i < k; i++) {
            min = removeMinimum(queue);
            addProducts(queue, min);
        }
        return min;
    }

    private static int removeMinimum(Queue<Integer> queue) {
        Integer min = Integer.MAX_VALUE;
        for (Integer integer : queue) {
            if (min > integer) {
                min = integer;
            }
        }
        /*There are duplicates of min so remove them all*/
        while (queue.contains(min)) {
            queue.remove(min);
        }
        return min;
    }

    private static void addProducts(Queue<Integer> queue, int value) {
        queue.add(value * 3);
        queue.add(value * 5);
        queue.add(value * 7);
    }
}
