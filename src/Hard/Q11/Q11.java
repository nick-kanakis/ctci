package Hard.Q11;

/**
 * If current pair is better (less distance) than the current best swap.
 * position1 is the position of word1
 * position2 is the position of word2
 *
 * Always check if current is less than best location
 */
public class Q11 {

    public static LocationPair minDistanceRunOnce(String[] text, String word1, String word2){
        LocationPair bestLocation = new LocationPair(-1, -1);
        LocationPair currentLocation = new LocationPair(-1, -1);

        for (int i = 0; i < text.length; i++) {

            if(text[i].equals(word1)){
               currentLocation.position1 = i;
               bestLocation.updateMin(currentLocation);
            } else if(text[i].equals(word2)){
                currentLocation.position2 = i;
                bestLocation.updateMin(currentLocation);

            }
        }
        return bestLocation;
    }
}
