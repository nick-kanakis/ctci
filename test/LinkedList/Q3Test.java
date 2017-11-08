package LinkedList;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 8/11/2017.
 */
public class Q3Test {

    @Test
    public void testDeleteMiddleNode() throws Exception {
        LinkedListNode head = new LinkedListNode(0);
        LinkedListNode current = head;

        for (int i = 1; i < 50; i++) {
            current.next = new LinkedListNode(i);
            current = current.next;
        }

        head = Q3.deleteMiddleNode(head, 20);

        while (head != null){
            assertTrue(head.data != 20);
            head = head.next;
        }
    }
}
