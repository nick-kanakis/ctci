package Stack_Queue;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 9/11/2017.
 */
public class Q3Test {

    @Test
    public void testSetOfStacks() throws Exception {
        Q3_SetOfStacks stack = new Q3_SetOfStacks(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        assertEquals(10, stack.pop());
        assertEquals(9, stack.pop());
        assertEquals(8, stack.pop());
        assertEquals(7, stack.pop());
        assertEquals(6, stack.pop());
        assertEquals(5, stack.pop());
        assertEquals(4, stack.pop());

    }

    @Test
    public void testSetOfStacksPopAt() throws Exception {
        Q3_SetOfStacks stack = new Q3_SetOfStacks(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);

        assertEquals(3, stack.popAt(1));
        assertEquals(6, stack.popAt(2));
        assertEquals(5, stack.popAt(2));
        assertEquals(4, stack.popAt(2));
        assertEquals(10, stack.popAt(4));

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);

        assertEquals(10, stack.pop());
        assertEquals(9, stack.pop());
        assertEquals(8, stack.pop());
        assertEquals(7, stack.pop());
        assertEquals(6, stack.pop());
        assertEquals(5, stack.pop());
        assertEquals(4, stack.pop());
    }
}
