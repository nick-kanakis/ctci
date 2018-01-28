package Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Nicolas on 28/1/2018.
 */
public class Q17 {

    public static HashMap<String, Boolean> searchAll(String big, String[] small) {
          /*
          * Create a Map with key every unique Character in big String and value the list of all positions in the string.
          * This map will be used to find the starting point of each small search (And avoid searching small strings
          * that do not exist at all
          * */

        char[] bigChars = big.toCharArray();
        HashMap<Character, ArrayList<Integer>> bigStringMap = createBigStringMap(bigChars);

        return searchWords(bigStringMap, small, bigChars);
    }

    private static HashMap<Character,ArrayList<Integer>> createBigStringMap(char[] bigChars) {
        HashMap<Character, ArrayList<Integer>> bigStringMap = new HashMap<>();
        for (int i = 0; i < bigChars.length; i++) {

            if(bigStringMap.containsKey(bigChars[i])){
                bigStringMap.get(bigChars[i]).add(i);
            } else {
                ArrayList<Integer> positions = new ArrayList<>();
                positions.add(i);
                bigStringMap.put(bigChars[i], positions);
            }
        }
        return bigStringMap;
    }

    private static HashMap<String,Boolean> searchWords(HashMap<Character, ArrayList<Integer>> bigStringMap, String[] smallWords, char[] bigChars) {

        HashMap<String,Boolean> resultMap = new HashMap<>();

        for (String smallWord : smallWords) {
            /*
            *  Get the first Character of the small word, and based on that find all possible positions
            *  to start searching the small word in the big word.
            * */
            ArrayList<Integer> possiblePositions = bigStringMap.get(smallWord.charAt(0));
            resultMap.put(smallWord, doesItExist(possiblePositions, bigChars, smallWord.toCharArray()));
        }
        return resultMap;
    }

    private static Boolean doesItExist(ArrayList<Integer> possiblePositions, char[] bigChars, char[] smallChars) {
        //There are no positions to search so the small word does not exist
        if(possiblePositions== null || possiblePositions.size() == 0)
            return false;

        for (Integer possibleStartingPosition : possiblePositions) {
            char[] subStringOfBig = Arrays.copyOfRange(bigChars, possibleStartingPosition, possibleStartingPosition+smallChars.length);

            if(Arrays.equals(subStringOfBig, smallChars))
                return true;
        }
        return false;
    }

}
