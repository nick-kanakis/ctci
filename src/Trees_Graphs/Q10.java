package Trees_Graphs;

import Trees_Graphs.helper.BinaryTreeNode;

import java.util.Objects;

/**
 * We traverse the tree IN BOTH SIDES until we find node2 in the subtree of node1. When we find it we check both subtrees to see if
 * they are equal. If they are we return true otherwise we keep looking.
 *
 * Tip: since this is a Binary tree we do not need to do a BFS search we just iterate on both sides of the root. This takes up memory
 * for the recursive calls but is much faster. If we do not have memory available we can do it in a loop.
 *
 * Time Complexity: O(n+km) where k is the number of times node2 is present in the node1 tree.
 * Space Comlexity: O(log(n) +log(m)) where n is the number of nodes in the node1 tree and m the size of nodes in the node2 tree.
 */
public class Q10 {

    public static boolean checkSubtree(BinaryTreeNode<Integer> node1, BinaryTreeNode<Integer> node2){
        //If node1 (the big tree) is null then there is no tree to search for
        if(node1 == null & node2 != null)
            return false;
        //If node2 (the smaller tree) is null then it is always a subtree of big tree
        if(node2 == null)
            return true;

        return traverseSubtreeAndSearchForNode(node1, node2);
    }

    private static boolean traverseSubtreeAndSearchForNode(BinaryTreeNode<Integer> node1, BinaryTreeNode<Integer> node2) {
        if(node1 == null)
            return false;
        if(node1.value == node2.value && isEqualSubtrees(node1, node2)){
            return true;
        } else {
            return traverseSubtreeAndSearchForNode(node1.left, node2) || traverseSubtreeAndSearchForNode(node1.right, node2);
        }
    }

    private static boolean isEqualSubtrees(BinaryTreeNode<Integer> node1, BinaryTreeNode<Integer> node2) {
        if(node1 == null && node2 == null)
            return true;
        else if(node1 == null || node2 == null)
            return false;
        else if(!Objects.equals(node1.value, node2.value))
            return false;
        else
            return isEqualSubtrees(node1.left, node2.left) && isEqualSubtrees(node1.right, node2.right);
    }
}
