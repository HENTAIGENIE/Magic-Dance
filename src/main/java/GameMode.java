import java.util.Random;

public class GameMode {

    // Draw Cards Method
    public void drawCards(Player player, int numOfCards) {

        Random rand = new Random();
        int size = player.getDeck().length;
        int firstIndexToAdd = player.getHand().length;
        int randomNum;

        for (int i = firstIndexToAdd; i < firstIndexToAdd + numOfCards; i++){
            randomNum = rand.nextInt(size);
            player.setHand(i, player.getDeckElement(randomNum));
            deleteAndCollapseArray(player.getDeck(), randomNum);
            size--;
        }

    }

    // Function to delete an element and then collapse the array | idk any other way to resize an array
    // than creating a new array with a different size and putting it in that | this won't matter if we do switch from
    // arrays to something else
    public void deleteAndCollapseArray(int[] array, int index) {

        // create the temporary array and set the proper element to zero
        int size = array.length;
        int[] tempCopy = array;
        int [] transferCopy = new int[size - 1];
        tempCopy[index] = 0;

        // copy every element but the one deleted over to the temp array
        for (int i = 0; i < size - 1 ; i++) {
            if (tempCopy[i] > 0)
                transferCopy[i] = tempCopy[i];
        }

        // resize the original deck, then move the contents back in it
        array = new int[size - 1];
        for (int i = 0; i < size - 1; i++){
            array[i] = transferCopy[i];
        }

    }

    //

    // Instantiate the players
    public Player Robot = new Player() {

    };

    public Player Player1 = new Player() {

    };

    // Beginning Phase

}
