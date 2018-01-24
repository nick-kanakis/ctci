package Hard;

import Hard.Q8.Person;
import Hard.Q8.Q8;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nicolas on 23/1/2018.
 */
public class Q8Test {


    @Test
    public void testSort() throws Exception {
        Person p1 = new Person(175, 160);
        Person p2 = new Person(170, 150);
        Person p3 = new Person(180, 110);
        Person p4 = new Person(168, 170);
        Person p5 = new Person(185, 190);
        Person p6 = new Person(190, 200);
        Person p7 = new Person(120, 30);
        Person p8 = new Person(160, 100);

        ArrayList<Person> input = new ArrayList<>();
        input.add(p1);
        input.add(p2);
        input.add(p3);
        input.add(p4);
        input.add(p5);
        input.add(p6);
        input.add(p7);
        input.add(p8);

        ArrayList<Person> sort = Q8.sort(input);

        assertTrue(sort.contains(p1));
        assertTrue(sort.contains(p2));
        assertTrue(sort.contains(p5));
        assertTrue(sort.contains(p6));
        assertTrue(sort.contains(p7));
        assertTrue(sort.contains(p8));
        assertEquals(6, sort.size());


    }
}
