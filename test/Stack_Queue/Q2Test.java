package Stack_Queue;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 9/11/2017.
 */
public class Q2Test {

    @Test
    public void testStackWithMin() throws Exception {
        Q2_StackWithMin stack = new Q2_StackWithMin();

        stack.push(10);
        stack.push(50);
        stack.push(5);
        stack.push(4);

        assertEquals(4, stack.min());
        assertEquals(4, stack.pop());
        assertEquals(5, stack.min());
        assertEquals(5, stack.pop());
        assertEquals(10, stack.min());

        stack.push(1);
        stack.push(2);
        assertEquals(1, stack.min());
        assertEquals(2, stack.pop());
    }
}
