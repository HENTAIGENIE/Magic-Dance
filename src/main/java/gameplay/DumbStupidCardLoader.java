package gameplay;

import gameplay.card.Card;
import gameplay.card.spells.*;
import java.util.ArrayList;

public class DumbStupidCardLoader {

    private static ArrayList<Card> loadedCards = new ArrayList<Card>(0);

    public static ArrayList<Card> getLoadedCards() {
        return loadedCards;
    }

    public DumbStupidCardLoader(){
        //Fucking dumb, idiotic, class loader only in existence for the time being.

        {   //Creatures
            loadedCards.add(new Batterhorn());
        }

        {   //Instants
            loadedCards.add(new PunishTheEnemy());
        }

        {   //Lands

        }
    }

}
