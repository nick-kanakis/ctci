import Hard.Q26.DocPair;
import Hard.Q26.Document;
import Hard.Q26.Q26;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nicolas on 3/2/2018.
 */
public class Q26Test {
    @Test
    public void testComputeSimilarities() throws Exception {
        HashMap<Integer, Document> documents = new HashMap<>();

        ArrayList<Integer> doc1Elements = new ArrayList<>();
        doc1Elements.add(14);
        doc1Elements.add(15);
        doc1Elements.add(100);
        doc1Elements.add(9);
        doc1Elements.add(3);
        Document doc1 = new Document(13, doc1Elements);

        ArrayList<Integer> doc2Elements = new ArrayList<>();
        doc2Elements.add(32);
        doc2Elements.add(1);
        doc2Elements.add(9);
        doc2Elements.add(3);
        doc2Elements.add(5);
        Document doc2 = new Document(16, doc2Elements);

        ArrayList<Integer> doc3Elements = new ArrayList<>();
        doc3Elements.add(15);
        doc3Elements.add(29);
        doc3Elements.add(2);
        doc3Elements.add(6);
        doc3Elements.add(8);
        doc3Elements.add(7);
        Document doc3 = new Document(19, doc3Elements);

        ArrayList<Integer> doc4Elements = new ArrayList<>();
        doc4Elements.add(7);
        doc4Elements.add(10);
        Document doc4 = new Document(24, doc4Elements);

        documents.put(13, doc1);
        documents.put(16, doc2);
        documents.put(19, doc3);
        documents.put(24, doc4);

        HashMap<DocPair, Double> result = Q26.computeSimilarities(documents);
        DocPair pair1 = new DocPair(13, 19);
        DocPair pair2 = new DocPair(13, 16);
        DocPair pair3 = new DocPair(19, 24);

        assertTrue(result.containsKey(pair1));
        assertEquals(0.1, result.get(pair1));
        assertTrue(result.containsKey(pair2));
        assertEquals(0.25, result.get(pair2));
        assertTrue(result.containsKey(pair3));
        assertEquals(0.14285714285714285, result.get(pair3));


    }
}
