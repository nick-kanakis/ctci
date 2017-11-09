package LinkedList;

import LinkedList.helper.LinkedListNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 8/11/2017.
 */
public class Q2Test {

    @Test
    public void testReturnKthToLast() throws Exception {
        LinkedListNode head = new LinkedListNode(0);
        LinkedListNode current = head;

        for (int i = 1; i < 50; i++) {
            current.next = new LinkedListNode(i);
            current = current.next;
        }
        assertEquals(30, Q2.returnKthToLast(head, 20).data);
    }
}
