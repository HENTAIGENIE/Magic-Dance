package gameplay.zone;

import gameplay.card.Card;

import java.util.ArrayList;

public class Zone {

    private String zoneName;

    public String getZoneName(){
        return zoneName;
    }

    public void setZoneName(String name){
        zoneName = name;
    }

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
        destination.addCard(this.cards.get(index));
        this.cards.remove(index);
    }

    /**
     * Overloaded "moveCard" method, uses card reference instead of index
     *
     * @param cardToMove reference of card to be moved
     * @param destination zone the card is to be moved to
     */
    public void moveCard(Card cardToMove, Zone destination){
        int indexOfCard = this.cards.indexOf(cardToMove);
        destination.addCard(this.cards.get(indexOfCard));
        this.cards.remove(indexOfCard);
    }



    /**
     * Adds a reference of a card to the inventory of cards in this zone and updates the
     * currentZone of the card to this zone
     * @param cardToAdd reference of card object to be added
     */
    public void addCard(Card cardToAdd){
        cardToAdd.setCurrentZone(this);
        this.cards.add(cardToAdd);
    }


}
