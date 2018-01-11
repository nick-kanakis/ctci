package Thread_Locks.Q3;
/*
* In order to avoid the case where every Philosopher picks the left chopsticks at the same time, so they all put them down at
* the same time, and this repeats for ever. We need to break the cycle, so we number the chopsticks.
* Each philosopher picks ups the chopstick with the lowest value first and then the highest.
*
* This ensures that not all chopsticks will be picked at the same time.
* */
public class Philosopher extends Thread {

    private Chopstick low, high;
    private int index;
    private int bites;

    public Philosopher(Chopstick left, Chopstick right, int index, int bites) {

        if (left.getNumber() < right.getNumber()) {
            low = left;
            high = right;
        } else {
            low = right;
            high = left;
        }

        this.bites = bites;
        this.index = index;
    }

    private boolean pickUp() {
        System.out.println("Philosopher: "+index+" picking up low chopstick");
        if (!low.pickUp())
            return false;

        System.out.println("Philosopher: "+index+" picking up high chopstick");
        if (!high.pickUp()) {
            System.out.println("Philosopher: "+index+" putting down low chopstick");
            low.putDown();
            return false;
        }
        return true;
    }

    private boolean putDown(){
        System.out.println("Philosopher: "+index+" putting down low chopstick");
        low.putDown();
        System.out.println("Philosopher: "+index+" putting down high chopstick");
        high.putDown();
        return true;
    }

    public void eat() throws InterruptedException {

        for (int i = 0; i < bites; i++) {
            pickUp();
            sleep(500);
            putDown();
        }

    }

    public void run(){
        try {
            eat();
        } catch (InterruptedException e) {
            // log result
        }
    }
}
