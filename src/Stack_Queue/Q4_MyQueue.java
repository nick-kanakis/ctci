package Stack_Queue;

import Stack_Queue.helper.MyStack;

/**
 * When we enqueue an element we check if the stack2 is empty if it is not we move all the elements to the stack1, and
 * then push the new element into stack1.
 *
 * When we pop an element we check that stack1 is empty if it is not we move all elements to stack2 and pop the element
 * from stack stack2.
 *
 * In that way we always enqueue to the end and dequeue from the front. Also if we have multiple enqueues or dequeues one
 * after the other we do not wast time moving the elements from stacks.
 *
 * On other way to do it is to push elements only on s1, and always dequeue from s2. But if s2 is empty transfer all elements
 * from s1. This is a bit more complicated by more time efficient.
 */
public class Q4_MyQueue {
    MyStack<Integer> stack1 = new MyStack<>();
    MyStack<Integer> stack2 = new MyStack<>();

    public void enqueue( int value){
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        stack1.push(value);
    }

    public int dequeue(){

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public int peek(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    public boolean isEmpty(){

        return stack1.isEmpty();
    }
}
