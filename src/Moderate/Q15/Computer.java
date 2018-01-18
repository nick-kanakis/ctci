package Moderate.Q15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * First check the HITS if one found replace the correctCombination at this place with X, this is done
 * in order to prevent recounting this slot in the next iteration for pseudo-hits.
 *
 * Then count the PSEUDO-HITS. Again if one is found replace the correctCombination at this place with X to avoid recounting.
 */
public class Computer {
    private static final int SLOTS = 4;
    private static final char previousHit = 'X';
    private String correctCombination;

    public Computer() {
        correctCombination = generateGuess();
    }

    public Computer(String correctCombination) {
        this.correctCombination = correctCombination;
    }

    public List<Result> guess(String guess) {
        List<Result> results = new ArrayList<>();
        char[] guessCharArray = guess.toCharArray();
        char[] correctCombinationCharArray = correctCombination.toCharArray();

        // Search for hits
        for (int i = 0; i < SLOTS; i++) {
            if(guessCharArray[i] == correctCombinationCharArray[i]){
                results.add(Result.HIT);
                /* X is used to mark that this slot was a hit and should not be counted as a Pseudo-hit in the future*/
                correctCombinationCharArray[i] = previousHit;
            }
        }
        /*
        * This can be done in O(n) using an extra array to keep the frequency of colors.
        * */
        // Search for pseudoHit
        for (int i = 0; i < SLOTS; i++) {
            for (int j = 0; j < SLOTS; j++) {
                //Do not count itself
                if(i==j)
                    continue;
                if(guessCharArray[i] == correctCombinationCharArray[j]){
                    results.add(Result.PSEUDO_HIT);
                    /* X is used to mark that this slot was a pseudo hit and should not be
                    counted again in the future*/
                    correctCombinationCharArray[j] = previousHit;
                }
            }
        }
        return results;
    }

    private String generateGuess() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < SLOTS; i++) {
            int nextColor = random.nextInt() % 4;
            sb.append(Color.getColor(nextColor));
        }
        return sb.toString();
    }
}
