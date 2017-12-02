package Trees_Graphs;

import Trees_Graphs.helper.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * We create a list of the first level and pass it to the recursive method as the previous layer nodes, from this list
 * we create the new list of nodes in the current layer add it to the general list and call the recursive method again, until
 * the previous layer is empty.
 *
 * Time Complexity: O(N) we need to touch all elements
 * Space Complexity: O(N) because we need to return all data
 */
public class Q3 {

    public static List<List<BinaryTreeNode<Integer>>> listsOfDepth(BinaryTreeNode<Integer> root) {
        List<BinaryTreeNode<Integer>> previousLayer = new ArrayList<>();
        previousLayer.add(root);
        List<List<BinaryTreeNode<Integer>>> listOfDepths = new ArrayList<>();
        listOfDepths.add(previousLayer);
        recursiveListOfDepths(previousLayer, listOfDepths);
        return listOfDepths;

    }

    private static void recursiveListOfDepths(List<BinaryTreeNode<Integer>> previousLayer, List<List<BinaryTreeNode<Integer>>> listOfDepths) {
       if (previousLayer.size() ==0)
           return ;

        List<BinaryTreeNode<Integer>> currentLayer = new ArrayList<>();
        for (BinaryTreeNode<Integer> previousLayerNode : previousLayer) {
            if (previousLayerNode.right != null)
                currentLayer.add(previousLayerNode.right);
            if (previousLayerNode.left != null)
                currentLayer.add(previousLayerNode.left);
        }
        if (currentLayer.size() > 0) {
            listOfDepths.add(currentLayer);
        }

        recursiveListOfDepths(currentLayer, listOfDepths);
    }
}
