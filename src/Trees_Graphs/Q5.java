package Trees_Graphs;

import Trees_Graphs.helper.BinaryTreeNode;

/**
 * One solution would be to do a in-order traversal of the tree if it is BST then each new node must be greater than the previous
 * visited node. In this solution we check that the subtree of a node is within a min-max, in general in the left subtree of a node must
 * have values less than the node while the right subtree must have values greater than the node.
 *
 * Time Complexity: O(n) since we have to touch all nodes
 * Space Complexity: O(logn) if the tree is balanced or O(n) if the tree is unbalanced.
 */
public class Q5 {

    public static boolean checkBST(BinaryTreeNode<Integer> root){
        return checkBST(Integer.MAX_VALUE, Integer.MIN_VALUE, root);
    }

    private static boolean checkBST(int maxValue, int minValue, BinaryTreeNode<Integer> node) {
        if(node == null)
            return true;
        if(node.value > maxValue || node.value<minValue)
            return false;

         if(!checkBST(node.value,minValue,node.left))
             return false;
         if(!checkBST(maxValue,node.value,node.right))
             return false;
         return true;
    }
}
