package LinkedList;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 8/11/2017.
 */
public class Q6Test {

    @Test
    public void testIsPermutation() throws Exception {

        LinkedListNode head = new LinkedListNode(1);

        //TODO: refactor it to something more elegant
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(3);
        head.next.next.next = new LinkedListNode(4);
        head.next.next.next.next = new LinkedListNode(3);
        head.next.next.next.next.next = new LinkedListNode(2);
        head.next.next.next.next.next.next = new LinkedListNode(1);
        assertTrue(Q6.isPermutation(head));

        head.next.next.next.next.next.next = new LinkedListNode(5);
        assertFalse(Q6.isPermutation(head));

        head = new LinkedListNode(1);
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(3);
        head.next.next.next = new LinkedListNode(3);
        head.next.next.next.next = new LinkedListNode(2);
        head.next.next.next.next.next= new LinkedListNode(1);
        assertTrue(Q6.isPermutation(head));
    }

    @Test
    public void testIsPermutationUnknownSize() throws Exception {

        LinkedListNode head = new LinkedListNode(1);

        //TODO: refactor it to something more elegant
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(3);
        head.next.next.next = new LinkedListNode(4);
        head.next.next.next.next = new LinkedListNode(3);
        head.next.next.next.next.next = new LinkedListNode(2);
        head.next.next.next.next.next.next = new LinkedListNode(1);
        assertTrue(Q6.isPermutation(head));

        head.next.next.next.next.next.next = new LinkedListNode(5);
        assertFalse(Q6.isPermutationUnknownSize(head));

        head = new LinkedListNode(1);
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(3);
        head.next.next.next = new LinkedListNode(3);
        head.next.next.next.next = new LinkedListNode(2);
        head.next.next.next.next.next= new LinkedListNode(1);
        assertTrue(Q6.isPermutation(head));
    }
}
