package Trees_Graphs;

import Trees_Graphs.helper.BinaryTreeNode;

/**
 * In a in-order traversal there are 2 possible ways to go, either you find the left most value of the right subtree of the current node,
 * or traverse upwards until the parent is greater than the current node.
 *
 * At first we check if there is a right subtree if there is all the values are greater than the current node,
 * we want the smallest of value of the subtree so we keep looking for the leftmost child
 *
 * if there is no right subtree that means that the next greater value will be in a parent node, we go upwards until the parent
 * is greater than the current node
 *
 * Time Complexity: O(N) since we might need to touch all elements
 * Space Complexity: O(N) due to the recursive calls (could be O(1) if we use a loop instead of recursion
 */
public class Q6 {
    public static BinaryTreeNode<Integer>  findNextNode(BinaryTreeNode<Integer> node){
        if(node.right!=null)
            return findLeftMostNode(node.right);
        else
            return traverseUpwards(node, node.value);
    }

    private static BinaryTreeNode<Integer> traverseUpwards(BinaryTreeNode<Integer> node, int originalValue) {
       if(node.parent== null || node.parent.value > originalValue)
           return node.parent;
        return traverseUpwards(node.parent, originalValue);

    }

    private static BinaryTreeNode<Integer> findLeftMostNode(BinaryTreeNode<Integer> node) {
        if(node.left == null)
            return node;
        return findLeftMostNode(node.left);
    }
}
