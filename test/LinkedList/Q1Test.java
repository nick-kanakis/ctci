package LinkedList;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 8/11/2017.
 */
public class Q1Test {

    @Test
    public void testRemoveDuplicates() throws Exception {
        LinkedListNode head = new LinkedListNode(0);
        LinkedListNode current = head;

        for (int i = 1; i <= 5; i++) {
            current.next = new LinkedListNode(i);
            current = current.next;
        }

        LinkedListNode uniqueHead = Q1.removeDuplicates(head);
        Set<Integer> set = new HashSet<>();

        while (uniqueHead != null){
            assertFalse(set.contains(uniqueHead.data));
            set.add(uniqueHead.data);
            uniqueHead = uniqueHead.next;
        }

        for (int i = 1; i <= 5; i++) {
            current.next = new LinkedListNode(i);
            current = current.next;
        }

        uniqueHead = Q1.removeDuplicates(head);
        set = new HashSet<>();

        while (uniqueHead != null){
            assertFalse(set.contains(uniqueHead.data));
            set.add(uniqueHead.data);
            uniqueHead = uniqueHead.next;
        }
    }

    @Test
    public void testRemoveDuplicatesWithoutExtraDS() throws Exception {
        LinkedListNode head = new LinkedListNode(0);
        LinkedListNode current = head;

        for (int i = 1; i <= 5; i++) {
            current.next = new LinkedListNode(i);
            current = current.next;
        }

        LinkedListNode uniqueHead = Q1.removeDuplicatesWithoutExtraDS(head);
        Set<Integer> set = new HashSet<>();

        while (uniqueHead != null){
            assertFalse(set.contains(uniqueHead.data));
            set.add(uniqueHead.data);
            uniqueHead = uniqueHead.next;
        }

        for (int i = 1; i <= 5; i++) {
            current.next = new LinkedListNode(i);
            current = current.next;
        }

        uniqueHead = Q1.removeDuplicatesWithoutExtraDS(head);
        set = new HashSet<>();

        while (uniqueHead != null){
            assertFalse(set.contains(uniqueHead.data));
            set.add(uniqueHead.data);
            uniqueHead = uniqueHead.next;
        }

    }
}
