package Trees_Graphs;

import Trees_Graphs.helper.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Should be restudied!!
 */
public class Q9 {

    public static List<LinkedList<Integer>> findAllSequences(BinaryTreeNode<Integer> root) {

        List<LinkedList<Integer>> result = new ArrayList<>();

        if (root == null) {
            result.add(new LinkedList<>());
            return result;
        }

        //add current value to the prefix linkedlist
        LinkedList<Integer> prefix = new LinkedList<>();
        prefix.add(root.value);

        /* partial result for the left and right subtrees*/
        List<LinkedList<Integer>> leftSeq = findAllSequences(root.left);
        List<LinkedList<Integer>> rightSeq = findAllSequences(root.right);

        /*Weave together each list from the left and right sides*/

        for (LinkedList<Integer> left : leftSeq) {
            for (LinkedList<Integer> right : rightSeq) {
                List<LinkedList<Integer>> weaved = new ArrayList<>();
                weaveList(left, right, weaved, prefix);
                result.addAll(weaved);
            }
        }

        return result;
    }

    /*wave lists together in all possible ways*/
    private static void weaveList(LinkedList<Integer> first, LinkedList<Integer> second, List<LinkedList<Integer>> results, LinkedList<Integer> prefix) {

        if (first.size() == 0 || second.size() == 0) {
            LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
            result.addAll(first);
            result.addAll(second);
            results.add(result);
            return;
        }

        int headFirst = first.removeFirst();
        prefix.addLast(headFirst);
        weaveList(first,second,results,prefix);
        prefix.removeLast();
        first.addFirst(headFirst);

        int headSecond = second.removeFirst();
        prefix.addLast(headSecond);
        weaveList(first,second,results,prefix);
        prefix.removeLast();
        second.addFirst(headSecond);

    }

}
