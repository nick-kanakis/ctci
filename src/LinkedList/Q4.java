package LinkedList;

/**
 * Created by Nicolas on 8/11/2017.
 */
public class Q4 {

    /*
    * We create 2 separate lists one with elements smaller than partition and one with greater or equal.
    * We then join the 2 lists and return a partitioned list.
    * */
    public static LinkedListNode partition(LinkedListNode head, int partition){
        //Todo check head != null
        LinkedListNode beforeHead = null;
        LinkedListNode beforeTail = null;
        LinkedListNode afterHead = null;
        LinkedListNode afterTail = null;

        while(head!= null){
            
            if(head.data <partition){
                if(beforeHead == null){
                    beforeHead = new LinkedListNode(head.data);
                    beforeTail = beforeHead;
                } else{
                    beforeTail.next = new LinkedListNode(head.data);
                    beforeTail = beforeTail.next;
                }
            } else {
                if(afterHead == null){
                    afterHead = new LinkedListNode(head.data);
                    afterTail = afterHead;
                } else{
                    afterTail.next = new LinkedListNode(head.data);
                    afterTail = afterTail.next;
                } 
            }
            head = head.next;
        }

        if (beforeHead == null)
            return afterHead;

        beforeTail.next = afterHead;
        return beforeHead;
    }
}
