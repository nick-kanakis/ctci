package Trees_Graphs;

import Trees_Graphs.helper.BinaryTreeNode;

/**
 * For each node in the tree check how many paths exist starting from that node that have the target sum. Do it for all the nodes and you
 * have the answer.
 * !!SOS!! Since we have a binary tree to save time (and increase the memory usage) use recursion and search node IN BOTH SIDES.
 *
 * They way we check the paths from a given node, is to check each node we visit if the sum at this node is the current sum, if yes add it
 * to the result off left subtree and right subtree and return it.
 *
 * In the method we have the current node we are, the sum as far, and the target sum (this does not change).
 * if sum as far + current value  == target sum then add 1 to the result of the right+left subtree and return it.
 *
 */
public class Q12 {

    public static int countPathsOfSum(int targetSum, BinaryTreeNode<Integer> node){
        if(node == null)
            return 0;

        int pathsFromRoot = countPathsWithSumFromNode(node, targetSum, 0);

        int pathsOfLeft = countPathsOfSum(targetSum, node.left);
        int pathsOfRight = countPathsOfSum(targetSum, node.right);

        return pathsFromRoot + pathsOfLeft + pathsOfRight;
    }

    private static int countPathsWithSumFromNode(BinaryTreeNode<Integer> node, int targetSum, int currentSum){
        if(node == null)
            return 0;

        int totalPaths = 0;
        currentSum += node.value;
        if(currentSum == targetSum){
            totalPaths++;
        }
        totalPaths +=countPathsWithSumFromNode(node.left, targetSum, currentSum);
        totalPaths +=countPathsWithSumFromNode(node.right, targetSum, currentSum);

        return totalPaths;
    }
}
