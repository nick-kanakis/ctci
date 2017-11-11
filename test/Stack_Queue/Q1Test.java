package Stack_Queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 9/11/2017.
 */
public class Q1Test {

    @Test
    public void testFixedMultiStack() throws Exception {
        Q1_FixedMultiStack fixedMultiStack = new Q1_FixedMultiStack(3);
        assertTrue(fixedMultiStack.isEmpty(0));
        assertTrue(fixedMultiStack.isEmpty(1));
        assertTrue(fixedMultiStack.isEmpty(2));

        fixedMultiStack.push(0, 1);
        fixedMultiStack.push(0, 2);
        fixedMultiStack.push(0, 3);
        assertEquals(3, fixedMultiStack.peek(0));
        assertEquals(3, fixedMultiStack.pop(0));
        assertEquals(2, fixedMultiStack.pop(0));
        fixedMultiStack.push(0, 4);
        assertEquals(4, fixedMultiStack.pop(0));
        assertFalse(fixedMultiStack.isEmpty(0));
        assertEquals(1, fixedMultiStack.pop(0));
        assertTrue(fixedMultiStack.isEmpty(0));

        fixedMultiStack.push(1, 10);
        fixedMultiStack.push(1, 20);
        fixedMultiStack.push(1, 30);
        assertEquals(30, fixedMultiStack.peek(1));
        assertEquals(30, fixedMultiStack.pop(1));
        assertEquals(20, fixedMultiStack.pop(1));
        fixedMultiStack.push(1, 40);
        assertEquals(40, fixedMultiStack.pop(1));
        assertFalse(fixedMultiStack.isEmpty(1));
        assertEquals(10, fixedMultiStack.pop(1));
        assertTrue(fixedMultiStack.isEmpty(1));

        fixedMultiStack.push(2, 100);
        fixedMultiStack.push(2, 200);
        fixedMultiStack.push(2, 300);
        assertEquals(300, fixedMultiStack.peek(2));
        assertEquals(300, fixedMultiStack.pop(2));
        assertEquals(200, fixedMultiStack.pop(2));
        fixedMultiStack.push(2, 400);
        assertEquals(400, fixedMultiStack.pop(2));
        assertFalse(fixedMultiStack.isEmpty(2));
        assertEquals(100, fixedMultiStack.pop(2));
        assertTrue(fixedMultiStack.isEmpty(2));

    }
}
