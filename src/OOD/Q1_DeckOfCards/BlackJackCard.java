package OOD.Q1_DeckOfCards;

/**
 * You expose new methods that return the minValue and the maxValue for cards that are aces
 */
public class BlackJackCard extends Card{

    public BlackJackCard(Suit type, int faceValue) {
        super(type, faceValue);
    }

    @Override
    public int calculateValue() {
        if(isAce())
            return 1;
        //Cards with faces have value 11 - 13
        else if(faceValue>=11)
            return 10;
        else return faceValue;
    }

    private boolean isAce() {
        return faceValue==1;
    }

    public int minValue(){
        if(isAce())
            return 1;
        else return calculateValue();
    }

    public int maxValue(){
        if(isAce())
            return 11;
        else return calculateValue();
    }
}
