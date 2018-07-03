package Hard;

import java.util.*;

/**
 * First create a map of all possible words with wildcards and as values the complete words that can be generated by that wildcard.
 *
 * Given a starting word and a ending word, as well as the map created previous do a DFS to search for the path. Mark visited nodes,
 * in order to avoid revisiting them again.
 *
 * The search part can be optimized by doing a bidirectional BFS.
 */
public class Q22 {

    public static List<String> wordTransformation(String start, String end, String[] dictionary){
        HashMap<String, List<String>> oneCharAwayMap = createOneCharAwayMap(dictionary);
        HashSet<String> visited = new HashSet<>();
        return depthFirstSearch(start, end, oneCharAwayMap, visited);
    }

    /*
    * Create a Map where the keys are words with wildcard added to every position and keys are the complete words
    * that can be matched to this wildcard
    * eg:
    * Given : bill, ball billy
    *  KEY | VALUE
    *  _ill: bill
    *  b_ll: bill, ball
    *  bi_l: bill
    *  bil_: bill, billy
    *
    * */
    private static HashMap<String, List<String>> createOneCharAwayMap(String[] dictionary) {
        HashMap<String,  List<String>> oneCharAwayMap = new HashMap<>();
        for (String word : dictionary) {
            List<String> wordsWithWildcard = addWildcardToEverySpot(word);
            for (String wildcardWord : wordsWithWildcard) {
                if(oneCharAwayMap.containsKey(wildcardWord)){
                    oneCharAwayMap.get(wildcardWord).add(word);
                } else {
                    ArrayList<String> originalWords = new ArrayList<>();
                    originalWords.add(word);
                    oneCharAwayMap.put(wildcardWord, originalWords);
                }
            }
        }
        return oneCharAwayMap;
    }

    /*
    * Given a world add _ (wildcard) to every position available and return the list
    * */
    private static List<String> addWildcardToEverySpot(String word) {
        ArrayList<String> wildcards = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            wildcards.add(word.substring(0,i) + "_" + word.substring(i+1));
        }
        return wildcards;
    }

    private static ArrayList<String> getValidWords(String word, HashMap<String, List<String>> oneCharAwayMap){
        List<String> wildCardWords = addWildcardToEverySpot(word);
        ArrayList<String> result = new ArrayList<>();

        for (String wildCardWord : wildCardWords) {
            List<String> oneCharAwayWords = oneCharAwayMap.get(wildCardWord);
            for (String oneCharAwayWord : oneCharAwayWords) {
                /*Do not add the initial word in the results*/
                if(!oneCharAwayWord.equals(word)){
                    result.add(oneCharAwayWord);
                }
            }
        }
        return result;
    }

    /*
    * Do a depth first search to find the "end" word and return the path to from "start" word.
    * */
    private static  LinkedList<String> depthFirstSearch(String start, String end, HashMap<String, List<String>> oneCharAwayMap, HashSet<String> visited) {
        if(start.equals(end)){
            LinkedList<String> path = new LinkedList<>();
            path.addFirst(start);
            return path;
        } else if (visited.contains(start)){
            return null;
        }

        visited.add(start);
        ArrayList<String> words = getValidWords(start, oneCharAwayMap);
        for (String word : words) {
            LinkedList<String> path = depthFirstSearch(word, end, oneCharAwayMap, visited);
            if (path != null){
                path.addFirst(start);
                return path;
            }
        }
        return null;
    }

}