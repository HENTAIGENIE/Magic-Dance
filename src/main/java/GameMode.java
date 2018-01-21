import java.util.Random;

public class GameMode {

    // FUN!-ction Area
    public void shuffleDeck(Player player) {

        int size = player.getDeck().length; //<-- Changed to use getter

        // Make an int array of 'size' items, then make sure each item equals 0
        int[] poop = new int[size];
        for (int i = 0; i < size; i++) {
            poop[i] = 0;
        }

        /* loop through deck starting at item 0 going up to item size - 1, using counter 'I'.
           choose a random number in the interval [1, 'size' - 'I'], 'I' being the counter for the loop above
           within this loop, loop through the poop array, until the 'rNum' zero items have been counted, then set the last counted
           one equal to player.deck[I]
        */

        int count;                                                  // variable used to count the number of poop items equal to zero
        Random rand = new Random();                                 // Random type to create the random number

        for (int I = 0; I < size; I++) {
            count = rand.nextInt(size - I) + 1;
            int i = 0;                                              // variable used to loop through poop
            while (count > 0) {
                if (poop[i] > 0) {
                    count--;
                }
                if (count == 0) {
                    poop[i] = player.getDeck()[I]; //<-- Changed to use a getter
                }
                i++;
            }
        }
    } // end of randomizeDeck()

    // Instantiate the players
    public Player Robot = new Player() {

    };

    public Player Player1 = new Player() {

    };

    // Beginning Phase - Part 1: Choose your decks - Might be Part 2 depending on loop stuff needed for UI, idk


}
