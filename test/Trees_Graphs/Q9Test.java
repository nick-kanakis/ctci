package Trees_Graphs;

import Trees_Graphs.helper.BinaryTreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Nicolas on 3/12/2017.
 */
public class Q9Test {

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
        node1.right = node3;
        node2.left = node4;
        node3.left = node5;
        node3.right = node6;
        node5.right = node7;
        node7.right = node8;
    }

    @Test
    public void testFindAllSequences() throws Exception {
        System.out.println(Q9.findAllSequences(node1));
    }
}
