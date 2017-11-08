package LinkedList;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 9/11/2017.
 */
public class Q8Test {

    @Test
    public void testLoopDetection() throws Exception {
        //TODO: refactor it to something more elegant
        LinkedListNode head = new LinkedListNode(1);
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(3);
        head.next.next.next = new LinkedListNode(4);
        head.next.next.next.next = new LinkedListNode(5);
        head.next.next.next.next.next = new LinkedListNode(6);
        head.next.next.next.next.next.next = new LinkedListNode(7);
        head.next.next.next.next.next.next.next = new LinkedListNode(8);
        head.next.next.next.next.next.next.next.next = new LinkedListNode(9);
        head.next.next.next.next.next.next.next.next.next =  head.next.next.next;


        /*
        *                 8 <- 7  <- 6
        *                 |        /
        *                 9     5
        *                 |  /
        *  1 -> 2 -> 3 -> 4
        *
        * */

        assertEquals(4, Q8.loopDetection(head));
    }
}
