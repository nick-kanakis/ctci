package Trees_Graphs;

import Trees_Graphs.helper.BinaryTreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 1/12/2017.
 */
public class Q3Test {
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
        node2.right = node5;
        node3.right = node6;
        node6.left = node7;
    }

    @Test
    public void testListsOfDepth() throws Exception {
        List<List<BinaryTreeNode<Integer>>> listsOfDepth = Q3.listsOfDepth(node1);
        List<List<BinaryTreeNode<Integer>>> correctListOfDepth = new ArrayList<>();

        List<BinaryTreeNode<Integer>> layer1 = new ArrayList<>();
        List<BinaryTreeNode<Integer>> layer2 = new ArrayList<>();
        List<BinaryTreeNode<Integer>> layer3 = new ArrayList<>();
        List<BinaryTreeNode<Integer>> layer4 = new ArrayList<>();

        layer1.add(new BinaryTreeNode<>(1));
        layer2.add(new BinaryTreeNode<>(3));
        layer2.add(new BinaryTreeNode<>(2));
        layer3.add(new BinaryTreeNode<>(6));
        layer3.add(new BinaryTreeNode<>(5));
        layer3.add(new BinaryTreeNode<>(4));
        layer4.add(new BinaryTreeNode<>(7));
        correctListOfDepth.add(layer1);
        correctListOfDepth.add(layer2);
        correctListOfDepth.add(layer3);
        correctListOfDepth.add(layer4);

        for (int i = 0; i < correctListOfDepth.size(); i++) {
            for (int j = 0; j < correctListOfDepth.get(i).size(); j++) {
                assertEquals(correctListOfDepth.get(i).get(j).value, listsOfDepth.get(i).get(j).value);
            }
        }

    }
}
