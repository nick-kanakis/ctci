package Moderate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nicolas on 14/1/2018.
 */
public class Q2 {

    private Map<String, Integer> occurrencesMap = new HashMap<>();
    private double documentSize;

    public void scanDocument(String[] document) {
        documentSize = document.length;

        for (String word : document) {
            if(occurrencesMap.containsKey(word)){
                occurrencesMap.put(word, occurrencesMap.get(word) + 1);
            } else {
                occurrencesMap.put(word, 1);
            }
        }
    }

    public double frequencyOfWord(String word){
        int occurrences = 0;

        if(occurrencesMap.containsKey(word)){
            occurrences = occurrencesMap.get(word);
        }

        return occurrences / documentSize;
    }
}
