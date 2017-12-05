package Trees_Graphs;

import Trees_Graphs.helper.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Random;

/**
 * The answer is a bit different from the one suggested at the book. Here you have a BST with nodes (not in a array) and the insert/delete/find
 * works as always. The only difference is we keep track how many nodes exist in the BST. When we request the random node we take a number from
 *  0 - SIZE and make a BFS traverse of the nodes we stop when traverse RANDOM_NUMBER nodes and return this node.
 *
 *  The time complexity is O(N) since we might need to iterate the whole tree if the random number equals the SIZE.
 *
 *  The solution of the book keep tracks of the size of each subtree and based on that calculate the probability to move right/left or return current node.
 *  This requires O(D) time where D is the Depth of the tree.
 */
public class Q11_BST {

    private int size = 0;

    private BinaryTreeNode<Integer> root = null;

    public void insertNode(int value) {
        size++;
        if (root == null)
            root = new BinaryTreeNode<>(value);
        else {
            insertNodeRecursively(value, root);
        }

    }

    private void insertNodeRecursively(int value, BinaryTreeNode<Integer> parent) {
        if (value <= parent.value) {
            if (parent.left == null)
                parent.left = new BinaryTreeNode<>(value);
            else
                insertNodeRecursively(value, parent.left);
        } else {
            if (parent.right == null)
                parent.right = new BinaryTreeNode<>(value);
            else
                insertNodeRecursively(value, parent.right);
        }
    }

    public int getRandomNode() {
        Random random = new Random();
        int index = random.nextInt(size );
        return BFSWithLimit(index);
    }

    private int BFSWithLimit(int index) {
        LinkedList<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        BinaryTreeNode<Integer> tmpNode = null;
        while (queue.size() > 0 && count <= index) {
            count++;
            tmpNode = queue.removeLast();
            if(tmpNode.left != null)
                queue.addFirst(tmpNode.left);
            if(tmpNode.right != null)
                queue.addFirst(tmpNode.right);
        }

        return tmpNode.value;
    }

}
