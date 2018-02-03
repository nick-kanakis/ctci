package Hard.Q26;

import java.util.*;

/**
 * Created by Nicolas on 3/2/2018.
 */
public class Q26 {

    public static HashMap<DocPair, Double> computeSimilarities(HashMap<Integer, Document> documents){
        /*
        * First take the documents and create a HashMap of elements and documentsIds,
        * The elements will be keys and the values will be documents ids that these elements appear.
        * */
        HashMap<Integer, ArrayList<Integer>> elementsToDocIds = groupIDs(documents);

        /*
        * Take the above hashmap and based on that compute another hasmap that the key is the DockPair and
        * the value is the number of intersecting elements for this specific pair.
        * */

        HashMap<DocPair, Integer> intersections = computeIntersections(elementsToDocIds);

        /*
        * Since we have the intersection for each pair, it is ease to compute the similarity of this pair.
        * */
        return computeSimilaritiesHelper(intersections, documents);
    }

    /*Returns a hashmap of Element - List<Documents IDs>*/
    private static HashMap<Integer, ArrayList<Integer>> groupIDs(HashMap<Integer, Document> documents) {
        HashMap<Integer, ArrayList<Integer>> elementsToDocIds = new HashMap<>();

        for (Document document : documents.values()) {
            ArrayList<Integer> elements = document.elements;
            for (Integer element : elements) {
                if(elementsToDocIds.containsKey(element)){
                    elementsToDocIds.get(element).add(document.id);
                } else {
                    ArrayList<Integer> ids = new ArrayList<Integer>();
                    ids.add(document.id);
                    elementsToDocIds.put(element, ids);
                }
            }
        }
        return elementsToDocIds;
    }

    /*Compute the intersection of each pair*/
    private static HashMap<DocPair, Integer> computeIntersections(HashMap<Integer, ArrayList<Integer>> elementsToDocIds) {
        HashMap<DocPair, Integer> intersections = new HashMap<>();
        
        Set<Integer> elements = elementsToDocIds.keySet();
        /*
        * For each element find the ids that it appears, for every possible pair of
        * ids increment the intersections for this pair.
        *
        * Each element appears in A, B documents, we need to create this DocPair object and increase the intersection
        * for the element we just checked.
        * */
        for (Integer element : elements) {
            ArrayList<Integer> ids = elementsToDocIds.get(element);
            Collections.sort(ids);
            for (int i = 0; i < ids.size(); i++) {
                for (int j = i+1; j < ids.size(); j++) {
                    incrementIntersections(intersections, ids.get(i), ids.get(j));
                }
            }
        }
        return intersections;
    }

    private static void incrementIntersections(HashMap<DocPair, Integer> intersections, Integer doc1Id, Integer doc2Id) {
        DocPair docPair = new DocPair(doc1Id, doc2Id);
        if(intersections.containsKey(docPair)){
            intersections.put(docPair, intersections.get(docPair) + 1);
        } else {
            intersections.put(docPair, 1);
        }

    }

    private static HashMap<DocPair, Double> computeSimilaritiesHelper(HashMap<DocPair, Integer> intersections, HashMap<Integer, Document> documents) {
        HashMap<DocPair, Double> similarities = new HashMap<>();

        for (Map.Entry<DocPair, Integer> entry : intersections.entrySet()) {
            Integer intersection = entry.getValue();
            DocPair pair = entry.getKey();
            Document doc1 = documents.get(pair.doc1Id);
            Document doc2 = documents.get(pair.doc2Id);
            double union = (double) doc1.elements.size() + doc2.elements.size() - intersection;
            similarities.put(pair, intersection/union);
        }
        return similarities;
    }
}
