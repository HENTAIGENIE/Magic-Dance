import java.util.Arrays;

public class Player {
    // The Essentials
    private int life = 20;
    private int[] deck = new int[60];
    private int[] hand = new int[7];
    private int[] grave = new int[60];

    //Getters
    public int getLife(){
        return life;
    }
    public int[] getDeck(){
        return Arrays.copyOf(deck, deck.length);
    }
    public int[] getHand(){
        return Arrays.copyOf(hand, hand.length);
    }
    public int[] getGrave(){
        return Arrays.copyOf(grave, grave.length);
    }

    //Setters
    public void setLife(int newLife){
        life = newLife;
    }
    public void setDeck(int index, int newElement){
        deck[index] = newElement;
    }
    public void setHand(int index, int newElement){
        hand[index] = newElement;
    }
    public void setGrave(int index, int newElement){
        grave[index] = newElement;
    }


    // The Actions

}
