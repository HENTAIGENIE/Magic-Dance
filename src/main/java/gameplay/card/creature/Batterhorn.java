package gameplay.card.creature;

import javafx.scene.image.Image;

public class Batterhorn implements Creature {

    @Override
    public int getPower() {
        return 4;
    }

    @Override
    public int getToughness() {
        return 3;
    }

    @Override
    public void onSummon() {

    }

    @Override
    public void onTap() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public Image getCardImage() {
        return null;
    }
}
