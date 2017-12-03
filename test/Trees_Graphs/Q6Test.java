package Trees_Graphs;

import Trees_Graphs.helper.BinaryTreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 3/12/2017.
 */
public class Q6Test {

    private BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(10);
    private BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(5);
    private BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(15);
    private BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(2);
    private BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(12);
    private BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(20);
    private BinaryTreeNode<Integer> node7 = new BinaryTreeNode<>(13);
    private BinaryTreeNode<Integer> node8 = new BinaryTreeNode<>(14);

    @Before
    public void setUp() throws Exception {
        node1.left = node2;
        node2.parent = node1;
        node1.right = node3;
        node3.parent = node1;
        node2.left = node4;
        node4.parent = node2;
        node3.left = node5;
        node5.parent = node3;
        node3.right = node6;
        node6.parent = node6;
        node5.right = node7;
        node7.parent = node5;
        node7.right = node8;
        node8.parent = node7;
    }

    @Test
    public void testFindNextNode() throws Exception {
        assertEquals(new Integer(15), Q6.findNextNode(node8).value);
        assertEquals(new Integer(5), Q6.findNextNode(node4).value);
        assertEquals(new Integer(12), Q6.findNextNode(node1).value);
        assertEquals(new Integer(20), Q6.findNextNode(node3).value);
    }
}
