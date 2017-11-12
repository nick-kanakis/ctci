package Stack_Queue;

import Stack_Queue.helper.MyStack;

/**
 * Created by Nicolas on 10/11/2017.
 */
public class Q5 {

    private static MyStack<Integer> tmpStack = new MyStack<>();

    /*
    * First we move one element to the temporary stack.
    *
    * Then we create a MAX -> MIN stack to the temporary stack moving one element from original stack at a time and shifting
    * all elements from tmp -> original until we find the correct position for the element.
    *
    * Finally we transfer all elements from tmp to original So now we have the MIN -> MAX stack we want.
    *
    * */
    public static MyStack<Integer> sortStack(MyStack<Integer> stack){
        //TODO: check for null or empty input.

        // Move one element from input to tmpStack. Now the tmp Stack is sorted (since there is only one element)
        shiftElement(stack, tmpStack);

        while(!stack.isEmpty()){
            int currentElement = stack.pop();

            //Find the correct position of currentElement into the tmpStack.
            while (!tmpStack.isEmpty() && tmpStack.peek() > currentElement){
                shiftElement(tmpStack, stack);
            }
            tmpStack.push(currentElement);
        }

        /*
        * Currently we have all elements in tmpStack MAX element is at the top and MIN element
        * is at the bottom. We have to move them to stack and return stack
        * */
        while (!tmpStack.isEmpty()){
            shiftElement(tmpStack, stack);
        }

        return stack;
    }

    private static void shiftElement(MyStack<Integer> sourceStack, MyStack<Integer> destinationStack) {
        destinationStack.push(sourceStack.pop());
    }
}
