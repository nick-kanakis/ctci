package Thread_Lock;

import Thread_Locks.Q7.BuzzThread;
import Thread_Locks.Q7.FizzBuzzThread;
import Thread_Locks.Q7.FizzThread;
import Thread_Locks.Q7.NumberThread;
import org.junit.Test;

/**
 * Created by Nicolas on 13/1/2018.
 */
public class TestQ7 {

    @Test
    public void testFizzBuzz() throws Exception {
         Thread[] threads = new Thread[]{
                new FizzThread(100),
                new BuzzThread(100),
                new FizzBuzzThread(100),
                new NumberThread(100)
        };

        for (Thread thread : threads) {
            thread.start();
        }
        Thread.sleep(5000);
    }
}
