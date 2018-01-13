package Thread_Locks.Q7;

/**
 * This thread prints only Buzz
 */
public class BuzzThread extends Thread {

    private static int count = 0;
    private int max = 0;

    public BuzzThread(int max) {
        this.max = max;
    }

    public void run() {
        synchronized (this) {
            while (max >= count) {
                if (count % 3 != 0 && count % 5 == 0) {
                    System.out.println(count +" :Buzz");
                }
                count++;
            }
        }
    }
}
