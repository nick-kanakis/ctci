package LinkedList;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nicolas on 8/11/2017.
 */
public class Q4Test {

    @Test
    public void testPartition() throws Exception {
        LinkedListNode head = new LinkedListNode(3);

        //TODO: refactor it to something more elegant
        head.next = new LinkedListNode(5);
        head.next.next = new LinkedListNode(8);
        head.next.next.next = new LinkedListNode(5);
        head.next.next.next.next = new LinkedListNode(10);
        head.next.next.next.next.next = new LinkedListNode(2);
        head.next.next.next.next.next.next = new LinkedListNode(1);



        head = Q4.partition(head, 5);

        assertTrue(head.data < 5);
        assertTrue(head.next.data < 5);
        assertTrue(head.next.next.data < 5);
        assertTrue(head.next.next.next.data >= 5);
        assertTrue(head.next.next.next.next.data >= 5);
        assertTrue(head.next.next.next.next.next.data >= 5);
        assertTrue(head.next.next.next.next.next.next.data >= 5);
    }
}
