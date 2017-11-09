package LinkedList;

import LinkedList.helper.LinkedListNode;

/**
 * Created by Nicolas on 8/11/2017.
 */
public class Q5 {

    /*
    *  Do the add as you will do a regular addition. Since the inputs are in reverse just add as you go and do not forget the carry.
    *  If the lists are not the same length set the value to 0
    *
    * Warning: At the end if there is a remaining carry add to the tail.
    *
    * */
    public static LinkedListNode sumListReverseOrder(LinkedListNode node1, LinkedListNode node2) {
        //TODO check for null input
        int carry = 0;
        LinkedListNode resultHead = null;
        LinkedListNode resultTail = null;

        while (node1 != null || node2 != null) {
            int result = 0;
            int value1 = 0;
            int value2 = 0;

            if (node1 != null)
                value1 = node1.data;
            if (node2 != null)
                value2 = node2.data;

            result = value1 + value2 + carry;
            carry = 0;

            if (result > 9) {
                carry = 1;
                result = result % 10;
            }

            if (resultHead == null) {
                resultHead = new LinkedListNode(result);
                resultTail = resultHead;
            } else {
                resultTail.next = new LinkedListNode(result);
                resultTail = resultTail.next;
            }

            if (node1 != null)
                node1 = node1.next;
            if (node2 != null)
                node2 = node2.next;
        }

        //WARNING: Do not forget the last carry
        if (carry == 1)
            resultTail.next = new LinkedListNode(1);

        return resultHead;
    }

    /*
    * Because the lists are given in the correct order we can not follow the same approach as before. But adding 2 numbers
    * is not possible if you not start from the start. We solve this problem with recursion.
    *
    * Before we start we have to make both lists the same size. This is done by adding 0s in the front of the smaller list.
    *
    * After having 2 similar in length lists we iterate (recursively) to the end of the list, we add the 2 last elements
    * and return an object containing a list with the result & the carry. The caller receives the object makes the addition
    * (taking in consideration the carry of the previous call) updates the objects with the result and the new carry, and
    * returns the result to the caller.
    *
    * Warning!! Do not forget in the original caller (base case) to take into account the carry.
    *
    * */
    public static LinkedListNode sumListForwardOrder(LinkedListNode head1, LinkedListNode head2) {
        int length1 = lengthOfList(head1);
        int length2 = lengthOfList(head2);

        if (length1 > length2) {
            head2 = addZerosToListHead(head2, length1 - length2);
        } else if (length2 > length1) {
            head1 = addZerosToListHead(head1, length2 - length1);
        }

        RecursiveHelper recursiveHelper = addListRecursively(head1, head2);

        if (recursiveHelper.carry > 0) {
            LinkedListNode newHead = new LinkedListNode(1);
            newHead.next = recursiveHelper.node;
            recursiveHelper.node = newHead;
        }
        return recursiveHelper.node;

    }

    private static RecursiveHelper addListRecursively(LinkedListNode node1, LinkedListNode node2) {
        RecursiveHelper recursiveHelper = null;
        int result = 0;
        if (node1.next != null) {
            recursiveHelper = addListRecursively(node1.next, node2.next);
            result = node1.data + node2.data + recursiveHelper.carry;
            recursiveHelper.carry = 0;

            if (result > 9) {
                result = result % 10;
                recursiveHelper.carry = 1;
            }
            LinkedListNode newHead = new LinkedListNode(result);
            newHead.next = recursiveHelper.node;
            recursiveHelper.node = newHead;
        } else {
            result = node1.data + node2.data;
            recursiveHelper = new RecursiveHelper(0);
            if (result > 9) {
                result = result % 10;
                recursiveHelper.carry = 1;
            }
            LinkedListNode newHead = new LinkedListNode(result);
            newHead.next = recursiveHelper.node;
            recursiveHelper.node = newHead;
        }
        return recursiveHelper;
    }

    private static int lengthOfList(LinkedListNode current) {
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    private static LinkedListNode addZerosToListHead(LinkedListNode head, int zerosNumber) {
        if (zerosNumber < 1)
            return head;

        LinkedListNode newHead = null;
        for (int i = 0; i < zerosNumber; i++) {
            newHead = new LinkedListNode(0);
            newHead.next = head;
        }
        return newHead;
    }

    private static class RecursiveHelper {
        int carry = 0;
        LinkedListNode node = null;

        public RecursiveHelper(int carry) {
            this.carry = carry;
        }
    }
}
