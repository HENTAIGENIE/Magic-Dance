package gameplay;

import gameplay.card.Card;
import gameplay.zone.*;

public class GameMode {

    // Game Modes
    public enum Mode {
        STANDARD,
        TWO_HEADED_GIANT,
    }

    // Constructor
    public GameMode(){

    }

    // Player public zone
    Stack stack = new Stack();

    public static GameMode init(){


        return new GameMode();
    }



    //Turn progression should be compatible with any even number of players.

}
