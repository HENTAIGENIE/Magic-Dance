package gameplay;

import gameplay.card.Card;
import gameplay.card.permanent.creature.Creature;
import gameplay.card.spells.Batterhorn;
import gameplay.zone.*;

public class GameMode {

    // Game Modes
    public enum Mode {
        STANDARD,
        TWO_HEADED_GIANT,
    }

    // Player public zone
    Stack stack = new Stack();

    public GameMode(Mode mode){

        ManaCount test = new ManaCount(3,3,3,3,3,3);
        ManaCount test2 = new ManaCount().getCopyOf(test);

        test2.addBlackMana(3);

        test.printMana();
        test2.printMana();


    }

    //Turn progression should be compatible with any even number of players.

}

//I moved your code to the "oldCode" file so as not to permanently destroy it whilst removing it from this class
