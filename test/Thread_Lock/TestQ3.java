package Thread_Lock;

import Thread_Locks.Q3.Chopstick;
import Thread_Locks.Q3.Philosopher;
import org.junit.Test;

/* This is not an actual test, it just illustrates how the Dinning philosopher might be executed*/

public class TestQ3 {

    @Test
    public void testDinningPhilosophers()  {
        Chopstick chopstick1 = new Chopstick(1);
        Chopstick chopstick2 = new Chopstick(2);
        Chopstick chopstick3 = new Chopstick(3);

        Philosopher phil1 = new Philosopher(chopstick1, chopstick2, 1, 10);
        Philosopher phil2 = new Philosopher(chopstick2, chopstick3, 2, 10);
        Philosopher phil3 = new Philosopher(chopstick3, chopstick1, 3, 10);

        phil1.start();
        phil2.start();
        phil3.start();
    }
}
