package gameplay.zone;

import gameplay.card.Card;

import java.util.ArrayList;

public class Zone {

    protected ArrayList<Card> cards = new ArrayList<Card>(0);

    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * Copies the specified element of this zone's card array to that of another zone and
     * then removes the element from this array
     *
     * @param indexOfCard index of card to be moved
     * @param destination zone the card is to be moved to
     */
    public void moveCard(int indexOfCard, Zone destination){
        destination.getCards().add(this.getCards().get(indexOfCard));
        this.cards.remove(indexOfCard);
    }


}
