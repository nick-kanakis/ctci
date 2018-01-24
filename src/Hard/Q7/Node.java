package Hard.Q7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicolas on 23/1/2018.
 */
public class Node {
    private String name;
    private int occurrences;
    private boolean visited;
    private List<Node> neighbors;

    public Node(String name, int occurrences) {
        this.name = name;
        this.occurrences = occurrences;
        visited = false;
        neighbors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getOccurrences() {
        return occurrences;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Node> getNeighbors(){
        return neighbors;
    }

    public void addNeighbor(Node node){
        neighbors.add(node);
    }
}
