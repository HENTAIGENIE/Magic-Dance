package gameplay;

import gameplay.card.Card;
import gameplay.zone.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Player {

    // Attributes
    private int life;
    private int poisonCounters;

    // Player private zones
    private Library library = new Library();
    private Hand hand = new Hand();
    private Graveyard graveyard = new Graveyard();
    private Battlefield battlefield = new Battlefield();
    private Exile exile = new Exile();
    private Command command = new Command();
    private AWOL awol = new AWOL();


    // Accessors
    public int getPoisonCounters() {
        return poisonCounters;
    }

    public Library getLibrary() {
        return library;
    }

    public Hand getHand() {
        return hand;
    }

    public Graveyard getGraveyard() {
        return graveyard;
    }

    public Battlefield getBattlefield() {
        return battlefield;
    }

    public Exile getExile() {
        return exile;
    }

    public Command getCommand() {
        return command;
    }

    public AWOL getAwol() {
        return awol;
    }

    public int getLife() {
        return life;
    }

    // Constructor
    public Player(){

        life = 20;
        poisonCounters = 0;

    }

    // Public interface

    /**
     * Copies a random card from the library, moves it to the players hand, and then
     * removes the card from the library
     * @param numberOfCards number of cards to be drawn and moved into the players hand
     */
    public void draw(int numberOfCards){

        for (int i = 0; i < numberOfCards; i++){
            Random randomNumber = new Random();
            this.library.moveCard((randomNumber.nextInt(this.library.getCards().size()) + 1), this.hand);
        }
    }



    //Implementation

}
