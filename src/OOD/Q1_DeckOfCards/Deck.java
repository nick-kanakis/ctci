package OOD.Q1_DeckOfCards;

import java.util.ArrayList;
import java.util.Random;

/**
 * Manages the cards (create, deal, keep track of size etc.)
 */
public class Deck<T extends Card> {
    private ArrayList<T> cards;
    int dealtCardsIndex = 0;

    public void createNewDeckOfCards(ArrayList<T> cards) {
        cards = this.cards;
    }

    public T dealCard() {
        if (dealtCardsIndex >= cards.size()) {
            //there are no cards left in the deck
        }
        dealtCardsIndex++;

        //return random(?? Do we need it??) card that is available
        Random nextCard = new Random();
        int index = nextCard.nextInt(cards.size());
        T card = cards.get(index);
        while (!card.isAvailable()) {
            index = nextCard.nextInt(cards.size());
            card = cards.get(index);
        }
        return card;
    }

    public void shuffle() {
        //shuffles the cards list
    }


}
