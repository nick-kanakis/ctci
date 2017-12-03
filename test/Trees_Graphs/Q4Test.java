package Trees_Graphs;

import Trees_Graphs.helper.BinaryTreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 3/12/2017.
 */
public class Q4Test {

    private BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(1);
    private BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(2);
    private BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(3);
    private BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(4);
    private BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(5);
    private BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(6);
    private BinaryTreeNode<Integer> node7 = new BinaryTreeNode<>(7);

    @Before
    public void setUp() throws Exception {
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.left = node5;
        node3.right = node6;
    }

    @Test
    public void testCheckBalance() throws Exception {
        assertTrue(Q4.checkBalance(node1));
    }

    @Test
    public void testCheckBalanceShouldFail() throws Exception {
        node4.right = node7;
        assertFalse(Q4.checkBalance(node1));
    }
}
