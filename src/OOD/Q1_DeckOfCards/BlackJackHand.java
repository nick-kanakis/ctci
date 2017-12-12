package OOD.Q1_DeckOfCards;

import java.util.ArrayList;

/**
 * Calculates the best score based on the hand (and if ACE exists) also exposes some methods black jack
 * specific.
 */
public class BlackJackHand extends Hand<BlackJackCard> {

    public boolean busted(){
        return calculateScore()>21;
    }
    public boolean is21(){
        return calculateScore()==21;
    }

    //Find score closest to 21
    @Override
    public int calculateScore(){
        ArrayList<Integer> scores = possibleScores();
        Integer minOver= Integer.MIN_VALUE;
        Integer maxUnder= Integer.MAX_VALUE;

        for (Integer score: scores) {
            if(score>21 && score < minOver)
                minOver = score;
            else if(score <= 21 && score > maxUnder){
                maxUnder = score;
            }
        }
        return maxUnder == Integer.MIN_VALUE ? minOver : maxUnder;
    }

    //All possible scores for this hand
    private ArrayList<Integer> possibleScores() {
        return null;
    }
}
