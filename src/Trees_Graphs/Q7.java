package Trees_Graphs;

import Trees_Graphs.helper.Graph;
import Trees_Graphs.helper.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * After we create the graph using the given projects and dependencies do the following:
 *
 *  1) Find the nodes with no dependencies
 *  2) Add them to the final result
 *  3) Remove the nodes from the graph
 *  4) Repeat until there is no node in the graph
 *
 *  Time Complexity: O(P+D) (?)
 *  Space Complexity: O(P), where P is the number of projects since we have to create the final result list with all the projects.
 */
public class Q7 {

    static class Dependency {
        Node project;
        Node dependency;

        public Dependency(Node project, Node dependency) {
            this.project = project;
            this.dependency = dependency;
        }
    }

    public static List<Character> findBuildOrder(List<Node<Character>> projects, List<Dependency> dependencies) {
        Graph projectGraph = buildProjectGraph(projects, dependencies);
        List<Character> buildOrder = new ArrayList<>();
        while (projectGraph.size() > 0) {
            List<Node<Character>> nodesWithNoDependencies = findZeroDependencyNodes(projectGraph);
            //add nodes to the final result
            for (Node<Character> node: nodesWithNoDependencies ) {
                buildOrder.add(node.value);
            }
            removeNodes(projectGraph, nodesWithNoDependencies);
        }
        return buildOrder;
    }

    private static void removeNodes(Graph projectGraph, List<Node<Character>> nodesWithNoDependencies) {
        for (Node<Character> node: nodesWithNoDependencies) {
            projectGraph.remove(node);
        }

        for (Node<Character> nodeWithNoDependency: nodesWithNoDependencies) {
            List<Node<Character>> allNodes = projectGraph.getAllNodes();
            for (Node<Character> node : allNodes) {
                if (node.neighbors.contains(nodeWithNoDependency)) {
                    node.neighbors.remove(nodeWithNoDependency);
                }
            };
        }
    }

    private static List<Node<Character>> findZeroDependencyNodes(Graph projectGraph) {
        List<Node<Character>> zeroDependencyNodes = new ArrayList<>();
        List<Node<Character>> allNodes = projectGraph.getAllNodes();

        for (Node<Character> node : allNodes) {
            if (node.neighbors.size() == 0) {
                //this means that the projects has no dependencies and it can be added to the list
                zeroDependencyNodes.add(node);
            }
        }
        return zeroDependencyNodes;
    }

    private static Graph buildProjectGraph(List<Node<Character>> projects, List<Dependency> dependencies) {
        Graph projectGraph = new Graph();

        for (Node project : projects) {
            projectGraph.add(project);
        }
        for (Dependency dependency : dependencies) {
            //A edge between 2 nodes (eg A -> B) means that there is a A depend on B.
            dependency.project.addNeighbor(dependency.dependency);
        }
        return projectGraph;
    }
}
