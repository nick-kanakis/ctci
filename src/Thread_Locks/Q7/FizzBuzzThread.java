package Thread_Locks.Q7;

/**
 * Created by Nicolas on 13/1/2018.
 */
public class FizzBuzzThread extends Thread {

    private static int count = 0;
    private int max = 0;

    public FizzBuzzThread(int max) {
        this.max = max;
    }

    public void run() {
        synchronized (this) {
            while (max >= count) {
                if (count % 3 == 0 && count % 5 == 0) {
                    System.out.println(count +" :FizzBuzz");
                }
                count++;
            }
        }
    }
}
