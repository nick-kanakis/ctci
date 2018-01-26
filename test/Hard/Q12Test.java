package Hard;

import Hard.Q12.BiNode;
import Hard.Q12.NodePair;
import Hard.Q12.Q12;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nicolas on 26/1/2018.
 */
public class Q12Test {

    @Test
    public void testConvertBST2DoubleLL() throws Exception {
        BiNode node50 = new BiNode(50);
        BiNode node20 = new BiNode(20);
        BiNode node40 = new BiNode(40);
        BiNode node35 = new BiNode(35);
        BiNode node45 = new BiNode(45);
        BiNode node60 = new BiNode(60);
        BiNode node15 = new BiNode(15);

        node50.node1 = node20;
        node50.node2 = node60;
        node20.node2 = node40;
        node20.node1 = node15;
        node40.node1 = node35;
        node40.node2 = node45;

        NodePair resultPair = Q12.convertBST2DoubleLL(node50);
        BiNode head = resultPair.head;
        BiNode tail = resultPair.tail;

        while(head.node2 != null){
            assertTrue(head.data <= head.node2.data);
            head = head.node2;
        }

        while(tail.node1 != null){
            assertTrue(tail.data >= tail.node1.data);
            tail = tail.node1;
        }
    }
}
