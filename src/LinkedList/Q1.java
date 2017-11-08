package LinkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nicolas on 8/11/2017.
 */
public class Q1 {

    /*
    * Iterate each node and insert it into a hashset if it doesn't exist. If it does exist you need to delete the node.
    *
    * Warning: When deleting a node do not move the previous pointer
    *
     */
    public static LinkedListNode removeDuplicates(LinkedListNode node) {
        //Todo check input
        Set<Integer> set = new HashSet<>();
        LinkedListNode previous = null;
        LinkedListNode head = node;

        while (node != null) {
            if (set.contains(node.data)) {
                /* You should not move previous pointer when you delete a node.
                 * This will cause the pointer to point to the deleted node.
                 * */
                previous.next = node.next;
            } else {
                previous = node;
                set.add(node.data);
            }
            node = node.next;
        }
        return head;
    }

    /*
    * Here we have 2 pointers the main pointer (outer loop) iterates the each node. For every node it visits
    * the second pointer(fastPointer) will iterate the remaining elements from main pointer to the end. If there is another
    * node with the same value as main pointer it must be deleted.
    * */
    public static LinkedListNode removeDuplicatesWithoutExtraDS(LinkedListNode node) {
        //Todo check input

        LinkedListNode head = node;

        while (node!=null){
            LinkedListNode fastPointer = node.next;
            LinkedListNode previous = node;

            while(fastPointer !=null){
                if(fastPointer.data == node.data){
                    previous.next = fastPointer.next;
                } else {
                    previous = fastPointer;
                }
                fastPointer = fastPointer.next;
            }
            node = node.next;
        }
        return head;
    }
}
