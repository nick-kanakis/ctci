package LinkedList;

import LinkedList.helper.LinkedListNode;

/**
 * Created by Nicolas on 8/11/2017.
 */
public class Q7 {

    /*
    * If the lists were the same size we could find the intersection by iterating one node at a time and comparing them.
    *
    * But the lists are not the same however we can fix that by moving the pointer of the longest list k-times. Where k
    * is the difference between longest - shortest lists length.
    *
    * Tip: You can check the the tail of the lists is the same at the start of the program. If it is not then there is no
    * intersection and avoid doing all the iterations.
    *
    * */
    public static int findIntersection(LinkedListNode head1, LinkedListNode head2){
        //todo check for null input
        int length1 = lengthOfList(head1);
        int length2 = lengthOfList(head2);

        //Warning do not add zeros to match the longest list, move the pointer of longest to match the shortest list
        if(length1 > length2){
            for (int i = 0; i < length1 - length2; i++) {
                head1 = head1.next;
            }
        }
        else if (length2 > length1) {
            for (int i = 0; i < length2 - length1 ; i++) {
                head2 = head2.next;
            }
        }

        //Both pointers are in the same distance from the end iterate until you find the intersection

        while( head1 != null){
            if(head1 == head2)
                return head1.data;
            head1 = head1.next;
            head2 = head2.next;
        }

        return -1;
    }

    private static int lengthOfList(LinkedListNode current) {
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

}
