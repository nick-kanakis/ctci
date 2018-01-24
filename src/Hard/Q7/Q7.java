package Hard.Q7;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a graph with nodes for each name, synonyms are linked together in connected graphs.
 * Count the sum of all connected graphs and add it to the final result.
 */
public class Q7 {

    public static HashMap<String, Integer> merge(HashMap<String, Integer> names, String[][] synonyms){

        //Add the nodes to the graph
        Graph graph = createGraph(names);

        //Connect the nodes together
        connectEdges(graph, synonyms);

        //DepthFirst sum
        return getTrueFrequencies(graph);
    }


    private static Graph createGraph(HashMap<String, Integer> names) {
        Graph graph = new Graph();
        for (Map.Entry<String, Integer> entry : names.entrySet()) {
            Node node = new Node(entry.getKey(), entry.getValue());
            graph.addNode(entry.getKey(), node);
        }
        return graph;
    }

    private static void connectEdges(Graph graph, String[][] synonyms) {

        for (String[] synonym : synonyms) {
            graph.addEdge(synonym[0], synonym[1]);
        }
    }

    private static HashMap<String, Integer> getTrueFrequencies(Graph graph) {
        HashMap<String, Node> nodes = graph.getNodes();
        HashMap<String, Integer> trueFrequencies = new HashMap<>();

        for (Node headNode : nodes.values()) {
           int sum = depthFirstSum(headNode);
           if(sum>0)
               trueFrequencies.put(headNode.getName(), sum);
        }
        return trueFrequencies;
    }

    private static int depthFirstSum(Node currentNode) {
        if(currentNode.isVisited())
            return 0;

        int sum = currentNode.getOccurrences();
        currentNode.setVisited(true);

        for (Node neighbor : currentNode.getNeighbors()) {
            sum += depthFirstSum(neighbor);
        }
        return sum;
    }
}
