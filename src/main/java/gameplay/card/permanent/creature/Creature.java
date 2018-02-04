package gameplay.card.permanent.creature;

import gameplay.card.permanent.Permanent;

public interface Creature extends Permanent{

    enum Species {
        BEAST;
    }

    int getPower();

    int getToughness();

    Species getSpecies();
}
