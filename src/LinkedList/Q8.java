package LinkedList;

/**
 * Created by Nicolas on 9/11/2017.
 */
public class Q8 {

    /*
    *  It can easily be done using a Hashset but this is not the purpose in the following solution we try to solve the problem
    *  in O(1) time
    *
    *  1) Using the fast/slow pointer technique we will have a slow pointer moving at 1 node per iteration while the
    *  fast pointer will move 2 nodes per iteration.
    *
    *  2) Since this is a circular list at some point they will meet.
    *
    *  3) The point they will meet is k nodes away from the start of the loop. where k is the number of nodes from the start
    *  to the starting point of the loop.+
    *
    *  4) Both pointers will then move at the some speed (one node at a time). The point they meet will be the start of the loop.
    *
    *
    *  + Why?? (Better explanation @page 224
    *  When the slow pointer enters the loop (k steps) the fast pointer will be inside the loop for k steps, since it is
    *  has done 2k steps, so it fastpointer - slowpointer = 2k - k = k. Also Inside the loop the fast and slow pointer
    *  are getting closer 1 node per iteration. So the slow pointer is k steps from fast pointer and from the other perspective
    *  fast pointer is LOOP_SIZE - k steps from the slow pointer.
    *
    *  From the above we understand that fast pointer needs LOOP_SIZE - k iterations to catch the slow runner.
    *  This is the collision point, which is also k steps from the start of the loop.
    * */

    public static int loopDetection (LinkedListNode node){
        //Todo check for null node

        LinkedListNode fastPointer = node;
        LinkedListNode slowPointer = node;
        //todo find a better name for the pointer
        LinkedListNode slowPointer2 = node;

        do {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if(fastPointer == null | fastPointer.next == null || slowPointer == null)
                throw new RuntimeException("Not a circular list");
        } while (fastPointer != slowPointer);

        while(slowPointer != slowPointer2){
            slowPointer = slowPointer.next;
            slowPointer2 = slowPointer2.next;
        }

        return slowPointer.data;
    }

}
