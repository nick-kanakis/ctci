package Trees_Graphs;

import Trees_Graphs.helper.BinaryTreeNode;

/**
 * Recursive check the height difference of each level if the diff is more that |1| then throw an exception and stop
 * traversing the tree.
 *
 * Time Complexity O(N) since we have to touch all the elements
 * Space Complexity O(H) where H is the height of the tree. (There will be H recursive calls)
 */
public class Q4 {
    public static boolean checkBalance(BinaryTreeNode<Integer> root){

        try {
            recursiveCheck(root);
        } catch (Exception e) {
           return false;
        }
        return true;
    }

    private static int recursiveCheck(BinaryTreeNode<Integer> currentNode) throws Exception {
        if( currentNode == null)
            return -1;

        int rightHeight = recursiveCheck(currentNode.right);
        int leftHeight = recursiveCheck(currentNode.left);

        int heightDiff = rightHeight - leftHeight;
        if (heightDiff > 1 || heightDiff < -1)
            throw new Exception("Unbalanced Tree");

        return Math.max(rightHeight, leftHeight)+1;
    }
}
