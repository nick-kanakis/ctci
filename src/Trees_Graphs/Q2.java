package Trees_Graphs;

import Trees_Graphs.helper.BinaryTreeNode;

/**
 * We have a recursive method with the start and end of the subtree we are working on and the array with the values,
 * We find the middle of the the subarray we are working on and create the root of this subarray. the right/left child,
 * of the root will be calculated by the recursive call of the method but now we are working on a smaller subarray.
 *
 * eg. [1,2,3,4,5,6]
 * middle = 3
 * right subarray = [1,2]
 * left subarray = [4,5,6]
 *
 * the middle of right subarray  = 1
 * the middle of left subarray = 5
 *
 * You do the same for each subarray until there are no nodes left
 *
 * Tip: The trick is to use pointers for start - end of the subarray you are working on in the recursive method.
 */
public class Q2 {

    public static BinaryTreeNode<Integer> constructMinimalBST(int[] sortedArray) {
        return constructMinimalBST(0, sortedArray.length - 1, sortedArray);
    }

    private static BinaryTreeNode<Integer> constructMinimalBST(int start, int end, int[] sortedArray) {
        if (end < start)
            return null;
        int middle = (start + end)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(sortedArray[middle]);
        root.left = constructMinimalBST(start, middle - 1, sortedArray);
        root.right = constructMinimalBST(middle+1, end, sortedArray);

        return root;
    }
}
