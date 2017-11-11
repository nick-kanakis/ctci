package Stack_Queue;

/**
 * It is much easier to store the size of each stack in a array and calculate the top/bottom on the fly instead
 * of having multiple pointers.
 *
 * The implementation is pretty straight forward, we create an array of NUMBER_OF_STACKS*given size of each stack.
 * we have a array size to hold the current size of each stack and 3 helper functions getTopIndex, isStackFull, isEmpty
 * that help with push & pop.
 *
 * isStackFull method is also responsible for not overriding the next stacks elements, as it set the max num of elements
 * a stack can have
 *
 */
public class Q1_FixedMultiStack {
    private static final int NUMBER_OF_STACKS = 3;
    private int stackCapacity;
    //holds the values of the stacks
    private int[] values;
    //holds the number of elements inserted in each stack
    private int[] sizes;


    public Q1_FixedMultiStack(int size) {
        stackCapacity = size;
        values = new int[NUMBER_OF_STACKS*size];
        sizes = new int[NUMBER_OF_STACKS];

    }

    public void push(int stack, int value){
        if(isStackFull(stack))
            throw new RuntimeException("Full Stack");

        //increase the size of the stack (top ptr is moved to next available slot)
        sizes[stack]++;

        //get the index
        values[getTopIndex(stack)] = value;

    }

    public int pop(int stack){
        if(isEmpty(stack))
            throw new RuntimeException("Empty Stack");

        int toBeReturned = values[getTopIndex(stack)];
        values[getTopIndex(stack)] = 0;
        sizes[stack]--;
        return toBeReturned;
    }


    public int peek(int stack){
        if(isEmpty(stack))
            throw new RuntimeException("Empty Stack");

        return values[getTopIndex(stack)];
    }

    public boolean isEmpty(int stack){

        return sizes[stack] == 0;
    }

    private boolean isStackFull(int stack){
        return sizes[stack] == stackCapacity;
    }

    /*
    * Get top index of each stack,
    *
    * sizes of each stack + offset - 1
    * */
    private int getTopIndex(int stack){
        return  sizes[stack] + stack*stackCapacity - 1;
    }
}
