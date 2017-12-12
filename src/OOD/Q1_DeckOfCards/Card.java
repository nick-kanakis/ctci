package OOD.Q1_DeckOfCards;

/**
 * Manages the type/calculateValue/availability of card.
 */
public abstract class Card {

    protected Suit type;
    private boolean isAvailable = true;
    //Value of the card
    protected int faceValue;

    public Card(Suit type, int faceValue) {
        this.type = type;
        this.faceValue = faceValue;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void markUnavailable(){
        isAvailable = false;
    }

    public void markAvailable(){
        isAvailable = true;
    }

    /*SOS Abstract class. Despite interface that give a blueprint for each class that implements them,
    * in abstract class you have a concrete class with one (or more) abstract methods. These methods have to be
    * implemented by the next class that extends the abstract class */
    public abstract int calculateValue();

}
