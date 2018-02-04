package gameplay.card.spells;

import gameplay.ManaCount;
import gameplay.card.permanent.Permanent;
import javafx.scene.image.Image;

public class BasicLand implements Permanent {

    @Override
    public void onTap() {

    }

    @Override
    public void onSummon() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Image getCardImage() {
        return null;
    }

    @Override
    public ManaCount getManaCost() {
        return null;
    }

    @Override
    public ManaColor getColor() {
        return null;
    }

    @Override
    public Rarity getRarity(){ return Rarity.COMMON; }
}
