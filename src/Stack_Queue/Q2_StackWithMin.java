package Stack_Queue;

import Stack_Queue.helper.MyStack;

/**
 * In order to keep track of the min we have a second stack that keeps track of the min.
 * Whenever we insert something to the main stack if it is less than the current element in the min stack we push it
 * in both stacks.
 *
 * Whenever an element is popped from the main stack it is compared to the top of the min stack if it is the same we pop
 * both stacks.
 */
public class Q2_StackWithMin {
    MyStack<Integer> stack = new MyStack<>();
    MyStack<Integer> minValuesStack = new MyStack<>();

    public void push(int element){
        if(minValuesStack.isEmpty())
            minValuesStack.push(element);
        else if(element <= minValuesStack.peek()){
            minValuesStack.push(element);
        }
        stack.push(element);

    }

    public int pop(){
        int returnedValue = stack.pop();
        if(returnedValue == minValuesStack.peek())
            minValuesStack.pop();
        return returnedValue;
    }

    public int min(){
        return minValuesStack.peek();
    }

}



