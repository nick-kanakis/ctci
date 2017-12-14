package OOD.Q2_CallCenter;

import java.util.List;

/**
 * This is the main object tha dispatches calls, forwards it to next level employee and holds Calls in a queue.
 */
public class CallHandler {

    List<List<Call>> callQueue;
    List<List<Call>> employees;

    public CallHandler(List<List<Call>> employees) {
        this.employees = employees;
    }

    public void dispatchCall(Call call){
        Employee availableEmployee = getAvailableEmployeeFromList();
        if(availableEmployee == null){
            //there is no available employee add call to queue
        } else {
            availableEmployee.receiveCall(call);
            call.setHandler(availableEmployee);
        }
    }

    private Employee getAvailableEmployeeFromList() {
        //return available employee from employees
        return null;
    }
}
