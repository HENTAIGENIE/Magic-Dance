package gameplay;

import java.util.Random;

public class GameMode {

    public GameMode(){

    }

    public void drawCards(Player player, int numOfCards) {

        Random rand = new Random();

        int size = player.getDeck().length;
        int firstIndexToAdd = player.getHand().length;              // hand will only ever be long enough to hold its cards, so the first index to add these new cards will be 1 + the size of the current hand
        int randomNum;

        for (int i = firstIndexToAdd; i < firstIndexToAdd + numOfCards; i++) { // repeat numOfCards times
            randomNum = rand.nextInt(size);                         // create random number from 0 to the size of the deck
            player.setHand(i, player.getDeckElement(randomNum));    // push this card to the hand array
            removeArrayElement(player.getDeck(), randomNum);        // delete the vacant space in the deck
            size--;                                                 // reduce the size variable for the next loop so that randomNum is an appropriate number
        }

    }

    // Function to delete an element and then collapse the array | idk any other way to resize an array
    // than creating a new array with a different size and putting it in that | this won't matter if we do switch from
    // arrays to something else
    public void removeArrayElement(int[] array, int index) {

        // create the temporary array and set the proper element to zero
        int size = array.length;
        int[] tempCopy = array;
        tempCopy[index] = 0;

        // resize array and delete proper element by moving all elements back into the original only if the element is > 0
        array = new int[size - 1];                                  // resize

        for ( int i = 0; i < size - 1; i++ ) {                      // move elements back if > 0
            if (tempCopy[i] > 0) {
                array[i] = tempCopy[i];
            }
        }

    }

    // Instantiate the players
    public Player Robot = new Player() {

    };

    public Player Player1 = new Player() {

    };

    public void testMethod(){

    }


}
