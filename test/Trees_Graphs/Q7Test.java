package Trees_Graphs;

import Trees_Graphs.helper.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nicolas on 3/12/2017.
 */
public class Q7Test {


    List<Q7.Dependency> dependencies;
    List<Node<Character>> projects;

    @Before
    public void setUp() throws Exception {
        Node<Character> nodeA = new Node<>('a');
        Node<Character> nodeB = new Node<>('b');
        Node<Character> nodeC = new Node<>('c');
        Node<Character> nodeD = new Node<>('d');
        Node<Character> nodeE = new Node<>('e');
        Node<Character> nodeF = new Node<>('f');

        Q7.Dependency dependency1 = new Q7.Dependency(nodeD, nodeA);
        Q7.Dependency dependency2 = new Q7.Dependency(nodeB, nodeF);
        Q7.Dependency dependency3 = new Q7.Dependency(nodeD, nodeB);
        Q7.Dependency dependency4 = new Q7.Dependency(nodeA, nodeF);
        Q7.Dependency dependency5 = new Q7.Dependency(nodeC, nodeD);

        dependencies = new ArrayList<>();
        dependencies.add(dependency1);
        dependencies.add(dependency2);
        dependencies.add(dependency3);
        dependencies.add(dependency4);
        dependencies.add(dependency5);

        projects = new ArrayList<>();
        projects.add(nodeA);
        projects.add(nodeB);
        projects.add(nodeC);
        projects.add(nodeD);
        projects.add(nodeE);
        projects.add(nodeF);
    }

    @Test
    public void testBuildOrder() throws Exception {
        List<Character> buildOrder = Q7.findBuildOrder(projects, dependencies);
        List<Character> correctBuildOrder = new LinkedList<>();
        correctBuildOrder.add('f');
        correctBuildOrder.add('e');
        correctBuildOrder.add('a');
        correctBuildOrder.add('b');
        correctBuildOrder.add('d');
        correctBuildOrder.add('c');
        List<Character> correctBuildOrder2 = new LinkedList<>();
        correctBuildOrder2.add('e');
        correctBuildOrder2.add('f');
        correctBuildOrder2.add('a');
        correctBuildOrder2.add('b');
        correctBuildOrder2.add('d');
        correctBuildOrder2.add('c');

        assertTrue(buildOrder.equals(correctBuildOrder)|| buildOrder.equals(correctBuildOrder2));
    }
}
