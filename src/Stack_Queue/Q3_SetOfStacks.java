package Stack_Queue;

import Stack_Queue.helper.MyStack;

import java.util.ArrayList;
import java.util.List;

/**
 * We set a maximum capacity for each stack, if a stack size exited maximum capacity a new stack is created, and is inserted
 * in the linked list. On the other hand when we pop an element and the stack is empty we delete the stack from the linkedlist.
 *
 * It is very important to keep track of the current capacity correctly!!
 *
 * For the FollowUp the popAt(i) method just pops up elements for the specific stack, this may cause some issues as we do not
 * provide a way to keep track of the status of each stack in our API. One solution would be to shift elements from the next
 * stack to the one we just popped.
 */
public class Q3_SetOfStacks {

    private int maxCapacity = 10;
    private int currentCapacity = 0;
    private List<MyStack<Integer>> stacks;

    public Q3_SetOfStacks() {
        stacks = new ArrayList<>();
    }

    public Q3_SetOfStacks(int maxCapacityOfStack) {
        maxCapacity = maxCapacityOfStack;
        stacks = new ArrayList<>();
    }

    public void push(int element){
        if(currentCapacity == maxCapacity){
            MyStack<Integer> newStack = new MyStack<>();
            currentCapacity = 1;
            newStack.push(element);
            stacks.add(newStack);
        } else{
            MyStack<Integer> stack = getCurrentStack();
            currentCapacity++;
            stack.push(element);
        }
    }

    private MyStack<Integer> getCurrentStack() {
        if(stacks.size() == 0){
            MyStack<Integer> newStack = new MyStack<>();
            stacks.add(newStack);
            return newStack;
        } else {
            return stacks.get(stacks.size() - 1);
        }
    }

    public int pop(){
        MyStack<Integer> stack = getCurrentStack();
        if(stack.isEmpty()){
            throw new RuntimeException("Empty Stack");
        }
        int returned = stack.pop();
        currentCapacity --;
        if(currentCapacity == 0){
            deleteCurrentStack();
            currentCapacity = maxCapacity;
        }
        return returned;
    }

    private void deleteCurrentStack() {
        if(stacks.size() == 0){
            throw new RuntimeException("No stacks available");
        }

        stacks.remove(stacks.size() - 1);
    }

    public int popAt(int i) {
        MyStack<Integer> stack = getStackAt(i);
        int element = stack.pop();

        if(stack.isEmpty())
            deleteStack(i);
        return element;
    }

    private void deleteStack(int i) {
        //todo check if exists
        stacks.remove(i);
    }

    private MyStack<Integer> getStackAt(int i) {
        //todo check if exists
       return stacks.get(i);
    }
}
