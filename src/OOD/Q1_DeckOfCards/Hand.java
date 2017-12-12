package OOD.Q1_DeckOfCards;

import java.util.ArrayList;

/**
 * Manages the lifecycle of the cards that are available and any given time at hand of each player.
 */
public class Hand <T extends Card> {
    ArrayList<T> hand ;

    public Hand() {
        this.hand = new ArrayList<>();;
    }

    public void addCard(T card){
        hand.add(card);
    }

    public void removeCard(T card){
        hand.remove(card);
    }

    public int calculateScore(){
        int score = 0;

        for (T card : hand){
            score+= card.calculateValue();
        }
        return score;
    }
}
