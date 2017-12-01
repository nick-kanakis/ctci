package Trees_Graphs;


import Trees_Graphs.helper.Node;

import java.util.LinkedList;

/**
 * Start from the starting node and make a BFS traversal until you find the target node or we reach the end of the subtree
 *
 * (Should be rechecked)
 * Time Complexity is O(N) since we might need to traverse the whole tree.
 * Size Complexity is O(d) where d is the max number of node they exist in each level (could be d = N) *
 *
 *
 */
public class Q1 {

    public static boolean findPath(Node<Integer> start, Node<Integer> target){
        //Do not use native Queue class create your own instead
        LinkedList<Node<Integer>> queue = new LinkedList<>();
        queue.add(start);

        while(queue.size()>0){
            Node<Integer> currentNode = queue.removeLast();
            currentNode.visited = true;
            for(Node<Integer> neighbor: currentNode.neighbors){
                if(!neighbor.visited)
                    queue.add(neighbor);
                if(neighbor == target)
                    return true;
            }
        }
        return false;
    }
}
