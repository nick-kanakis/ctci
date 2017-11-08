package LinkedList;

/**
 * Created by Nicolas on 8/11/2017.
 */
public class Q3 {

    /*
    * In order to be able to unit test the solution we change the question a bit. We will have access to the head, and will will find
    * the node to delete with the nodePosition (incremental from 0). We will not keep track of any previous node. And the delete will
    * occur when we visit the actual node.
    *
    * As for the solution, we will copy ne value of the next node to the node we want to delete, and we will delete the next node.
    * */
    public static LinkedListNode deleteMiddleNode(LinkedListNode head, int nodePosition){
        LinkedListNode pointer = head;

        for (int i = 0; i < nodePosition; i++) {
            if (pointer!= null)
                pointer = pointer.next;
            else
                throw new IndexOutOfBoundsException();
        }

        if(pointer.next == null)
            throw new IndexOutOfBoundsException();

        pointer.data = pointer.next.data;
        pointer.next = pointer.next.next;

        return head;
    }
}
