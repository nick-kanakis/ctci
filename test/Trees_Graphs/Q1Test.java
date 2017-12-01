package Trees_Graphs;

import Trees_Graphs.helper.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 1/12/2017.
 */
public class Q1Test {
    Node<Integer> node1 = new Node<>(1);
    Node<Integer> node2 = new Node<>(2);
    Node<Integer> node3 = new Node<>(3);
    Node<Integer> node4 = new Node<>(4);
    Node<Integer> node5 = new Node<>(5);
    Node<Integer> node6 = new Node<>(6);

    @Before
    public void setUp() throws Exception {
        node1.addNeighbor(node2);
        node1.addNeighbor(node3);
        node2.addNeighbor(node4);
        node4.addNeighbor(node6);
        node3.addNeighbor(node5);
        node5.addNeighbor(node6);
    }

    @Test
    public void testFindPathShouldReturnTrue() throws Exception{
        assertTrue(Q1.findPath(node2, node6));
    }

    @Test
    public void testFindPathShouldReturnFalse() throws Exception{
        assertFalse(Q1.findPath(node2, node5));
    }
}
