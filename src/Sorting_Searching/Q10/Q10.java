package Sorting_Searching.Q10;

/**
 * Created by Nicolas on 5/1/2018.
 */
public class Q10 {
    private static  RankNode root;

    public static void track(int value){
        if(root == null){
            root = new RankNode(value);
        } else {
            root.insert(value);
        }
    }

    public static int getRankOfNumber(int number){
        if(root.value == number)
            return root.getRank();
        int rankSoFar = 0;

        if (number < root.value){
            return getRankOfNumberRecursive(number, root.left, rankSoFar);
        } else {
            rankSoFar = root.getRank();
            return getRankOfNumberRecursive(number, root.right, rankSoFar);
        }
    }

    /*Increase rankSoFar only when going right. As we have to calculate all numbers that are smaller of the current node (aka
    * all numbers of the left subtree*/
    private static int getRankOfNumberRecursive(int number, RankNode node, int rankSoFar) {
        if(node == null)
            return 0;

        if(node.value == number)
            return node.getRank() + rankSoFar;
        else if (number < node.value){
            return getRankOfNumberRecursive(number, node.left, rankSoFar);
        } else {
            rankSoFar += node.getRank();
            return getRankOfNumberRecursive(number, node.right, rankSoFar);
        }
    }
}
