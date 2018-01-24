package Hard.Q7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nicolas on 23/1/2018.
 */
public class Graph {

    private HashMap<String, Node> map;

    public Graph() {
        map = new HashMap<>();
    }

    public boolean addNode(String name, Node node){
        return map.put(name, node)!=null;
    }

    public Node getNode(String name){
        return map.get(name);
    }

    public HashMap<String, Node> getNodes() {
        return map;
    }

    public void addEdge(String name1, String name2){
        Node node1 = map.get(name1);
        Node node2 = map.get(name2);

        node1.addNeighbor(node2);
        node2.addNeighbor(node1);
    }
}
