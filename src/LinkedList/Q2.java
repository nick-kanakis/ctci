package LinkedList;

/**
 * Created by Nicolas on 8/11/2017.
 */
public class Q2 {

    /*
    * There are 2 pointers, the fast one iterates the list one node at a time, when it iterates k elements, the slow pointer
    * starts with the same speed. When the fast pointer ends the slow pointer will be at the kth to last position
    * */
    public static LinkedListNode returnKthToLast (LinkedListNode node, int k){
        //Todo check input node != null & k>0
        int count = 0;
        LinkedListNode slowPointer = node;
        while (node!= null){

            if(count >= k){
                slowPointer = slowPointer.next;
            }
            node = node.next;
            count++;
        }
        return slowPointer;
    }
}
