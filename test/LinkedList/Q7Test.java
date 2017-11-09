package LinkedList;

import LinkedList.helper.LinkedListNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 8/11/2017.
 */
public class Q7Test {

    @Test
    public void testFindIntersection() throws Exception {
        //TODO: refactor it to something more elegant
        LinkedListNode head1 = new LinkedListNode(1);
        head1.next = new LinkedListNode(2);
        head1.next.next = new LinkedListNode(3);
        head1.next.next.next = new LinkedListNode(4);
        head1.next.next.next.next = new LinkedListNode(5);
        head1.next.next.next.next.next = new LinkedListNode(6);
        head1.next.next.next.next.next.next = new LinkedListNode(7);

        LinkedListNode head2 = new LinkedListNode(10);
        head2.next = new LinkedListNode(20);
        head2.next.next = new LinkedListNode(30);
        head2.next.next.next = new LinkedListNode(40);
        head2.next.next.next.next = head1.next.next;

        /*
        *                 1 - 2
        *                      \
        *                       3 - 4 - 5 - 6 - 7
        *                     /
        *  10 - 20 - 30 - 40
        *
        * */


        assertEquals(3, Q7.findIntersection(head1,head2));
    }
}
