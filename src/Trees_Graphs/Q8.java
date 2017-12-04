package Trees_Graphs;

import Trees_Graphs.helper.BinaryTreeNode;

/**
 * If we have access to the parent of each node then the solution is quite easy.
 *
 * 1) We compare the depths of the nodes.
 * 2) We traverse up from the deepest node until both nodes are on the same depth.
 * 3) We move 1 level up from both node until the 2 pointers meet.
 * 4) The point they meet is the first common ancestor.
 *
 * What about when there is no link to the parent?
 *
 * Starting from the root, if p & q are on different sides then root is the first common ancestor.
 *
 * From that we can find the algorithm
 *
 * 1) If p & q are on different sides of then root is the first common ancestor
 * 2) else go ti the side they both are and repeat until you find the first common ancestor
 *
 *  Time Complexity: O(N) *page 259 for why
 *  Space Complexity:O(N) due to the recursive calls (??)
 */
public class Q8 {

    public static BinaryTreeNode<Integer> findCommonAncestor(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> p, BinaryTreeNode<Integer> q){
        boolean qIsOnRight = covers(root.right, q);
        boolean pIsOnRight = covers(root.right, p);

        //Nodes are on different sides
        if(qIsOnRight != pIsOnRight)
            return root;

        //qIsOnRight == false  means that both q and p are on the left side since qIsOnRight == pIsOnRight
        if(qIsOnRight == false)
            return findCommonAncestor(root.left, p, q);
        else
            return findCommonAncestor(root.right, p, q);

    }

    private static boolean covers(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> target){
        if(root == null)
            return false;
        if(root == target)
            return true;
        return (covers(root.right, target)|| covers(root.left, target));
    }

}

