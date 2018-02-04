package gameplay.zone;

import gameplay.card.Card;

import java.util.ArrayList;

public class Zone {

    private ArrayList<Card> cards = new ArrayList<Card>(0);

    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * Copies the specified element of this zone's card array to that of another zone and
     * then removes the element from this array
     *
     * @param index index of card to be moved
     * @param destination zone the card is to be moved to
     */
    public void moveCard(int index, Zone destination){
        destination.getCards().add(this.cards.get(index));
        this.cards.remove(index);
    }


}
