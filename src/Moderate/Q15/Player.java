package Moderate.Q15;

import java.util.List;
import java.util.Random;

/**
 * Randomly selects a combination and asks the computer about the result
 */
public class Player {
    private static final int SLOTS = 4;

    public int askQuestion(Computer computer) {

        int tries = 0;
        boolean hasWon = false;

        while (!hasWon) {
            tries++;
            List<Result> results = computer.guess(generateGuess());

            if (results.size() == 4) {
                for (Result result : results) {
                    if (result != Result.HIT)
                        break;
                    hasWon = true;
                }
            }
        }

        return tries;
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
