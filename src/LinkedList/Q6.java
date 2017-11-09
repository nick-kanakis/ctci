package LinkedList;

import LinkedList.helper.LinkedListNode;

import java.util.Stack;

/**
 * Created by Nicolas on 8/11/2017.
 */
public class Q6 {

    /*
    * We insert the first half of the list in a stack and then pop the elements and compare them with the second part of
    * the list, if they are the same the list is a permutation.
    * */
    public static boolean isPermutation(LinkedListNode node) {
        int length = lengthOfList(node);
        int deleteElementAtPosition = -1;
        int count = 0;
        Stack<Integer> stack = new Stack<>();

        if (length % 2 != 0) {
            deleteElementAtPosition = length / 2;
        }

        while (node != null) {
            if (count == deleteElementAtPosition) {
                node = node.next;
                count++;
                continue;
            } else if (count < length / 2)
                stack.push(node.data);
            else {
                if (node.data == stack.peek())
                    stack.pop();
                else
                    return false;
            }
            count++;
            node = node.next;
        }
        if (stack.size() > 0)
            return false;
        return true;
    }

    private static int lengthOfList(LinkedListNode current) {
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    /*
    * We don't to know the length of the list we can use 2 pointers (slow/fast) the fast will iterate 2 elements at a time
    * will the slow only one when fast reach the end the slow will be at the middle.
    * */
    public static boolean isPermutationUnknownSize(LinkedListNode node) {
        LinkedListNode fast = node;
        LinkedListNode slow = node;

        Stack<Integer> stack = new Stack<>();

        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        //In case it has odd number of elements
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            if (slow.data == stack.peek())
                stack.pop();
            else
                return false;

            slow = slow.next;
        }
        return true;
    }

}
