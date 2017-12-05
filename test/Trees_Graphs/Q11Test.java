package Trees_Graphs;

import org.junit.Test;

/**
 * Created by Nicolas on 4/12/2017.
 */
public class Q11Test {

    @Test
    public void testBST() throws Exception {
        Q11_BST bst = new Q11_BST();
        bst.insertNode(10);
        bst.insertNode(5);
        bst.insertNode(15);
        bst.insertNode(20);
        bst.insertNode(17);
        bst.insertNode(3);
        bst.insertNode(8);

        bst.getRandomNode();

    }
}
