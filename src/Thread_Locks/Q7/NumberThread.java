package Thread_Locks.Q7;

/**
 * This thread prints every number that is not printed by the other 3 thread
 */
public class NumberThread extends Thread {

    private static int count = 0;
    private int max = 0;

    public NumberThread(int max) {
        this.max = max;
    }

    public void run() {
        synchronized (this) {
            while (max >= count) {
                if (count % 3 != 0 && count % 5 != 0) {
                    System.out.println(count);
                }
                count++;
            }
        }
    }
}
