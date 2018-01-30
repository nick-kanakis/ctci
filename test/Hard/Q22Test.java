package Hard;

import org.junit.Test;

import java.util.ArrayList;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nicolas on 29/1/2018.
 */
public class Q22Test {

    @Test
    public void testWordTransformation() throws Exception {
        String[] dictionary = new String[]{
                "damp",
                "lamp",
                "limp",
                "lime",
                "like"
        };
        List<String> expectedResult1 = new ArrayList<>();
        expectedResult1.add("damp");
        expectedResult1.add("lamp");
        expectedResult1.add("limp");
        expectedResult1.add("lime");
        expectedResult1.add("like");



        List<String> result1 = Q22.wordTransformation("damp", "like", dictionary);

        assertEquals(result1, expectedResult1);
        assertTrue(result1.equals(expectedResult1));
    }
}
