package Moderate;

import Moderate.Q12.Attribute;
import Moderate.Q12.Element;
import Moderate.Q12.Q12;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 16/1/2018.
 */
public class Q12Test {

    @Test
    public void testEncodeToString() throws Exception {
        Element element = new Element("family");
        Attribute lastName = new Attribute("lastName", "McDowell");
        Attribute state = new Attribute("state", "CA");
        element.insert(lastName);
        element.insert(state);

        Element nestedElement = new Element("person", "Some Message");
        Attribute firstName = new Attribute("firstName", "Gayle");
        nestedElement.insert(firstName);

        element.insert(nestedElement);

        assertEquals("1 4 McDowell 5 CA 0 2 3 Gayle 0 Some Message 0 0 ", Q12.encodeToString(element));
    }
}
