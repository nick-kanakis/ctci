package Thread_Locks.Q3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {

    private Lock lock;
    private int number;

    public Chopstick(int number) {
        this.lock = new ReentrantLock();
        this.number = number;
    }

    public boolean pickUp(){
        return lock.tryLock();
    }

    public void putDown(){
        lock.unlock();
    }

    public int getNumber() {
        return number;
    }
}
