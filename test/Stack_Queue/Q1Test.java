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
        Q1_FixedMultiStack fixedMultiStack = new Q1_FixedMultiStack(10);
        assertTrue(fixedMultiStack.isEmpty(1));
        assertTrue(fixedMultiStack.isEmpty(2));
        assertTrue(fixedMultiStack.isEmpty(3));

        fixedMultiStack.push(1, 1);
        fixedMultiStack.push(1, 2);
        fixedMultiStack.push(1, 3);
        assertEquals(3, fixedMultiStack.peek(1));
        assertEquals(3, fixedMultiStack.pop(1));
        assertEquals(2, fixedMultiStack.pop(1));
        fixedMultiStack.push(1, 4);
        assertEquals(4, fixedMultiStack.pop(1));
        assertFalse(fixedMultiStack.isEmpty(1));
        assertEquals(1, fixedMultiStack.pop(1));
        assertTrue(fixedMultiStack.isEmpty(1));

        fixedMultiStack.push(2, 10);
        fixedMultiStack.push(2, 20);
        fixedMultiStack.push(2, 30);
        assertEquals(30, fixedMultiStack.peek(2));
        assertEquals(30, fixedMultiStack.pop(2));
        assertEquals(20, fixedMultiStack.pop(2));
        fixedMultiStack.push(2, 40);
        assertEquals(40, fixedMultiStack.pop(2));
        assertFalse(fixedMultiStack.isEmpty(2));
        assertEquals(10, fixedMultiStack.pop(2));
        assertTrue(fixedMultiStack.isEmpty(2));

        fixedMultiStack.push(3, 100);
        fixedMultiStack.push(3, 200);
        fixedMultiStack.push(3, 300);
        assertEquals(300, fixedMultiStack.peek(3));
        assertEquals(300, fixedMultiStack.pop(3));
        assertEquals(200, fixedMultiStack.pop(3));
        fixedMultiStack.push(3, 400);
        assertEquals(400, fixedMultiStack.pop(3));
        assertFalse(fixedMultiStack.isEmpty(3));
        assertEquals(100, fixedMultiStack.pop(3));
        assertTrue(fixedMultiStack.isEmpty(3));

    }
}
