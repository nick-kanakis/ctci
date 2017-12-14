package OOD.Q2_CallCenter;

/**
 * Employee is the base class for each type of employee and have all the general methods that
 * will be used by any type.
 */
public abstract class Employee {
    private Call call;
    protected Rank rank;

    public boolean isOnCall(){
        return call == null;
    }

    private Rank getRank(){
        return rank;
    }

    public void receiveCall(Call call) {
        call = this.call;
    }

    public void escalateAndReassign(){
        //this methods find the next available employee of next level and assign the call to him.
        //Also set the current employee available for next call.
    }
}
